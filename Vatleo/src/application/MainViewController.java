package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import org.eclipse.xtext.parser.ParseException;

import javafx.application.Platform;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayer.Status;
import javafx.scene.media.MediaView;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.util.Duration;
import kcl.ac.uk.xtext.videoAnnotationsDSL.AnnotatedVideo;
import kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation;
import kcl.ac.uk.xtext.videoAnnotationsDSL.VideoAnnotationsDSLFactory;

public class MainViewController implements Initializable {

	@FXML private MediaView mediaView;
	@FXML private Slider timeSlider;
	@FXML private Label timeStamp;
	@FXML private Button playPauseButton;
	@FXML private Button addAnnotationButton;
	@FXML private Button backwardButton;
	@FXML private Button forwardButton;
	@FXML private TextField textField;
	@FXML private TextField fromTime;
	@FXML private TextField toTime;
	@FXML private MenuItem openItem;
	@FXML private MenuItem loadAnnotationMenuItem;
	@FXML private MenuItem saveAnnotationsMenuItem;
	@FXML private MenuItem cutMenuItem;
	@FXML private MenuItem copyMenuItem;
	@FXML private MenuItem pasteMenuItem;
	@FXML private MenuItem saveAsMenuItem;
	@FXML private CheckMenuItem editAnnotationCheckMenuItem;
	@FXML private CheckMenuItem	viewAnnotationCheckMenuItem;
	@FXML private TableView<Annotation> tableView;
	@FXML private TableColumn<Annotation, String> labelColumn;
	@FXML private TableColumn<Annotation, String> fromTimeColumn;
	@FXML private TableColumn<Annotation, String> toTimeColumn;	
	
	private MediaPlayer mediaPlayer;
	private Media media;
	private Media demoMedia;
	private FileChooser fileChooser;
	private File dataFile;
	
	private VATParser parser;
	private ObservableList<Annotation> annotations;
	private AnnotatedVideo anAnnotatedVideo;
	private boolean toTimeFocused, fromTimeFocused;
	private String annotationsDSL;
		
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		setupDSL();
		
		generateMediaPlayer();
		
		generateMenuItems();
		
		generateTableView();
		
