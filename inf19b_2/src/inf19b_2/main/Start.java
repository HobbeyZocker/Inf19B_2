package inf19b_2.main;

import inf19b_2.UI.textures.ImageLocation;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Start extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("start_mask.fxml"));
		primaryStage.setTitle("Lager Logistik");
		primaryStage.setScene(new Scene(root, 1250, 700));
		primaryStage.getIcons().add(new Image(ImageLocation.class.getResource("paper_placeholder.png").toExternalForm()));
		primaryStage.show();
	}

	public static void main(String[] args) {

		Application.launch(args);

	}
	
	

}// --module-path C:\Users\Anton\eclipse\javafx-sdk-14.0.1\lib --add-modules
	// javafx.controls,javafx.fxml