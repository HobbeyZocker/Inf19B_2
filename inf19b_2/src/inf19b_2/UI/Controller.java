package inf19b_2.UI;

import inf19b_2.UI.textures.ImageLocation;
import javafx.scene.image.*;
import javafx.scene.control.Button;
import javafx.fxml.FXML;

public class Controller {

	@FXML
	private ImageView grid_one_frame;
	private ImageView grid_two_frame;
	private ImageView grid_three_frame;
	private ImageView grid_four_frame;
	private ImageView grid_five_frame;
	private ImageView grid_six_frame;
	private ImageView grid_seven_frame;
	private ImageView grid_eight_frame;
	private ImageView grid_nine_frame;

	private Button btn_bilanz;
	private Button btn_accept;
	private Button btn_reject;
	private Button btw_next_cont;
	private Button btw_move_cont;
	private Button btw_move_obj;
	private Button btw_destroy_obj;

	public void gridOneClicked() {
		System.out.println("test1");
		grid_one_frame.setImage(new Image(ImageLocation.class.getResource("ramen_grün.png").toExternalForm()));
	}

	public void gridTwoClicked() {
		System.out.println("test2");
		setAllBlack();
	}

	public void gridThreeClicked() {
		System.out.println("test3");
	}

	public void gridFourClicked() {
		System.out.println("test4");
	}

	public void gridFiveClicked() {
		System.out.println("test5");
	}

	public void gridSixClicked() {
		System.out.println("test6");
	}

	public void gridSevenClicked() {
		System.out.println("test7");
	}

	public void gridEightClicked() {
		System.out.println("test8");
	}

	public void gridNineClicked() {
		System.out.println("test9");
	}

	public void setStackFrameGreen(boolean[] stackNum) {
		if (stackNum[0] == true)
			grid_one_frame.setImage(new Image(ImageLocation.class.getResource("ramen_grün.png").toExternalForm()));
		if (stackNum[1] == true)
			grid_two_frame.setImage(new Image(ImageLocation.class.getResource("ramen_grün.png").toExternalForm()));
		if (stackNum[2] == true)
			grid_three_frame.setImage(new Image(ImageLocation.class.getResource("ramen_grün.png").toExternalForm()));
		if (stackNum[3] == true)
			grid_four_frame.setImage(new Image(ImageLocation.class.getResource("ramen_grün.png").toExternalForm()));
		if (stackNum[4] == true)
			grid_five_frame.setImage(new Image(ImageLocation.class.getResource("ramen_grün.png").toExternalForm()));
		if (stackNum[5] == true)
			grid_six_frame.setImage(new Image(ImageLocation.class.getResource("ramen_grün.png").toExternalForm()));
		if (stackNum[6] == true)
			grid_seven_frame.setImage(new Image(ImageLocation.class.getResource("ramen_grün.png").toExternalForm()));
		if (stackNum[7] == true)
			grid_eight_frame.setImage(new Image(ImageLocation.class.getResource("ramen_grün.png").toExternalForm()));
		if (stackNum[8] == true)
			grid_nine_frame.setImage(new Image(ImageLocation.class.getResource("ramen_grün.png").toExternalForm()));
	}

	@FXML
	public void setAllBlack() {

		grid_one_frame.setImage(new Image(ImageLocation.class.getResource("ramen_schwarz.png").toExternalForm()));
		grid_two_frame.setImage(new Image(ImageLocation.class.getResource("ramen_schwarz.png").toExternalForm()));
		grid_three_frame.setImage(new Image(ImageLocation.class.getResource("ramen_schwarz.png").toExternalForm()));
		grid_four_frame.setImage(new Image(ImageLocation.class.getResource("ramen_schwarz.png").toExternalForm()));
		grid_five_frame.setImage(new Image(ImageLocation.class.getResource("ramen_schwarz.png").toExternalForm()));
		grid_six_frame.setImage(new Image(ImageLocation.class.getResource("ramen_schwarz.png").toExternalForm()));
		grid_seven_frame.setImage(new Image(ImageLocation.class.getResource("ramen_schwarz.png").toExternalForm()));
		grid_eight_frame.setImage(new Image(ImageLocation.class.getResource("ramen_schwarz.png").toExternalForm()));
		grid_nine_frame.setImage(new Image(ImageLocation.class.getResource("ramen_schwarz.png").toExternalForm()));
	}

}