		generateDemoObjectsForAnnotations();
	}
	
	private void setupDSL() {
		
		parser = new VATParser();
	}

	private void generateMediaPlayer() {
		// Init the media objects
		demoMedia = new Media(new File(new File("src/media/kcl.ac.uk.vat.demo.mp4").getAbsolutePath()).toURI().toString());
		mediaPlayer = new MediaPlayer(demoMedia);
		mediaView.setMediaPlayer(mediaPlayer);
		resetPlayer();
		
		playPauseButton.setDisable(true);
		timeSlider.setDisable(true);
		textField.setDisable(true);
		fromTime.setDisable(true);
		toTime.setDisable(true);
		addAnnotationButton.setDisable(true);
		tableView.setDisable(true);
		editAnnotationCheckMenuItem.setDisable(true);
		saveAnnotationsMenuItem.setDisable(true);
		cutMenuItem.setDisable(true);
		copyMenuItem.setDisable(true);
		pasteMenuItem.setDisable(true);
		loadAnnotationMenuItem.setDisable(true);
		saveAsMenuItem.setDisable(true);
		viewAnnotationCheckMenuItem.setDisable(true);
		backwardButton.setDisable(true);
		forwardButton.setDisable(true);

		// Preserve the ratio of the video
		DoubleProperty width = mediaView.fitWidthProperty();
		DoubleProperty height = mediaView.fitHeightProperty();
		width.bind(Bindings.selectDouble(mediaView.parentProperty(), "width"));
		height.bind(Bindings.selectDouble(mediaView.parentProperty(), "height"));
		
		mediaView.setPreserveRatio(true);
		
		// Adding the possibility to seek the media player.
		timeSlider.valueProperty().addListener(new InvalidationListener() {

			@Override
			public void invalidated(Observable observable) {
				
				if (timeSlider.isPressed()) {
					mediaPlayer.seek(mediaPlayer.getMedia().getDuration().multiply(timeSlider.getValue() / 100));
					timeStamp.setText(convertSecToTime((int)mediaPlayer.getCurrentTime().toSeconds()));

					if (toTimeFocused == true) {
						toTime.setText(timeStamp.getText());
					} else if (fromTimeFocused == true) {
						fromTime.setText(timeStamp.getText());
					}
				}
			}
		});
		
		fromTime.focusedProperty().addListener(new InvalidationListener() {

			@Override
			public void invalidated(Observable observable) {
				fromTimeFocused = true;
				toTimeFocused = false;
			}
		});
		
		toTime.focusedProperty().addListener(new InvalidationListener() {

			@Override
			public void invalidated(Observable observable) {
				fromTimeFocused = false;
				toTimeFocused = true;
			}
			
		});
		
		textField.focusedProperty().addListener(new InvalidationListener() {

			@Override
			public void invalidated(Observable observable) {
				fromTimeFocused = false;
				toTimeFocused = false;
			}
			
		});
		
		fromTimeFocused = false;
		toTimeFocused = false;
	}

	private void generateMenuItems() {
		fileChooser = new FileChooser();
		
		openItem.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent e) {
				mediaPlayer.pause();
				File file = fileChooser.showOpenDialog(null);
				
				if (file != null) {
					try {
						media = new Media(file.toURI().toURL().toExternalForm());
						mediaPlayer = new MediaPlayer(media);
						mediaView.setMediaPlayer(mediaPlayer);
						
						resetPlayer();
						
						dataFile = null;
						
						playPauseButton.setDisable(false);
						timeSlider.setDisable(false);
						textField.setDisable(false);
						fromTime.setDisable(false);
						toTime.setDisable(false);
						addAnnotationButton.setDisable(false);
						tableView.setDisable(false);
						loadAnnotationMenuItem.setDisable(false);
						saveAsMenuItem.setDisable(false);
					} catch (MalformedURLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		
		loadAnnotationMenuItem.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				mediaPlayer.pause();
				FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Annotations files (*.videoannotationsdsl)", "*.videoannotationsdsl");
	            fileChooser.getExtensionFilters().add(extFilter);
				File file = fileChooser.showOpenDialog(null);
				
				if (file != null) {
					dataFile = file;
					getAnnotations(dataFile.getAbsolutePath());
					tableView.setItems(annotations);
					saveAnnotationsMenuItem.setDisable(false);
					editAnnotationCheckMenuItem.setDisable(false);
					viewAnnotationCheckMenuItem.setDisable(false);
				}
			}
		});
		
		saveAnnotationsMenuItem.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				
				mediaPlayer.pause();
				saveAnnotationsToFile();
			}
		});
		
		saveAsMenuItem.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				showSaveAsDialog();
			}
		});

		editAnnotationCheckMenuItem.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				
				if (editAnnotationCheckMenuItem.isSelected()) {
					
					addAnnotationButton.setText("Edit");
					addAnnotationButton.setOnAction(new EventHandler<ActionEvent>() {

						@Override
						public void handle(ActionEvent event) {
							Annotation annotationToBeRemoved = tableView.getSelectionModel().getSelectedItem();
							annotationsDSL = annotationsDSL.replace(getStringDSL(annotationToBeRemoved), "");
							addAnnotation();
						}
					});
				} else {
					
					addAnnotationButton.setText("Add annotation");
					addAnnotationButton.setOnAction(new EventHandler<ActionEvent>() {

						@Override
						public void handle(ActionEvent event) {
							
							addAnnotation();
						}
					});
				}
			}
		});
	}

	private void generateTableView() {
		// Setting the table view.
		
		// Setting a context menu for the rows 
		ContextMenu contextMenu = new ContextMenu();
        MenuItem openItem = new MenuItem("Open");
        MenuItem deleteItem = new MenuItem("Remove");
        
        openItem.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				
				showContentDialog();
			}
        	
        });       	
        deleteItem.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				annotationsDSL = annotationsDSL.replace(getStringDSL(tableView.getSelectionModel().getSelectedItem()), "");
				annotations.remove(tableView.getSelectionModel().getSelectedIndex());
			}
        });
        
        contextMenu.getItems().add(openItem);
        contextMenu.getItems().add(deleteItem);
		
		// Label Column
		labelColumn.setMinWidth(75);
		labelColumn.setCellValueFactory(new PropertyValueFactory<>("content"));
		
		// From time column
		fromTimeColumn.setMinWidth(75);
		fromTimeColumn.setCellValueFactory(new Callback<CellDataFeatures<Annotation, String>, ObservableValue<String>>() {	
			@SuppressWarnings({ "unchecked", "rawtypes" }) //TODO: fix the warnings
			public ObservableValue<String> call(CellDataFeatures<Annotation, String> p) {
				return new ReadOnlyObjectWrapper(convertSecToTime(p.getValue().getFromTime().getSec()));
			}
		});
		
		// To time column
		toTimeColumn.setMinWidth(75);
		toTimeColumn.setCellValueFactory(new Callback<CellDataFeatures<Annotation, String>, ObservableValue<String>>() {	
			@SuppressWarnings({ "unchecked", "rawtypes" }) //TODO: fix the warnings
			public ObservableValue<String> call(CellDataFeatures<Annotation, String> p) {
				return new ReadOnlyObjectWrapper(convertSecToTime(p.getValue().getToTime().getSec()));
			}
		});
		
		tableView.setItems(annotations);
		tableView.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (mouseEvent.getButton().equals(MouseButton.PRIMARY)) {
                    if (mouseEvent.getClickCount() == 2) {
                    	
                    	showContentDialog();
                    }
                    
                    if (mouseEvent.getClickCount() == 1 && editAnnotationCheckMenuItem.isSelected()) {
                    	
                    	enableEditingForAnnotation(tableView.getSelectionModel().getSelectedIndex());
                    }
                    
                    if (mouseEvent.getClickCount() == 1 && viewAnnotationCheckMenuItem.isSelected()) {
                    	
                    	seekPlayerToAnnotation(tableView.getSelectionModel().getSelectedIndex());
                    }
                }
                
                if (mouseEvent.getButton().equals(MouseButton.SECONDARY)) {
                    
                    contextMenu.show(tableView, mouseEvent.getScreenX() , mouseEvent.getScreenY());
                }
            }
        });
	}
	
	
	public ObservableList<Annotation> getAnnotations(String filePath) {
		annotations = FXCollections.observableArrayList();
		
		anAnnotatedVideo = VideoAnnotationsDSLFactory.eINSTANCE.createAnnotatedVideo();
		
        // This will reference one line at a time
        String line = null;
        
        try {
			new FileOutputStream(filePath, true).close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(filePath);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String stringFromFile = new String();

            while((line = bufferedReader.readLine()) != null) {
            	stringFromFile = stringFromFile + " " + line;
            }   
            
            annotationsDSL = stringFromFile;
        	anAnnotatedVideo = (AnnotatedVideo) parser.parse(stringFromFile);
        	annotations = FXCollections.observableArrayList(anAnnotatedVideo.getAnnotations());
        	
            // Always close files.
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + filePath + "'");
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + filePath + "'");
        }

		return annotations;
	}

	/**
	 * A method that acts upon the play/pause button.
	 * @param event
	 */
	public void playPause(ActionEvent event) {
		
		Status status = mediaPlayer.getStatus();
		
		if (status == Status.PLAYING) {
			if (mediaPlayer.getCurrentTime().greaterThanOrEqualTo(mediaPlayer.getTotalDuration())) {
				mediaPlayer.seek(mediaPlayer.getStartTime());
				mediaPlayer.play();
				playPauseButton.setText("||");
			} else {
				mediaPlayer.pause();
				playPauseButton.setText(">");
			}
		}
		
		if (status == Status.PAUSED || status == Status.STOPPED || status == Status.HALTED || status == Status.READY) {
			mediaPlayer.play();
			playPauseButton.setText("||");
		}
	}
	
	
	/**
	 * A method that updates the time slider with the current time of the video.
	 */
	public void updateTimeSlider() {
		Platform.runLater(new Runnable() {
			public void run() {
				timeSlider.setValue(mediaPlayer.getCurrentTime().toMillis() / mediaPlayer.getTotalDuration().toMillis() * 100);
			}
		});
	}
	
	
	/**
	 * A method that updates the time label for the video.
	 */
	public void updateTimeLabel() {
		int currentTimeInSeconds = (int) mediaPlayer.getCurrentTime().toSeconds();
		
		Platform.runLater(new Runnable() {
			public void run() {
				timeStamp.setText(convertSecToTime(currentTimeInSeconds));
			}
		});
	}
	
	
	/**
	 * A method that creates an annotation and adds it to the tree view.
	 */
	public void addAnnotation() {
		String testString = "from " + convertTimeToSec(fromTime.getText()) + " to " + convertTimeToSec(toTime.getText()) + " " + textField.getText() + " ";
				
		try {
			anAnnotatedVideo = (AnnotatedVideo) parser.parse(annotationsDSL += testString);
			annotations = FXCollections.observableArrayList(anAnnotatedVideo.getAnnotations());
			tableView.setItems(annotations);
			
			// Clearing the view
			tableView.refresh();
			textField.clear();
			fromTime.clear();
			toTime.clear();
			
			if (annotations.size() < 2 && dataFile == null) {
				Alert alert = new Alert(AlertType.CONFIRMATION);
				alert.setTitle("Alert");
				alert.setHeaderText("Annotations are not linked to any file.");
				alert.setContentText("Would you like to save the annotations to a file?");

				ButtonType buttonTypeOK = new ButtonType("Yes", ButtonData.OK_DONE);
				ButtonType buttonTypeCancel = new ButtonType("Cancel", ButtonData.CANCEL_CLOSE);

				alert.getButtonTypes().setAll(buttonTypeOK, buttonTypeCancel);

				Optional<ButtonType> result = alert.showAndWait();
				if (result.get() == buttonTypeOK){
					showSaveAsDialog();
				}
			}
		} catch (ParseException e) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Exception Dialog");
			alert.setHeaderText("Provided input contains syntax errors.");
			alert.setContentText("Try to edit the input to match the DSL.");

			// Create expandable Exception.
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			String exceptionText = sw.toString();

			Label label = new Label("The syntax errors are:");

			TextArea textArea = new TextArea(exceptionText);
			textArea.setEditable(false);
			textArea.setWrapText(true);

			textArea.setMaxWidth(Double.MAX_VALUE);
			textArea.setMaxHeight(Double.MAX_VALUE);
			GridPane.setVgrow(textArea, Priority.ALWAYS);
			GridPane.setHgrow(textArea, Priority.ALWAYS);

			GridPane expContent = new GridPane();
			expContent.setMaxWidth(Double.MAX_VALUE);
			expContent.add(label, 0, 0);
			expContent.add(textArea, 0, 1);

			// Set expandable Exception into the dialog pane.
			alert.getDialogPane().setExpandableContent(expContent);

			alert.showAndWait();
		}
	}
	
	public void showSaveAsDialog() {
        // Set extension filter
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Annotations files (*.videoannotationsdsl)", "*.videoannotationsdsl");
        fileChooser.getExtensionFilters().add(extFilter);
        
        // Show save file dialog
        File file = fileChooser.showSaveDialog(null);
        
        if(file != null) {
            dataFile = file;
            saveAnnotationsMenuItem.setDisable(false);
            
            FileWriter fileWriter = null;
            
            try {
				fileWriter = new FileWriter(file);
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
            
          saveAnnotationsToFile();
          editAnnotationCheckMenuItem.setDisable(false);
          viewAnnotationCheckMenuItem.setDisable(false);          
        }
	}

	/**
	 * A method to reset the view and add the listener for the new mediaPlayer.
	 */
	public void resetPlayer() {
		
		mediaPlayer.seek(mediaPlayer.getMedia().getDuration().multiply(0 / 100));
		timeSlider.setValue(0);
		timeStamp.setText("00:00");
		playPauseButton.setText(">");
		
		// Controlling the view to update the time slider and the time label.
		mediaPlayer.currentTimeProperty().addListener(new InvalidationListener() {
			public void invalidated(Observable observerable) {
				updateTimeSlider();
				updateTimeLabel();
			}
		});
		
		fromTime.clear();
		toTime.clear();
		textField.clear();
	}
	
	
	/**
	 * A method that controls pauses the video and sets the current time to starting time for the Annotation.
	 */
	public void annotate() {
		
		fromTime.setText(timeStamp.getText());
		mediaPlayer.pause();
		playPauseButton.setText(">");
	}
	
	
	/**
	 * A method to convert the time from seconds to a String time stamp in the format mm:ss.
	 * @param sec The amount of seconds to be converted to a String time stamp.
	 * @return A String that represents the current time in the format mm:ss.
	 */
	public String convertSecToTime(int sec) {
		String time = "";
		
		int minutes = (sec % 3600) / 60;
		int seconds = sec % 60;

		time = String.format("%02d:%02d", minutes, seconds);
		
		return time;
	}
	
	
	/**
	 * A method to convert the time from a time stamp (mm:ss) to seconds.
	 * @param time The time that needs to be converted from String to int
	 * @return An integer that represents the time in seconds.
	 */
	public int convertTimeToSec(String time) {
		int sec = 0;
		
		String[] units = time.split(":");
		int minutes = Integer.parseInt(units[0]);
		int seconds = Integer.parseInt(units[1]);
		sec = 60 * minutes + seconds;		
		
		return sec;
	}
	
	
	public void showContentDialog() {
    	final Stage dialog = new Stage();
        VBox dialogVbox = new VBox(20);
        int index = tableView.getSelectionModel().getSelectedIndex();
        
        dialog.initModality(Modality.APPLICATION_MODAL);
        dialogVbox.getChildren().add(new Text(annotations.get(index).getContent()));
        Scene dialogScene = new Scene(dialogVbox, 300, 200);
        dialog.setScene(dialogScene);
        dialog.show();
	}

	
	/**
	 * A method that removes the Annotation from the data file.
	 * @param anAnnotationToRemove An Annotation to be removed from the data file.
	 */
	public void removeAnnotationFromDataFile(String anAnnotationToRemove) {
		File inputFile = new File("data.txt");
		File tempFile = new File("tempData.txt");

		BufferedReader reader;
		BufferedWriter writer;
		
		try {
			reader = new BufferedReader(new FileReader(inputFile));
			writer = new BufferedWriter(new FileWriter(tempFile));
			
			String currentLine;

			while ((currentLine = reader.readLine()) != null) {
			    String trimmedLine = currentLine.trim();
			    
			    if (trimmedLine.equals(anAnnotationToRemove)) continue;
			    writer.write(currentLine + System.getProperty("line.separator"));
			}
			
			writer.close();
			reader.close();
			tempFile.renameTo(inputFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Get a String of the DSL of an Annotation.
	 * @param anAnnotation An Annotation to be translated into a String in the DSL.
	 * @return A String that represents the DSL of an Annotation.
	 */
	public String getStringDSL(Annotation anAnnotation) {
		if (anAnnotation.getTarget() != null) {
			return "from " + anAnnotation.getFromTime().getSec() + " to " + anAnnotation.getToTime().getSec() + 
				" annotate(" + anAnnotation.getName() + "," + anAnnotation.getSender() + "," + anAnnotation.getType().getType() + "," + 
				anAnnotation.getScope().getScope() + "," + anAnnotation.getFocus().getFocus() + ",\"" + anAnnotation.getContent() + "\"," + 
				anAnnotation.getTarget().getName() + ")";
		} else {
			return "from " + anAnnotation.getFromTime().getSec() + " to " + anAnnotation.getToTime().getSec() + 
					" annotate(" + anAnnotation.getName() + "," + anAnnotation.getSender() + "," + anAnnotation.getType().getType() + "," + 
					anAnnotation.getScope().getScope() + "," + anAnnotation.getFocus().getFocus() + ",\"" + anAnnotation.getContent() + "\")";
		}
	}
	
	
	/**
	 * A method to save all the annotations to the file loaded.
	 */
	public void saveAnnotationsToFile() {
		String annotationsString = "";
		
		for (Annotation anAnnotation : annotations) {
			
			annotationsString += getStringDSL(anAnnotation) + "\n";
		}
		
		try (FileWriter fw = new FileWriter(dataFile.getAbsolutePath()) ;
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
			    out.print(annotationsString);
			} catch (IOException e) {
				e.printStackTrace(); //TODO: add exception
			}
	}
	
	/**
	 * A method that allows selected Annotation to be edited.
	 * @param index The index of the Annotation to be edited.
	 */
	public void enableEditingForAnnotation(int index) {
	
		fromTime.setText(convertSecToTime(annotations.get(index).getFromTime().getSec()));
		toTime.setText(convertSecToTime(annotations.get(index).getToTime().getSec()));
		if (annotations.get(index).getTarget() != null) {
			textField.setText("annotate(" + annotations.get(index).getName() + "," + annotations.get(index).getSender() + "," + annotations.get(index).getType().getType() + "," + 
				annotations.get(index).getScope().getScope() + "," + annotations.get(index).getFocus().getFocus() + ",\"" + annotations.get(index).getContent() + "\"," + 
				annotations.get(index).getTarget().getName() + ")");
		} else {
			textField.setText("annotate(" + annotations.get(index).getName() + "," + annotations.get(index).getSender() + "," + annotations.get(index).getType().getType() + "," + 
					annotations.get(index).getScope().getScope() + "," + annotations.get(index).getFocus().getFocus() + ",\"" + annotations.get(index).getContent() + "\")"); 
		}
	}
	
	/**
	 * A method that seeks the player to the start time of an annotation.
	 * @param index The index of the annotation to be seeked to.
	 */
	public void seekPlayerToAnnotation(int index) {
		
		mediaPlayer.seek(new Duration(annotations.get(index).getFromTime().getSec() * 1000));
	}

	/**
	 * A method that generates demo objects for a new annotation file.
	 */
	public void generateDemoObjectsForAnnotations() {
		
		annotationsDSL = "";
		annotations = FXCollections.observableArrayList();
		anAnnotatedVideo = VideoAnnotationsDSLFactory.eINSTANCE.createAnnotatedVideo();
		tableView.setItems(annotations);
	}

}