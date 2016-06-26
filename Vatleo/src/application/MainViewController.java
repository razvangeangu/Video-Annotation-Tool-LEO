package application;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayer.Status;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;

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
	
	private MediaPlayer mediaPlayer;
	private Media media;
	private FileChooser fileChooser;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		// Init the media objects
		String path = new File("src/media/video.mp4").getAbsolutePath();
		media = new Media(new File(path).toURI().toString());
		mediaPlayer = new MediaPlayer(media);
		mediaView.setMediaPlayer(mediaPlayer);
		
		// Preserve the ratio of the video
		DoubleProperty width = mediaView.fitWidthProperty();
		DoubleProperty height = mediaView.fitHeightProperty();
		width.bind(Bindings.selectDouble(mediaView.sceneProperty(), "width"));
//		height.bind(Bindings.selectDouble(mediaView.sceneProperty(), "height"));
		
		// Adding the possibility to seek the media player.
		timeSlider.valueProperty().addListener(new InvalidationListener() {

			@Override
			public void invalidated(Observable observable) {
				
				if (timeSlider.isPressed()) {
					mediaPlayer.seek(mediaPlayer.getMedia().getDuration().multiply(timeSlider.getValue() / 100));
				}
			}
		});
		
		// Controlling the view to update the time slider and the time label.
		mediaPlayer.currentTimeProperty().addListener(new InvalidationListener() {
			public void invalidated(Observable observerable) {
				updateTimeSlider();
				updateTimeLabel();
			}
		});
		
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
					} catch (MalformedURLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		
		// Setting up the table view.
		// TODO: add table view setup here
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
				timeStamp.setText(minutes + ":" + seconds);
				
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
		Annotation anAnnotation = new Annotation(textField.getText());
		anAnnotation.setFromTime(fromTime.getText());
		anAnnotation.setToTime(toTime.getText());
		
		textField.clear();
		fromTime.clear();
		toTime.clear();
		
		//TODO: to add the annotation to the table view
		
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
