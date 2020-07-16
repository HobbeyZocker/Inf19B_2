package inf19b_2.main;

import java.applet.Applet;
import java.io.IOException;
import inf19b_2.UI.textures.ImageLocation;
import inf19b_2.managers.Game_manager;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Start extends Application {

	static Game_manager game_manager = new Game_manager();
	private Stage primaryStage;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
		Parent root = FXMLLoader.load(getClass().getResource("start_mask.fxml"));
		primaryStage.setTitle("Lager Logistik");
		primaryStage.setScene(new Scene(root, 1250, 700));
		primaryStage.getIcons().add(new Image(ImageLocation.class.getResource("paper_placeholder.png").toExternalForm()));
		primaryStage.show();
	}
	

	public static void main(String[] args) {

		Application.launch(args);
		
	
//		boolean test[] = new boolean[11];
//		test[5] = true;		
//		System.out.println(game_manager.chooseStack(test));
		
	
	}

}//--module-path C:\Users\Anton\eclipse\javafx-sdk-14.0.1\lib --add-modules javafx.controls,javafx.fxml