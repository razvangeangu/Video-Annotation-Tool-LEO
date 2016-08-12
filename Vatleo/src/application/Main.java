package application;
	
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/application/MainView.fxml"));
			Parent root = (Parent) fxmlLoader.load(); 
			Scene scene = new Scene(root);
			primaryStage.setTitle("Java Video Annotation Tool");
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setMinWidth(770);
			primaryStage.setMinHeight(520);
			
			scene.getWindow().setOnCloseRequest(new EventHandler<WindowEvent>() {
		        public void handle(WindowEvent ev) {
		            if (!((MainViewController) fxmlLoader.getController()).shutdown()) {
		                ev.consume();
		            }
		        }
		    });
			
			((MainViewController) fxmlLoader.getController()).setHostServices(getHostServices());
			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
