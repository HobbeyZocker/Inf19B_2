package inf19b_2.UI;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;

public class startScreenController {

	@FXML
	private Button btn_switch;

	@FXML
	private Label label_one;

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

	public void initialize() {
		flasher.setCycleCount(Animation.INDEFINITE);
		flasher.play();
	}

	Timeline flasher = new Timeline(

			new KeyFrame(Duration.seconds(0.5), e -> {
				label_one.setVisible(true);
			}),

			new KeyFrame(Duration.seconds(1.5), e -> {
				label_one.setVisible(false);

			}));

}
