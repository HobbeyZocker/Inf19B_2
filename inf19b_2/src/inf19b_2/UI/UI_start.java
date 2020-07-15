package inf19b_2.UI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UI_start extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("mask.fxml"));
		primaryStage.setTitle("Lager Logistik");
		primaryStage.setScene(new Scene(root, 1250, 700));
		primaryStage.show();
	}

	public static void go(String[] args) {
		Thread test = new Thread() {
			@Override
			public void run() {
				launch(args);
			}

		};
		test.start();

	}
}