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
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayer.Status;
import javafx.scene.media.MediaView;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation;

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
	private ObservableList<Annotation> annotations;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		generateMediaPlayer();
		
		generateOpenButton();
		
		generateTableView();
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
		
		// Label Column
		labelColumn.setMinWidth(75);
		labelColumn.setCellValueFactory(new PropertyValueFactory<>("label"));
		
		// From time column
		fromTimeColumn.setMinWidth(75);
		fromTimeColumn.setCellValueFactory(new PropertyValueFactory<>("fromTime"));
		
		// To time column
		toTimeColumn.setMinWidth(75);
		toTimeColumn.setCellValueFactory(new PropertyValueFactory<>("toTime"));
		
		tableView.setItems(getAnnotations());
		tableView.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (mouseEvent.getButton().equals(MouseButton.PRIMARY)) {
                    if (mouseEvent.getClickCount() == 2) {
                    	final Stage dialog = new Stage();
                        dialog.initModality(Modality.APPLICATION_MODAL);
                        VBox dialogVbox = new VBox(20);
                        int index = tableView.getSelectionModel().getSelectedIndex();
                        dialogVbox.getChildren().add(new Text(annotations.get(index).getContent()));
                        Scene dialogScene = new Scene(dialogVbox, 300, 200);
                        dialog.setScene(dialogScene);
                        dialog.show();
                    }
                }
            }
        });
	}
	
	public ObservableList<Annotation> getAnnotations() {
		annotations = FXCollections.observableArrayList();
		
		// open the file
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
//                annotations.add(new Annotation(line)); TODO: change to the parser and get the annotations from there
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
		int minutes, seconds;
		
		minutes = (int) mediaPlayer.getCurrentTime().toMinutes();
		seconds = (int) mediaPlayer.getCurrentTime().toSeconds();
		
		Platform.runLater(new Runnable() {
			public void run() {
				if (seconds - (minutes * 60) >= 10) {
					if (minutes >= 10) {
						timeStamp.setText(minutes + ":" + (seconds - (minutes * 60)));
					} else {
						timeStamp.setText("0" + minutes + ":" + (seconds - (minutes * 60)));
					}
				} else {
					if (minutes >= 10) {
						timeStamp.setText(minutes + ":0" + (seconds - (minutes * 60)));
					} else {
						timeStamp.setText("0" + minutes + ":0" + (seconds - (minutes * 60)));
					}
				}
				
				if (!fromTime.getText().equals("")) {
					toTime.setText(Integer.toString(seconds));
				}
			}
		});
	}
	
	/**
	 * A method that creates an annotation and adds it to the tree view.
	 */
	public void addAnnotation() {
//		Annotation anAnnotation = new Annotation();
//		anAnnotation.setLabel(textField.getText());
//		anAnnotation.setFromTime(fromTime.getText());
//		anAnnotation.setToTime(toTime.getText());
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter out = null;
		
		try {
			
		    fw = new FileWriter("data.txt", true);
		    bw = new BufferedWriter(fw);
		    out = new PrintWriter(bw);
//		    out.println(anAnnotation.getLabel());
		    out.close();
		    
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		// Adding the annotation to the list
//		annotations.add(anAnnotation);
		tableView.refresh();
		
		// Clearing the view
		textField.clear();
		fromTime.clear();
		toTime.clear();
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
		
		mediaPlayer.pause();
		playPauseButton.setText("Play");
		fromTime.setText(Double.toString(mediaPlayer.getCurrentTime().toSeconds()));
	}
}