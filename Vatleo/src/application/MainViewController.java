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
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
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
import kcl.ac.uk.xtext.videoAnnotationsDSL.AnnotatedVideo;
import kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation;
import kcl.ac.uk.xtext.videoAnnotationsDSL.VideoAnnotationsDSLFactory;

public class MainViewController implements Initializable {

	@FXML private MediaView mediaView;
	@FXML private Button playPauseButton;
	@FXML private Slider timeSlider;
	@FXML private Label timeStamp;
	@FXML private TextField textField;
	@FXML private Button addAnnotationButton;
	@FXML private TextField fromTime;
	@FXML private TextField toTime;
	@FXML private MenuItem openItem;
	@FXML private TableView<Annotation> tableView;
	@FXML private TableColumn<Annotation, String> labelColumn;
	@FXML private TableColumn<Annotation, String> fromTimeColumn;
	@FXML private TableColumn<Annotation, String> toTimeColumn;
	
	private MediaPlayer mediaPlayer;
	private Media media;
	private FileChooser fileChooser;
	private XtextParser parser;
	private ObservableList<Annotation> annotations;
	private AnnotatedVideo anAnnotatedVideo;
	
	private int fromSecond;
	private int toSecond;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		setupDSL();
		
		generateMediaPlayer();
		
		generateOpenButton();
		
		generateTableView();
	}
	
	private void setupDSL() {
		
		parser = new XtextParser();
	}

	private void generateMediaPlayer() {
		// Init the media objects
		String path = new File("src/media/video.mp4").getAbsolutePath();
		media = new Media(new File(path).toURI().toString());
		mediaPlayer = new MediaPlayer(media);
		mediaView.setMediaPlayer(mediaPlayer);
		resetPlayer();
		
		// Preserve the ratio of the video
		DoubleProperty width = mediaView.fitWidthProperty();
		DoubleProperty height = mediaView.fitHeightProperty();
		width.bind(Bindings.selectDouble(mediaView.sceneProperty(), "width"));
		height.bind(Bindings.selectDouble(mediaView.sceneProperty(), "height"));
		
		// Adding the possibility to seek the media player.
		timeSlider.valueProperty().addListener(new InvalidationListener() {

			@Override
			public void invalidated(Observable observable) {
				
				if (timeSlider.isPressed()) {
					mediaPlayer.seek(mediaPlayer.getMedia().getDuration().multiply(timeSlider.getValue() / 100));
				}
			}
		});
	}

	private void generateOpenButton() {
		fileChooser = new FileChooser();
		
		openItem.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				mediaPlayer.pause();
				File file = fileChooser.showOpenDialog(null);
				
				if (file != null) {
					try {
						media = new Media(file.toURI().toURL().toExternalForm());
						mediaPlayer = new MediaPlayer(media);
						mediaView.setMediaPlayer(mediaPlayer);
						
						resetPlayer();
					} catch (MalformedURLException e1) {
						e1.printStackTrace();
					}
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
				removeAnnotationFromDataFile(getStringDSL(tableView.getSelectionModel().getSelectedItem()));
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
		
		tableView.setItems(getAnnotations());
		tableView.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (mouseEvent.getButton().equals(MouseButton.PRIMARY)) {
                	
                    if (mouseEvent.getClickCount() == 2) {
                    	
                    	showContentDialog();
                    }
                }
                
                if (mouseEvent.getButton().equals(MouseButton.SECONDARY)) {
                    
                    contextMenu.show(tableView, mouseEvent.getScreenX() , mouseEvent.getScreenY());
                }
            }
        });
	}
	
	public ObservableList<Annotation> getAnnotations() {
		annotations = FXCollections.observableArrayList();
		
		anAnnotatedVideo = VideoAnnotationsDSLFactory.eINSTANCE.createAnnotatedVideo();		
		
        // The name of the file to open.
        String fileName = "data.txt";

        // This will reference one line at a time
        String line = null;
        
        try {
			new FileOutputStream("data.txt", true).close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
            	Reader stringReader = new StringReader(line);
            	anAnnotatedVideo = (AnnotatedVideo) parser.parse(stringReader);
            	annotations.add(anAnnotatedVideo.getAnnotations().get(0));
            }   

            // Always close files.
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
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
				playPauseButton.setText("Pause");
			} else {
				mediaPlayer.pause();
				playPauseButton.setText("Play");
			}
		}
		
		if (status == Status.PAUSED || status == Status.STOPPED || status == Status.HALTED || status == Status.READY) {
			mediaPlayer.play();
			playPauseButton.setText("Pause");
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
				
				if (!fromTime.getText().equals("")) {
					toTime.setText(timeStamp.getText());
					toSecond = currentTimeInSeconds;
				}
			}
		});
	}
	
	/**
	 * A method that creates an annotation and adds it to the tree view.
	 */
	public void addAnnotation() {
		String testString = "from " + fromSecond + " to " + toSecond + " " + textField.getText();
		Reader test = new StringReader(testString);
				
		try {
			anAnnotatedVideo = (AnnotatedVideo) parser.parse(test);
			annotations.add(anAnnotatedVideo.getAnnotations().get(anAnnotatedVideo.getAnnotations().size() - 1));
			
			try (FileWriter fw = new FileWriter("data.txt", true) ;
				    BufferedWriter bw = new BufferedWriter(fw);
				    PrintWriter out = new PrintWriter(bw))
				{
				    out.println(testString);
				} catch (IOException e) {
					e.printStackTrace(); //TODO: add exception
				}
			
			System.out.println(anAnnotatedVideo.getAnnotations());
			
			// Clearing the view
			tableView.refresh();
			textField.clear();
			fromTime.clear();
			toTime.clear();
		} catch (ParseException e) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Exception Dialog");
			alert.setHeaderText("Provided input contains syntax errors.");
			alert.setContentText("Try to edit the input to match the DSL.");

			Exception ex = new ParseException("Provided input contains syntax errors.");

			// Create expandable Exception.
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			ex.printStackTrace(pw);
			String exceptionText = sw.toString();

			Label label = new Label("The exception stacktrace was:");

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
	
	/**
	 * A method to reset the view and add the listener for the new mediaPlayer.
	 */
	public void resetPlayer() {
		
		mediaPlayer.seek(mediaPlayer.getMedia().getDuration().multiply(0 / 100));
		timeSlider.setValue(0);
		timeStamp.setText("00:00");
		playPauseButton.setText("Play");
		
		// Controlling the view to update the time slider and the time label.
		mediaPlayer.currentTimeProperty().addListener(new InvalidationListener() {
			public void invalidated(Observable observerable) {
				updateTimeSlider();
				updateTimeLabel();
			}
		});
	}
	
	/**
	 * A method that controls pauses the video and sets the current time to starting time for the Annotation.
	 */
	public void annotate() {
		
		fromTime.setText(timeStamp.getText());
		fromSecond = (int) mediaPlayer.getCurrentTime().toSeconds();
		mediaPlayer.pause();
		playPauseButton.setText("Play");
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
	 * @throws IOException
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
		
		return "from " + anAnnotation.getFromTime().getSec() + " to " + anAnnotation.getToTime().getSec() + 
				" annotate(" + anAnnotation.getId() + "," + anAnnotation.getSender() + "," + anAnnotation.getType().getType() + "," + 
				anAnnotation.getScope().getScope() + "," + anAnnotation.getFocus().getFocus() + ",\"" + anAnnotation.getContent() + "\"," + 
				anAnnotation.getTarget() + ")";
	}
	
}