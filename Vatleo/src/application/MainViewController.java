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
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import org.eclipse.xtext.parser.ParseException;

import javafx.application.Platform;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
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
import kcl.ac.uk.xtext.generator.AnnotationCompletion;
import kcl.ac.uk.xtext.generator.AnnotationRenderer;
import kcl.ac.uk.xtext.interpreter.Interpreter;
import kcl.ac.uk.xtext.videoAnnotationsDSL.AnnotatedVideo;
import kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation;
import kcl.ac.uk.xtext.videoAnnotationsDSL.VideoAnnotationsDSLFactory;

public class MainViewController implements Initializable {

	@FXML private MediaView mediaView;
	@FXML private Slider timeSlider;
	@FXML private Button playPauseButton;
	@FXML private Button addAnnotationButton;
	@FXML private Button backwardButton;
	@FXML private Button forwardButton;
	@FXML private Button interpretButton;
	@FXML private TextField fromTime;
	@FXML private TextField toTime;
	@FXML private TextField timeStamp;
	@FXML private MenuItem openItem;
	@FXML private MenuItem loadAnnotationMenuItem;
	@FXML private MenuItem saveAnnotationsMenuItem;
	@FXML private MenuItem saveAsMenuItem;
	@FXML private CheckMenuItem editAnnotationCheckMenuItem;
	@FXML private CheckMenuItem	viewAnnotationCheckMenuItem;
	@FXML private TableView<Annotation> tableView;
	@FXML private TableColumn<Annotation, String> labelColumn;
	@FXML private TableColumn<Annotation, String> fromTimeColumn;
	@FXML private TableColumn<Annotation, String> toTimeColumn;	
	@FXML private VBox bottomVBox;
	
	private AutoCompleteTextField textField;
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
	private String comment;
	private Interpreter interpreter;
	private boolean shouldSave;
		
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		setupDSL();
		
		generateDemoObjectsForAnnotations();
		
		generateTextField();
		
		generateMediaPlayer();
		
		generateMenuItems();
		
