package inf19b_2.UI;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class startScreenController {

	@FXML
	private Button btn_switch;

	@FXML
	public void Start() {

		Stage t = (Stage) btn_switch.getScene().getWindow();

		try {
			t.setScene(new Scene(FXMLLoader.load(getClass().getResource("mask.fxml")), 1250, 700));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
