package inf19b_2.UI;


import inf19b_2.UI.textures.ImageLocation;
import inf19b_2.managers.Game_manager;
import inf19b_2.managers.IO_manager;
import javafx.scene.image.*;
import javafx.scene.control.Button;
import javafx.fxml.FXML;

public class Controller {
	
//	#########################################
//	#			Declaration					#
//	#########################################

	@FXML
	private ImageView grid_one_frame;
	@FXML
	private ImageView grid_two_frame;
	@FXML
	private ImageView grid_three_frame;
	@FXML
	private ImageView grid_four_frame;
	@FXML
	private ImageView grid_five_frame;
	@FXML
	private ImageView grid_six_frame;
	@FXML
	private ImageView grid_seven_frame;
	@FXML
	private ImageView grid_eight_frame;
	@FXML
	private ImageView grid_nine_frame;
//
	@FXML
	private Button btn_bilanz;
	@FXML
	private Button btn_accept;
	@FXML
	private Button btn_reject;
	@FXML
	private Button btw_next_cont;
	@FXML
	private Button btw_move_cont;
	@FXML
	private Button btw_move_obj;
	@FXML
	private Button btw_destroy_obj;
//
	@FXML
	private ImageView grid_one_frame_hover;
	@FXML
	private ImageView grid_two_frame_hover;
	@FXML
	private ImageView grid_three_frame_hover;
	@FXML
	private ImageView grid_four_frame_hover;
	@FXML
	private ImageView grid_five_frame_hover;
	@FXML
	private ImageView grid_six_frame_hover;
	@FXML
	private ImageView grid_seven_frame_hover;
	@FXML
	private ImageView grid_eight_frame_hover;
	@FXML
	private ImageView grid_nine_frame_hover;


	private int clickedGrid = 10;
	
	IO_manager io_manager = new IO_manager();

//	#########################################
//	#										#
//	#########################################
	
	public void initialize() {

	}

//	#########################################
//	#			Click on grid				#
//	#########################################
	
	public void gridOneClicked() {
		System.out.println("test1");
		this.clickedGrid = 0;
		setAllFramesRed();
	}

	public void gridTwoClicked() {
		System.out.println("test2");
		this.clickedGrid = 1;
	}

	public void gridThreeClicked() {
		System.out.println("test3");
		this.clickedGrid = 2;
	}

	public void gridFourClicked() {
		System.out.println("test4");
		this.clickedGrid = 3;
	}

	public void gridFiveClicked() {
		System.out.println("test5");
		this.clickedGrid = 4;
	}

	public void gridSixClicked() {
		System.out.println("test6");
		io_manager.setClickedGrid(5);

	}

	public void gridSevenClicked() {
		System.out.println("test7");
		this.clickedGrid = 6;
	}

	public void gridEightClicked() {
		System.out.println("test8");
		this.clickedGrid = 7;
	}

	public void gridNineClicked() {
		System.out.println("test9");
		this.clickedGrid = 8;
	}

//	#########################################
//	#			Hover over grid				#
//	#########################################

	public void oneHoverOn() {
		grid_one_frame_hover.setOpacity(1);
	}

	public void oneHoverOff() {
		grid_one_frame_hover.setOpacity(0);
	}

	public void twoHoverOn() {
		grid_two_frame_hover.setOpacity(1);
	}

	public void twoHoverOff() {
		grid_two_frame_hover.setOpacity(0);
	}

	public void threeHoverOn() {
		grid_three_frame_hover.setOpacity(1);
	}

	public void threeHoverOff() {
		grid_three_frame_hover.setOpacity(0);
	}

	public void fourHoverOn() {
		grid_four_frame_hover.setOpacity(1);
	}

	public void fourHoverOff() {
		grid_four_frame_hover.setOpacity(0);
	}

	public void fiveHoverOn() {
		grid_five_frame_hover.setOpacity(1);
	}

	public void fiveHoverOff() {
		grid_five_frame_hover.setOpacity(0);
	}

	public void sixHoverOn() {
		grid_six_frame_hover.setOpacity(1);
	}

	public void sixHoverOff() {
		grid_six_frame_hover.setOpacity(0);
	}

	public void sevenHoverOn() {
		grid_seven_frame_hover.setOpacity(1);
	}

	public void sevenHoverOff() {
		grid_seven_frame_hover.setOpacity(0);
	}

	public void eightHoverOn() {
		grid_eight_frame_hover.setOpacity(1);
	}

	public void eightHoverOff() {
		grid_eight_frame_hover.setOpacity(0);
	}

	public void nineHoverOn() {
		grid_nine_frame_hover.setOpacity(1);
	}

	public void nineHoverOff() {
		grid_nine_frame_hover.setOpacity(0);
	}

//	#########################################	
//	#		Change multiple grid color 		#	
//	#########################################

	private void setAllFramesRed() {

		grid_one_frame.setImage(new Image(ImageLocation.class.getResource("ramen_rot.png").toExternalForm()));
		grid_two_frame.setImage(new Image(ImageLocation.class.getResource("ramen_rot.png").toExternalForm()));
		grid_three_frame.setImage(new Image(ImageLocation.class.getResource("ramen_rot.png").toExternalForm()));
		grid_four_frame.setImage(new Image(ImageLocation.class.getResource("ramen_rot.png").toExternalForm()));
		grid_five_frame.setImage(new Image(ImageLocation.class.getResource("ramen_rot.png").toExternalForm()));
		grid_six_frame.setImage(new Image(ImageLocation.class.getResource("ramen_rot.png").toExternalForm()));
		grid_seven_frame.setImage(new Image(ImageLocation.class.getResource("ramen_rot.png").toExternalForm()));
		grid_eight_frame.setImage(new Image(ImageLocation.class.getResource("ramen_rot.png").toExternalForm()));
		grid_nine_frame.setImage(new Image(ImageLocation.class.getResource("ramen_rot.png").toExternalForm()));
	}

	public void setSomeFramesGreen(boolean[] stackNum) {
		setAllFramesRed();
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

	public void setAllFramesBlack() {
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

//	#########################################
//	#										#
//	#########################################

	public int getClickedGrid() {
		if (clickedGrid < 9) {

			int temp = clickedGrid;
			clickedGrid = 10;
			System.out.print(temp);
			return temp;
		} else
			return 10;
	}

//	#########################################
//	#			Button Actions				#
//	#########################################

	public void btnAccept() {
		setAllFramesBlack();
	}

	public void btnDecline() {
//		xxx
	}

	public void btnNewCom() {
//		xxx
	}

	public void btnMove() {
//		xxx
	}

	public void btnDestroy() {
//		xxx
	}

	public void btnShowAccount() {
//		xxx
	}

}