		generateTableView();
	}
	
	private void setupDSL() {
		
		parser = new VATParser();
	}
	
	@SuppressWarnings("static-access")
	private void generateTextField() {
		textField = new AutoCompleteTextField();
		textField.setPrefWidth(680);
		textField.setPrefHeight(60);
		textField.setPromptText("a1, sender, type, scope, focus, \"contentLabel\", \"content\", target");
		textField.setAlignment(Pos.CENTER);
		bottomVBox.getChildren().add(0, textField);
		bottomVBox.setMargin(textField, new Insets(10, 10, 10, 10));
		
		updateCodeCompletion();
	}

	/**
	 * Method to get the suggestions for the code completion
	 */
	private void updateCodeCompletion() {
		textField.getIdEntries().clear();
		textField.getSenderEntries().clear();
		textField.getTypeEntries().clear();
		textField.getFocusEntries().clear();
		textField.getContentEntries().clear();
		textField.getContentLabelEntries().clear();
		textField.getScopeEntries().clear();
		textField.getTargetEntries().clear();
		
		AnnotationCompletion suggestions = new AnnotationCompletion();
		textField.getIdEntries().addAll(suggestions.getIDs(anAnnotatedVideo));
		textField.getSenderEntries().addAll(suggestions.getSenders(anAnnotatedVideo));
		textField.getTypeEntries().addAll(suggestions.getMoves(anAnnotatedVideo));
		textField.getFocusEntries().addAll(suggestions.getFocus(anAnnotatedVideo));
		textField.getContentEntries().addAll(suggestions.getContent(anAnnotatedVideo));
		textField.getScopeEntries().addAll(suggestions.getScopes(anAnnotatedVideo));
		textField.getContentLabelEntries().addAll(suggestions.getContentLabel(anAnnotatedVideo));
		textField.getTargetEntries().addAll(suggestions.getTarget(anAnnotatedVideo));
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
		loadAnnotationMenuItem.setDisable(true);
		saveAsMenuItem.setDisable(true);
		viewAnnotationCheckMenuItem.setDisable(true);
		backwardButton.setDisable(true);
		forwardButton.setDisable(true);
		timeStamp.setDisable(true);
		interpretButton.setDisable(true);

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
		
		backwardButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				mediaPlayer.seek(mediaPlayer.getCurrentTime().add(new Duration(-1000)));
			}
			
		});
		
		forwardButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				mediaPlayer.seek(mediaPlayer.getCurrentTime().add(new Duration(1000)));
			}
			
		});
		
		timeStamp.setStyle("-fx-background-color: transparent; -fx-background-insets: 0; -fx-background-radius: 0; -fx-padding: 0;");
		timeStamp.textProperty().addListener(new ChangeListener<String>() {
	        @Override
	        public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
	            if (!newValue.matches("\\d*:\\d*")) {
	            	timeStamp.setText(newValue.replaceAll("[^\\d:]", ""));
	            }
	            if (!newValue.contains(":")) {
	            	timeStamp.setText(newValue.concat(":"));
	            }
	        }
	    });
		timeStamp.setOnKeyPressed(new EventHandler<KeyEvent>() {
	        @Override
	        public void handle(KeyEvent ke) {
	            if (ke.getCode().equals(KeyCode.ENTER)) {
	            	String newValue = timeStamp.getText();
	                if (newValue.matches("\\d*:\\d*")) {
	                	if (convertTimeToSec(newValue) < mediaPlayer.getMedia().getDuration().toSeconds()) {
	                		mediaPlayer.seek(new Duration(convertTimeToSec(newValue) * 1000));
	                		timeSlider.setValue(mediaPlayer.getCurrentTime().toMillis() / mediaPlayer.getTotalDuration().toMillis() * 100);
	                	} else {
	                		showErrorDialog("Error", "Duration incorrect!", "The duration should be in format of \"00:00\" and less than the maximum duration of the video (" + convertSecToTime((int)media.getDuration().toSeconds()) + ").", null);
	                	}
	                }
	            }
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
				FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("MP4 Videos (*.mp4)", "*.mp4");
				if (fileChooser.getExtensionFilters().isEmpty()) {
					fileChooser.getExtensionFilters().add(extFilter);
				} else {
					fileChooser.getExtensionFilters().clear();
					fileChooser.getExtensionFilters().add(extFilter);
				}
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
						backwardButton.setDisable(false);
						forwardButton.setDisable(false);
						timeStamp.setDisable(false);
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
				if (fileChooser.getExtensionFilters().isEmpty()) {
					fileChooser.getExtensionFilters().add(extFilter);
				} else {
					fileChooser.getExtensionFilters().clear();
					fileChooser.getExtensionFilters().add(extFilter);
				}
				File file = fileChooser.showOpenDialog(null);
				
				if (file != null) {
					dataFile = file;
					getAnnotations(dataFile.getAbsolutePath());
					tableView.setItems(annotations);
					saveAnnotationsMenuItem.setDisable(false);
					editAnnotationCheckMenuItem.setDisable(false);
					viewAnnotationCheckMenuItem.setDisable(false);
					interpretButton.setDisable(false);
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
		
		addAnnotationButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				
				if (fromTime.getText().isEmpty()) {
					fromTime.setText(timeStamp.getText());
				} else if (toTime.getText().isEmpty()) {
					toTime.setText(timeStamp.getText());
				} else {
					addAnnotation();
				}
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
							comment = annotationToBeRemoved.getComment();
							annotationsDSL = annotationsDSL.trim();
							annotationsDSL = annotationsDSL.replace(getStringDSL(annotationToBeRemoved).replaceAll("\\s*,\\s*", ", ").trim(), "");
							addAnnotation();
						}
					});
				} else {
					
					addAnnotationButton.setText("Add annotation");
					addAnnotationButton.setOnAction(new EventHandler<ActionEvent>() {

						@Override
						public void handle(ActionEvent event) {
							
							if (fromTime.getText().isEmpty()) {
								fromTime.setText(timeStamp.getText());
							} else if (toTime.getText().isEmpty()) {
								toTime.setText(timeStamp.getText());
							} else {
								addAnnotation();
							}
						}
					});
				}
			}
		});
		
		interpretButton.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				
				if (tableView.getSelectionModel().getSelectedItem() != null) {
					List<String> choices = new ArrayList<>();
					choices.add("Proposal store");
					choices.add("Question store");
					choices.add("Challenge store");
					choices.add("Commitment store");
					choices.add("Argument store");

					ChoiceDialog<String> dialog = new ChoiceDialog<>("Proposal store", choices);
					dialog.setTitle("Interpret");
					dialog.setHeaderText("Choose a store to visualise");
					dialog.setContentText("Choose the store:");

					Optional<String> result = dialog.showAndWait();
					
					if (result.isPresent()) {
						try {
								FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("StoresView.fxml"));
							    Parent root = (Parent) fxmlLoader.load();
							    Stage stage = new Stage();
							    stage.setTitle(result.get());
							    stage.initModality(Modality.APPLICATION_MODAL);
							    stage.setScene(new Scene(root));
							    
							    StoresController controller = fxmlLoader.getController();
							    controller.setAnnotationsStore(interpreter.interpret(anAnnotatedVideo, tableView.getSelectionModel().getSelectedItem()));
							    controller.setTableViewData(result.get());
							    
							    stage.show();
							} catch (Exception e) {
								 e.printStackTrace();
							}
					} else {
						showErrorDialog("Alert", "Information needed to continue", "In order to interpret you have to select the last annotation to be considered (by time).", null);
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
        MenuItem commentItem = new MenuItem("Add comment");
        MenuItem removeCommentItem = new MenuItem("Remove comment");
        
        openItem.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				
				showContentDialog();
			}
        	
        });       	
        deleteItem.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				annotationsDSL = annotationsDSL.trim().replace(getStringDSL(tableView.getSelectionModel().getSelectedItem()).trim(), "");
				annotations.remove(tableView.getSelectionModel().getSelectedIndex());
			}
        });
        commentItem.setOnAction(new EventHandler<ActionEvent>() {
        	
			@Override
			public void handle(ActionEvent event) {
				TextInputDialog dialog = new TextInputDialog(tableView.getSelectionModel().getSelectedItem().getComment());
				dialog.setTitle("Add comment");
				dialog.setHeaderText("Comment an annotation");
				dialog.setContentText("Please enter your comment:");
				
				Optional<String> result = dialog.showAndWait();
				if (result.isPresent()){
					Annotation selectedAnnotation = tableView.getSelectionModel().getSelectedItem();
					String annotationDSL = getStringDSL(selectedAnnotation);
					annotationDSL = annotationDSL.trim();
					annotationsDSL = annotationsDSL.trim();
					annotationsDSL = annotationsDSL.replace(annotationDSL, new AnnotationRenderer().renderWithoutComment(selectedAnnotation) + " #\"" + result.get() + "\"#");
					reloadAnnotations();
				}
			}
        });
        removeCommentItem.setOnAction(new EventHandler<ActionEvent>() {

        	@Override
			public void handle(ActionEvent event) {
        		Annotation selectedAnnotation = tableView.getSelectionModel().getSelectedItem();
				String annotationDSL = getStringDSL(selectedAnnotation);
				annotationDSL = annotationDSL.trim();
				annotationsDSL = annotationsDSL.trim();
				annotationsDSL = annotationsDSL.replace(annotationDSL, new AnnotationRenderer().renderWithoutComment(selectedAnnotation));
				reloadAnnotations();
			}
        });
        
        removeCommentItem.setDisable(true);
        
        contextMenu.getItems().add(openItem);
        contextMenu.getItems().add(deleteItem);
        contextMenu.getItems().add(commentItem);
        contextMenu.getItems().add(removeCommentItem);
		
		// Label Column
		labelColumn.setMinWidth(75);
		labelColumn.setCellValueFactory(new PropertyValueFactory<>("content"));
		
		// From time column
		fromTimeColumn.setMinWidth(75);
		fromTimeColumn.setCellValueFactory(new Callback<CellDataFeatures<Annotation, String>, ObservableValue<String>>() {	
			@SuppressWarnings({ "unchecked", "rawtypes" })
			public ObservableValue<String> call(CellDataFeatures<Annotation, String> p) {
				return new ReadOnlyObjectWrapper(convertSecToTime(p.getValue().getFromTime().getSec()));
			}
		});
		
		// To time column
		toTimeColumn.setMinWidth(75);
		toTimeColumn.setCellValueFactory(new Callback<CellDataFeatures<Annotation, String>, ObservableValue<String>>() {	
			@SuppressWarnings({ "unchecked", "rawtypes" })
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
                    
                	if (tableView.getSelectionModel().getSelectedItem().getComment() == null) {
                		commentItem.setText("Add comment");
                		removeCommentItem.setDisable(true);
                    	contextMenu.show(tableView, mouseEvent.getScreenX() , mouseEvent.getScreenY());
                	} else {
                		commentItem.setText("Edit comment");
                		removeCommentItem.setDisable(false);
                		contextMenu.show(tableView, mouseEvent.getScreenX() , mouseEvent.getScreenY());
                	}
                }
            }
        });
	}
	
	/**
	 * A method to get the annotations from a file into a String and
	 * then to load them into the XtextParser to create the EObjects.
	 * @param filePath The file path of the annotations file as a String.
	 * @return An ObservableList<Annotation>.
	 */
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
        
        updateCodeCompletion();

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
		if (fromTime.getText().isEmpty() || toTime.getText().isEmpty() || textField.getText().isEmpty()) {
			showErrorDialog("Error!", "Fields cannot be empty!", "An annotation must have a time to begin, a time to end and a content in the specified format.", null);
		} else {
			String testString = " from " + convertTimeToSec(fromTime.getText()) + " to " + convertTimeToSec(toTime.getText()) + " annotate (" + textField.getText().trim().replaceAll("\\s*,\\s*", ", ") + ") ";
			
			if (comment != null) {
				testString += "#\"" + comment + "\"# ";
			}
			
			try {
				anAnnotatedVideo = (AnnotatedVideo) parser.parse(annotationsDSL += testString);
				annotations = FXCollections.observableArrayList(anAnnotatedVideo.getAnnotations());
				tableView.setItems(annotations);
				comment = null;
				shouldSave = true;
				
				// Clearing the view
				tableView.refresh();
				textField.clear();
				fromTime.clear();
				toTime.clear();
				
				updateCodeCompletion();
				
				if (annotations.size() > 2) {
					interpretButton.setDisable(false);
				}
				
				if (annotations.size() < 2 && dataFile == null) {
					editAnnotationCheckMenuItem.setDisable(false);
					viewAnnotationCheckMenuItem.setDisable(false);
					
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
				annotationsDSL = annotationsDSL.replace(testString, "");
				showErrorDialog("Exception Dialog", "Provided input contains syntax errors.", "Try to edit the input to match the DSL.", e.getMessage());
			}
		}
	}
	
	/**
	 * A method to show the save as dialog.
	 */
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
	
	/**
	 * A method that shows a dialog with information about an annotation found
	 * in the table view.
	 */
	public void showContentDialog() {
    	final Stage dialog = new Stage();
        int index = tableView.getSelectionModel().getSelectedIndex();
        
        dialog.initModality(Modality.APPLICATION_MODAL);
        
        Label idLabel = new Label("ID:");
        idLabel.setAlignment(Pos.BOTTOM_LEFT);
        idLabel.setMinWidth(100);
        Text idText = new Text(annotations.get(index).getName());
        idText.minWidth(200);
        idText.maxWidth(200);
        HBox idPane = new HBox(20, idLabel, idText);
        idPane.setPadding(new Insets(5));
        
        Label senderLabel = new Label("Sender:");
        senderLabel.setAlignment(Pos.BOTTOM_LEFT);
        senderLabel.setMinWidth(100);
        Text senderText = new Text(annotations.get(index).getSender());
        senderText.minWidth(200);
        senderText.maxWidth(200);
        HBox senderPane = new HBox(20, senderLabel, senderText);
        senderPane.setPadding(new Insets(5));
        
        Label typeLabel = new Label("Type:");
        typeLabel.setAlignment(Pos.BOTTOM_LEFT);
        typeLabel.setMinWidth(100);
        Text typeText = new Text(annotations.get(index).getType().getType());
        typeText.minWidth(200);
        typeText.maxWidth(200);
        HBox typePane = new HBox(20, typeLabel, typeText);
        typePane.setPadding(new Insets(5));

        Label scopeLabel = new Label("Scope:");
        scopeLabel.setAlignment(Pos.BOTTOM_LEFT);
        scopeLabel.setMinWidth(100);
        Text scopeText = new Text(annotations.get(index).getScope().getScope());
        scopeText.minWidth(200);
        scopeText.maxWidth(200);
        HBox scopePane = new HBox(20, scopeLabel, scopeText);
        scopePane.setPadding(new Insets(5));

        Label focusLabel = new Label("Focus:");
        focusLabel.setAlignment(Pos.BOTTOM_LEFT);
        focusLabel.setMinWidth(100);
        Text focusText = new Text(annotations.get(index).getFocus().getFocus());
        focusText.minWidth(200);
        focusText.maxWidth(200);
        HBox focusPane = new HBox(20, focusLabel, focusText);
        focusPane.setPadding(new Insets(5));
        
        Label contentLLabel = new Label("Content label:");
        contentLLabel.setAlignment(Pos.BOTTOM_LEFT);
        contentLLabel.setMinWidth(100);
        Text contentLabelText = new Text(annotations.get(index).getContentLabel());
        contentLabelText.minWidth(200);
        contentLabelText.maxWidth(200);
        HBox contentLabelPane = new HBox(20, contentLLabel, contentLabelText);
        contentLabelPane.setPadding(new Insets(5));
        
        Label contentLabel = new Label("Content:");
        contentLabel.setAlignment(Pos.BOTTOM_LEFT);
        contentLabel.setMinWidth(100);
        Text contentText = new Text(annotations.get(index).getContent());
        contentText.minWidth(200);
        contentText.maxWidth(200);
        HBox contentPane = new HBox(20, contentLabel, contentText);
        contentPane.setPadding(new Insets(5));
        
        Label targetLabel = new Label("Target:");
        targetLabel.setAlignment(Pos.BOTTOM_LEFT);
        targetLabel.setMinWidth(100);
        Text targetText;
        if (annotations.get(index).getTarget() != null) {
        	targetText = new Text(annotations.get(index).getTarget().getName());
        } else {
        	targetText = new Text("null");
        }
        targetText.minWidth(200);
        targetText.maxWidth(200);
        HBox targetPane = new HBox(20, targetLabel, targetText);
        targetPane.setPadding(new Insets(5));
        
        Label commentLabel = new Label("Comment:");
        commentLabel.setAlignment(Pos.BOTTOM_LEFT);
        commentLabel.setMinWidth(100);
        Text commentText = new Text(annotations.get(index).getComment());
        commentText.minWidth(200);
        commentText.maxWidth(200);
        commentText.setWrappingWidth(200);
        HBox commentPane = new HBox(20, commentLabel, commentText);
        commentPane.setPadding(new Insets(5));
        
        VBox pane = new VBox(5, idPane, senderPane, typePane, scopePane, focusPane, contentLabelPane, contentPane, targetPane, commentPane);
        
        Scene dialogScene = new Scene(pane);
        dialog.setScene(dialogScene);
        dialog.setMinHeight(300);
        dialog.setMinWidth(350);
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
		
		return new AnnotationRenderer().render(anAnnotation).toString();
	}
	
	/**
	 * A method to save all the annotations to the file loaded.
	 */
	public void saveAnnotationsToFile() {
		String annotationsString = "";
		
		for (Annotation anAnnotation : annotations) {
			
			annotationsString += getStringDSL(anAnnotation);
		}
		
		try (FileWriter fw = new FileWriter(dataFile.getAbsolutePath()) ;
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
			    out.print(annotationsString);
			    shouldSave = false;
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
		textField.setText(new AnnotationRenderer().renderWithoutTimeAndWithoutKeyword(annotations.get(index)).toString());
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
		interpreter = new Interpreter();
	}

	/**
	 * A method to show an error dialog.
	 * @param title The title of the dialog.
	 * @param header The header of the dialog
	 * @param content The content of the dialog.
	 * @param details The details of the dialog.
	 */
	public void showErrorDialog(String title, String header, String content, String details) {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle(title);
		alert.setHeaderText(header);
		alert.setContentText(content);

		if (details != null) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			pw.print(details);
			String exceptionText = sw.toString();

			Label label = new Label("Details:");

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
		}
		
		alert.showAndWait();
	}

	/**
	 * A method to reload the annotations (might be used for adding comments or editing annotations).
	 */
	public void reloadAnnotations() {
		
		anAnnotatedVideo = (AnnotatedVideo) parser.parse(annotationsDSL);
		annotations = FXCollections.observableArrayList(anAnnotatedVideo.getAnnotations());
		tableView.setItems(annotations);
		tableView.refresh();
	}

	/**
	 * A method to check if the application should close when pressed quit button.
	 * @return True if the annotations were saved, false otherwise.
	 */
	public boolean shutdown() {
	    if (shouldSave) {
	    	Alert alert = new Alert(AlertType.CONFIRMATION);
	    	alert.setTitle("Exit Confirmation");
	    	alert.setHeaderText("Annotations should be saved before exit");
	    	alert.setContentText("The application is about to close. Would you like to save the annotations before closing?");

	    	Optional<ButtonType> result = alert.showAndWait();
	    	
	    	if (result.get() == ButtonType.OK) {
	    		if (dataFile != null) {
		    	    saveAnnotationsToFile();
		    	    return true;
	    		} else {
	    			showSaveAsDialog();
	    			return true;
	    		}
	    	} else {
	    	    return true;
	    	}
	    }

	    return true;
	}
}