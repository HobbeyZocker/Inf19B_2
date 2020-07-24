package inf19b_2.UI;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import inf19b_2.resources.textures.ImageLocation;
import inf19b_2.goods.Paper;
import inf19b_2.goods.Stone;
import inf19b_2.goods.Wood;
import inf19b_2.managers.Commission_manager;
import inf19b_2.managers.Goods_manager;
import inf19b_2.managers.IO_manager;
import inf19b_2.managers.Money_manager;
import javafx.scene.image.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

public class Controller {

//	#########################################
//	#			Declaration					#
//	#########################################
	// Grid images outline
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
	// Grid Images one
	@FXML
	private ImageView img_one_top;
	@FXML
	private ImageView img_one_middle;
	@FXML
	private ImageView img_one_bottom;
	// Grid Images two
	@FXML
	private ImageView img_two_top;
	@FXML
	private ImageView img_two_middle;
	@FXML
	private ImageView img_two_bottom;
	// Grid Images three
	@FXML
	private ImageView img_three_top;
	@FXML
	private ImageView img_three_middle;
	@FXML
	private ImageView img_three_bottom;
	// Grid Images four
	@FXML
	private ImageView img_four_top;
	@FXML
	private ImageView img_four_middle;
	@FXML
	private ImageView img_four_bottom;
	// Grid Images five
	@FXML
	private ImageView img_five_top;
	@FXML
	private ImageView img_five_middle;
	@FXML
	private ImageView img_five_bottom;
	// Grid Images six
	@FXML
	private ImageView img_six_top;
	@FXML
	private ImageView img_six_middle;
	@FXML
	private ImageView img_six_bottom;
	// Grid Images seven
	@FXML
	private ImageView img_seven_top;
	@FXML
	private ImageView img_seven_middle;
	@FXML
	private ImageView img_seven_bottom;
	// Grid Images eight
	@FXML
	private ImageView img_eight_top;
	@FXML
	private ImageView img_eight_middle;
	@FXML
	private ImageView img_eight_bottom;
	// Grid Images nine
	@FXML
	private ImageView img_nine_top;
	@FXML
	private ImageView img_nine_middle;
	@FXML
	private ImageView img_nine_bottom;

	// Buttons
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
	@FXML
	private Button btn_load_csv;

	// Label Commission grid one ...
	@FXML
	private Label Label_com_one_good;
	@FXML
	private Label Label_com_one_type;
	@FXML
	private Label Label_com_one_size;
	@FXML
	private Label Label_com_one_desc;
	// Label Commission grid two ...
	@FXML
	private Label Label_com_two_good;
	@FXML
	private Label Label_com_two_type;
	@FXML
	private Label Label_com_two_size;
	@FXML
	private Label Label_com_two_desc;
	// Label Commission grid three ...
	@FXML
	private Label Label_com_three_good;
	@FXML
	private Label Label_com_three_type;
	@FXML
	private Label Label_com_three_size;
	@FXML
	private Label Label_com_three_desc;
	// Label Free Spots
	@FXML
	private Label label_free_spots;
	// Label Money
	@FXML
	private Label label_money;
	@FXML
	private Label label_money_change;

	// Main anchor pane
	@FXML
	private AnchorPane start_ap;
	// commissions anchor panes
	@FXML
	private AnchorPane ap_com_one;
	@FXML
	private AnchorPane ap_com_two;
	@FXML
	private AnchorPane ap_com_three;

	// Values todo with Commission
	private String[] comOne;
	private String[] comTwo;
	private String[] comThree;
	private int activeComission;
	private boolean[] comSpotTaken = new boolean[3];
	private boolean[] validStacks = new boolean[9];
	private boolean[][] validStacksTwo = new boolean[9][4];

	// used spots
	private int usedSpots;

	// destroy
	private boolean destroyGood;

	// balken pics
	private boolean[] balkenPic = new boolean[9];

	// move
	private int moveGood;
	private int moveFrom;

	// managers
	IO_manager io_manager;
	Commission_manager co_manager;
	Money_manager mo_manager = new Money_manager();
	Goods_manager go_manager = new Goods_manager();

//	#########################################
//	#		Initialize Methods				#
//	#########################################

	public void initialize() {
		start_ap.setVisible(true);
	}

	private void initialize_co_man() {
		co_manager = new Commission_manager(io_manager.getComissionsList());
	}

//	#########################################
//	#			Click on grid				#
//	#########################################

	public void gridOneClicked() {
		gridClickAction(0);
	}

	public void gridTwoClicked() {
		gridClickAction(1);
	}

	public void gridThreeClicked() {
		gridClickAction(2);
	}

	public void gridFourClicked() {
		gridClickAction(3);
	}

	public void gridFiveClicked() {
		gridClickAction(4);
	}

	public void gridSixClicked() {
		gridClickAction(5);
	}

	public void gridSevenClicked() {
		gridClickAction(6);
	}

	public void gridEightClicked() {
		gridClickAction(7);
	}

	public void gridNineClicked() {
		gridClickAction(8);
	}

//	#########################################
//	#			Hover over grid				#
//	#########################################

	public void oneHoverOn() {
		if (clickable(0)) {
			grid_one_frame_hover.setOpacity(1);
		}
	}

	public void oneHoverOff() {
		grid_one_frame_hover.setOpacity(0);
	}

	public void twoHoverOn() {
		if (clickable(1)) {
			grid_two_frame_hover.setOpacity(1);
		}
	}

	public void twoHoverOff() {
		grid_two_frame_hover.setOpacity(0);
	}

	public void threeHoverOn() {
		if (clickable(2)) {
			grid_three_frame_hover.setOpacity(1);
		}
	}

	public void threeHoverOff() {
		grid_three_frame_hover.setOpacity(0);
	}

	public void fourHoverOn() {
		if (clickable(3)) {
			grid_four_frame_hover.setOpacity(1);
		}
	}

	public void fourHoverOff() {
		grid_four_frame_hover.setOpacity(0);
	}

	public void fiveHoverOn() {
		if (clickable(4)) {
			grid_five_frame_hover.setOpacity(1);
		}
	}

	public void fiveHoverOff() {
		grid_five_frame_hover.setOpacity(0);
	}

	public void sixHoverOn() {
		if (clickable(5)) {
			grid_six_frame_hover.setOpacity(1);
		}
	}

	public void sixHoverOff() {
		grid_six_frame_hover.setOpacity(0);
	}

	public void sevenHoverOn() {
		if (clickable(6)) {
			grid_seven_frame_hover.setOpacity(1);
		}
	}

	public void sevenHoverOff() {
		grid_seven_frame_hover.setOpacity(0);
	}

	public void eightHoverOn() {
		if (clickable(7)) {
			grid_eight_frame_hover.setOpacity(1);
		}
	}

	public void eightHoverOff() {
		grid_eight_frame_hover.setOpacity(0);
	}

	public void nineHoverOn() {
		if (clickable(8)) {
			grid_nine_frame_hover.setOpacity(1);
		}
	}

	public void nineHoverOff() {
		grid_nine_frame_hover.setOpacity(0);
	}

//	#########################################
//	#			set Grid images				#
//	#########################################

	private void setGridPics(int stack, String name) {
		switch (stack) {
		case 0:
			if (!img_one_bottom.isVisible()) {
				img_one_bottom.setImage(
						new Image(ImageLocation.class.getResource(name + "_placeholder.png").toExternalForm()));
				img_one_bottom.setVisible(true);
			} else if (!img_one_middle.isVisible()) {
				img_one_middle.setImage(
						new Image(ImageLocation.class.getResource(name + "_placeholder.png").toExternalForm()));
				img_one_middle.setVisible(true);
			} else if (!img_one_bottom.isVisible()) {
				img_one_top.setImage(
						new Image(ImageLocation.class.getResource(name + "_placeholder.png").toExternalForm()));
				img_one_top.setVisible(true);
			}
			break;

		case 1:
			if (!img_two_bottom.isVisible()) {
				img_two_bottom.setImage(
						new Image(ImageLocation.class.getResource(name + "_placeholder.png").toExternalForm()));
				img_two_bottom.setVisible(true);
			} else if (!img_two_middle.isVisible()) {
				img_two_middle.setImage(
						new Image(ImageLocation.class.getResource(name + "_placeholder.png").toExternalForm()));
				img_two_middle.setVisible(true);
			} else if (!img_two_top.isVisible()) {
				img_two_top.setImage(
						new Image(ImageLocation.class.getResource(name + "_placeholder.png").toExternalForm()));
				img_two_top.setVisible(true);
			}
			break;

		case 2:
			if (!img_three_bottom.isVisible()) {
				img_three_bottom.setImage(
						new Image(ImageLocation.class.getResource(name + "_placeholder.png").toExternalForm()));
				img_three_bottom.setVisible(true);
			} else if (!img_three_middle.isVisible()) {
				img_three_middle.setImage(
						new Image(ImageLocation.class.getResource(name + "_placeholder.png").toExternalForm()));
				img_three_middle.setVisible(true);
			} else if (!img_three_top.isVisible()) {
				img_three_top.setImage(
						new Image(ImageLocation.class.getResource(name + "_placeholder.png").toExternalForm()));
				img_three_top.setVisible(true);
			}
			break;

		case 3:
			if (!img_one_bottom.isVisible()) {
				img_four_bottom.setImage(
						new Image(ImageLocation.class.getResource(name + "_placeholder.png").toExternalForm()));
				img_four_bottom.setVisible(true);
			} else if (!img_four_middle.isVisible()) {
				img_four_middle.setImage(
						new Image(ImageLocation.class.getResource(name + "_placeholder.png").toExternalForm()));
				img_four_middle.setVisible(true);
			} else if (!img_four_top.isVisible()) {
				img_four_top.setImage(
						new Image(ImageLocation.class.getResource(name + "_placeholder.png").toExternalForm()));
				img_four_top.setVisible(true);
			}
			break;

		case 4:
			if (!img_five_bottom.isVisible()) {
				img_five_bottom.setImage(
						new Image(ImageLocation.class.getResource(name + "_placeholder.png").toExternalForm()));
				img_five_bottom.setVisible(true);
			} else if (!img_five_middle.isVisible()) {
				img_five_middle.setImage(
						new Image(ImageLocation.class.getResource(name + "_placeholder.png").toExternalForm()));
				img_five_middle.setVisible(true);
			} else if (!img_five_top.isVisible()) {
				img_five_top.setImage(
						new Image(ImageLocation.class.getResource(name + "_placeholder.png").toExternalForm()));
				img_five_top.setVisible(true);
			}
			break;

		case 5:
			if (!img_six_bottom.isVisible()) {
				img_six_bottom.setImage(
						new Image(ImageLocation.class.getResource(name + "_placeholder.png").toExternalForm()));
				img_six_bottom.setVisible(true);
			} else if (!img_six_middle.isVisible()) {
				img_six_middle.setImage(
						new Image(ImageLocation.class.getResource(name + "_placeholder.png").toExternalForm()));
				img_six_middle.setVisible(true);
			} else if (!img_six_top.isVisible()) {
				img_six_top.setImage(
						new Image(ImageLocation.class.getResource(name + "_placeholder.png").toExternalForm()));
				img_six_top.setVisible(true);
			}
			break;

		case 6:
			if (!img_seven_bottom.isVisible()) {
				img_seven_bottom.setImage(
						new Image(ImageLocation.class.getResource(name + "_placeholder.png").toExternalForm()));
				img_seven_bottom.setVisible(true);
			} else if (!img_seven_middle.isVisible()) {
				img_seven_middle.setImage(
						new Image(ImageLocation.class.getResource(name + "_placeholder.png").toExternalForm()));
				img_seven_middle.setVisible(true);
			} else if (!img_seven_top.isVisible()) {
				img_seven_top.setImage(
						new Image(ImageLocation.class.getResource(name + "_placeholder.png").toExternalForm()));
				img_seven_top.setVisible(true);
			}
			break;

		case 7:
			if (!img_eight_bottom.isVisible()) {
				img_eight_bottom.setImage(
						new Image(ImageLocation.class.getResource(name + "_placeholder.png").toExternalForm()));
				img_eight_bottom.setVisible(true);
			} else if (!img_eight_middle.isVisible()) {
				img_eight_middle.setImage(
						new Image(ImageLocation.class.getResource(name + "_placeholder.png").toExternalForm()));
				img_eight_middle.setVisible(true);
			} else if (!img_eight_top.isVisible()) {
				img_eight_top.setImage(
						new Image(ImageLocation.class.getResource(name + "_placeholder.png").toExternalForm()));
				img_eight_top.setVisible(true);
			}
			break;

		case 8:
			if (!img_nine_bottom.isVisible()) {
				img_nine_bottom.setImage(
						new Image(ImageLocation.class.getResource(name + "_placeholder.png").toExternalForm()));
				img_nine_bottom.setVisible(true);
			} else if (!img_nine_middle.isVisible()) {
				img_nine_middle.setImage(
						new Image(ImageLocation.class.getResource(name + "_placeholder.png").toExternalForm()));
				img_nine_middle.setVisible(true);
			} else if (!img_nine_top.isVisible()) {
				img_nine_top.setImage(
						new Image(ImageLocation.class.getResource(name + "_placeholder.png").toExternalForm()));
				img_nine_top.setVisible(true);
			}
			break;

		}

	}

	private void delGridPics(int stack) {
		switch (stack) {
		case 0:
			if (balkenPic[stack]) {
				balkenPic[stack] = false;
				img_one_top.setVisible(false);
				img_one_middle.setVisible(false);
				img_one_bottom.setVisible(false);
			} else if (img_one_top.isVisible()) {
				img_one_top.setVisible(false);
			} else if (img_one_middle.isVisible()) {
				img_one_middle.setVisible(false);
			} else if (img_one_bottom.isVisible()) {
				img_one_bottom.setVisible(false);
			}
			break;

		case 1:
			if (balkenPic[stack]) {
				balkenPic[stack] = false;
				img_two_top.setVisible(false);
				img_two_middle.setVisible(false);
				img_two_bottom.setVisible(false);
			} else if (img_two_top.isVisible()) {
				img_two_top.setVisible(false);
			} else if (img_two_middle.isVisible()) {
				img_two_middle.setVisible(false);
			} else if (img_two_bottom.isVisible()) {
				img_two_bottom.setVisible(false);
			}
			break;

		case 2:
			if (balkenPic[stack]) {
				balkenPic[stack] = false;
				img_three_top.setVisible(false);
				img_three_middle.setVisible(false);
				img_three_bottom.setVisible(false);
			} else if (img_three_top.isVisible()) {
				img_three_top.setVisible(false);
			} else if (img_three_middle.isVisible()) {
				img_three_middle.setVisible(false);
			} else if (img_three_bottom.isVisible()) {
				img_three_bottom.setVisible(false);
			}
			break;

		case 3:
			if (balkenPic[stack]) {
				balkenPic[stack] = false;
				img_four_top.setVisible(false);
				img_four_middle.setVisible(false);
				img_four_bottom.setVisible(false);
			} else if (img_four_top.isVisible()) {
				img_four_top.setVisible(false);
			} else if (img_four_middle.isVisible()) {
				img_four_middle.setVisible(false);
			} else if (img_four_bottom.isVisible()) {
				img_four_bottom.setVisible(false);
			}
			break;

		case 4:
			if (balkenPic[stack]) {
				balkenPic[stack] = false;
				img_five_top.setVisible(false);
				img_five_middle.setVisible(false);
				img_five_bottom.setVisible(false);
			} else if (img_five_top.isVisible()) {
				img_five_top.setVisible(false);
			} else if (img_five_middle.isVisible()) {
				img_five_middle.setVisible(false);
			} else if (img_five_bottom.isVisible()) {
				img_five_bottom.setVisible(false);
			}
			break;

		case 5:
			if (balkenPic[stack]) {
				balkenPic[stack] = false;
				img_six_top.setVisible(false);
				img_six_middle.setVisible(false);
				img_six_bottom.setVisible(false);
			} else if (img_six_top.isVisible()) {
				img_six_top.setVisible(false);
			} else if (img_six_middle.isVisible()) {
				img_six_middle.setVisible(false);
			} else if (img_six_bottom.isVisible()) {
				img_six_bottom.setVisible(false);
			}
			break;

		case 6:
			if (balkenPic[stack]) {
				balkenPic[stack] = false;
				img_seven_top.setVisible(false);
				img_seven_middle.setVisible(false);
				img_seven_bottom.setVisible(false);
			} else if (img_seven_top.isVisible()) {
				img_seven_top.setVisible(false);
			} else if (img_seven_middle.isVisible()) {
				img_seven_middle.setVisible(false);
			} else if (img_seven_bottom.isVisible()) {
				img_seven_bottom.setVisible(false);
			}
			break;

		case 7:
			if (balkenPic[stack]) {
				balkenPic[stack] = false;
				img_eight_top.setVisible(false);
				img_eight_middle.setVisible(false);
				img_eight_bottom.setVisible(false);
			} else if (img_eight_top.isVisible()) {
				img_eight_top.setVisible(false);
			} else if (img_eight_middle.isVisible()) {
				img_eight_middle.setVisible(false);
			} else if (img_eight_bottom.isVisible()) {
				img_eight_bottom.setVisible(false);
			}
			break;

		case 8:
			if (balkenPic[stack]) {
				balkenPic[stack] = false;
				img_nine_top.setVisible(false);
				img_nine_middle.setVisible(false);
				img_nine_bottom.setVisible(false);
			} else if (img_nine_top.isVisible()) {
				img_nine_top.setVisible(false);
			} else if (img_nine_middle.isVisible()) {
				img_nine_middle.setVisible(false);
			} else if (img_nine_bottom.isVisible()) {
				img_nine_bottom.setVisible(false);
			}
			break;

		}

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

	private void setSomeFramesGreen(boolean[] stackNum) {
		setAllFramesRed();
		this.validStacks = stackNum;
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

	private void setSomeFramesOrange(boolean[][] stackNum) { // TODO color orange
		if (stackNum[0][0] == true)
			grid_one_frame.setImage(new Image(ImageLocation.class.getResource("ramen_grün.png").toExternalForm()));
		if (stackNum[1][0] == true)
			grid_two_frame.setImage(new Image(ImageLocation.class.getResource("ramen_grün.png").toExternalForm()));
		if (stackNum[2][0] == true)
			grid_three_frame.setImage(new Image(ImageLocation.class.getResource("ramen_grün.png").toExternalForm()));
		if (stackNum[3][0] == true)
			grid_four_frame.setImage(new Image(ImageLocation.class.getResource("ramen_grün.png").toExternalForm()));
		if (stackNum[4][0] == true)
			grid_five_frame.setImage(new Image(ImageLocation.class.getResource("ramen_grün.png").toExternalForm()));
		if (stackNum[5][0] == true)
			grid_six_frame.setImage(new Image(ImageLocation.class.getResource("ramen_grün.png").toExternalForm()));
		if (stackNum[6][0] == true)
			grid_seven_frame.setImage(new Image(ImageLocation.class.getResource("ramen_grün.png").toExternalForm()));
		if (stackNum[7][0] == true)
			grid_eight_frame.setImage(new Image(ImageLocation.class.getResource("ramen_grün.png").toExternalForm()));
		if (stackNum[8][0] == true)
			grid_nine_frame.setImage(new Image(ImageLocation.class.getResource("ramen_grün.png").toExternalForm()));
	}

	private void setSomeFramesGreen(boolean[][] stackNum) { // TODO
		setAllFramesRed();
		setSomeFramesOrange(stackNum);
		Arrays.fill(validStacks, false);
		this.validStacksTwo = stackNum;
		if (stackNum[0][1] == true)
			grid_one_frame.setImage(new Image(ImageLocation.class.getResource("ramen_grün.png").toExternalForm()));
		if (stackNum[1][1] == true)
			grid_two_frame.setImage(new Image(ImageLocation.class.getResource("ramen_grün.png").toExternalForm()));
		if (stackNum[2][1] == true)
			grid_three_frame.setImage(new Image(ImageLocation.class.getResource("ramen_grün.png").toExternalForm()));
		if (stackNum[3][1] == true)
			grid_four_frame.setImage(new Image(ImageLocation.class.getResource("ramen_grün.png").toExternalForm()));
		if (stackNum[4][1] == true)
			grid_five_frame.setImage(new Image(ImageLocation.class.getResource("ramen_grün.png").toExternalForm()));
		if (stackNum[5][1] == true)
			grid_six_frame.setImage(new Image(ImageLocation.class.getResource("ramen_grün.png").toExternalForm()));
		if (stackNum[6][1] == true)
			grid_seven_frame.setImage(new Image(ImageLocation.class.getResource("ramen_grün.png").toExternalForm()));
		if (stackNum[7][1] == true)
			grid_eight_frame.setImage(new Image(ImageLocation.class.getResource("ramen_grün.png").toExternalForm()));
		if (stackNum[8][1] == true)
			grid_nine_frame.setImage(new Image(ImageLocation.class.getResource("ramen_grün.png").toExternalForm()));

	}

	private void setAllFramesBlack() {
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

	private void gridClickAction(int stack) {
		if (clickable(stack)) {
			doCom(stack);
			if (destroyGood)
				destroyGood(stack);
			if (moveGood == 1 || moveGood == 2)
				moveGood(stack);
		}
	}

	private boolean clickable(int grid) {
		if (validStacks[grid] == true)
			return true;
		else if (validStacksTwo[grid][1]) // TODO
			return true;
		return false;
	}

//	#########################################
//	#			Button Actions				#
//	#########################################

	public void btnDecline() {
		switch (activeComission) {
		case 1:
			ap_com_one.setVisible(false);
			setAllFramesBlack();
			comSpotTaken[0] = false;
			uncolorComissions();

			mo_manager.addNegativBooking(Integer.parseInt(comOne[5]));
			label_money_change.setTextFill(Color.web("#f84116")); // #f84116
			label_money_change.setText("- " + comOne[5]);
			label_money.setText(mo_manager.getMoney() + " €");

			break;
		case 2:
			ap_com_two.setVisible(false);
			setAllFramesBlack();
			comSpotTaken[1] = false;
			uncolorComissions();

			mo_manager.addNegativBooking(Integer.parseInt(comTwo[5]));
			label_money_change.setTextFill(Color.web("#f84116")); // #f84116
			label_money_change.setText("- " + comTwo[5]);
			label_money.setText(mo_manager.getMoney() + " €");
			break;
		case 3:
			ap_com_three.setVisible(false);
			setAllFramesBlack();
			comSpotTaken[2] = false;
			uncolorComissions();

			mo_manager.addNegativBooking(Integer.parseInt(comThree[5]));
			label_money_change.setTextFill(Color.web("#f84116")); // #f84116
			label_money_change.setText("- " + comThree[5]);
			label_money.setText(mo_manager.getMoney() + " €");
			break;
		}
	}

	public void btnNewCom() {
		uncolorComissions();
		String[] s = co_manager.getOrder();
		System.out.println(Arrays.toString(s));
		setComLabel(s);
	}

	public void btnMove() {
		uncolorComissions();
		moveGood = 1;
		setSomeFramesGreen(go_manager.checkMoveFrom());
	}

	public void btnDestroy() {
		uncolorComissions();
		setSomeFramesGreen(go_manager.checkNotEmpty());
		destroyGood = true;
	}

	public void btnLoadCsv() {
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Wähle deine CSV Datei");
		fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("CSV Datei", "*.csv"));
		Stage t = (Stage) btn_load_csv.getScene().getWindow();
		File selectedFile = fileChooser.showOpenDialog(t);
		String csv_path = selectedFile.getAbsolutePath().toString();

		io_manager = new IO_manager(csv_path);

		initialize_co_man();

		start_ap.setDisable(true);
		start_ap.setVisible(false);

	}

	public void btnStandartCsv() {
		io_manager = new IO_manager();

		initialize_co_man();

		start_ap.setDisable(true);
		start_ap.setVisible(false);

	}

	public void openBilanz(ActionEvent event) {
		uncolorComissions();
		FXMLLoader loader = new FXMLLoader();
		try {
			Pane pane = loader.load(getClass().getResource("bilanzDialog.fxml").openStream());
			Stage stage = new Stage();
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setScene(new Scene(pane));
			stage.setTitle("Bilanz");
			stage.getIcons().add(new Image(ImageLocation.class.getResource("paper_placeholder.png").toExternalForm()));
			stage.show();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

//	#########################################
//	#		  Commission management			#
//	#########################################
	private void setComLabel(String[] s) {

		if (comSpotTaken[0] != true) {
			ap_com_one.setVisible(true);

			Label_com_one_good.setText(s[2]);
			Label_com_one_type.setText(s[3]);
			Label_com_one_size.setText(s[4]);
			Label_com_one_desc.setText(s[1] + " " + s[5] + "€");

			comSpotTaken[0] = true;
			comOne = s;
		} else if (comSpotTaken[1] != true) {
			ap_com_two.setVisible(true);

			Label_com_two_good.setText(s[2]);
			Label_com_two_type.setText(s[3]);
			Label_com_two_size.setText(s[4]);
			Label_com_two_desc.setText(s[1] + " " + s[5] + "€");

			comSpotTaken[1] = true;
			comTwo = s;
		} else if (comSpotTaken[2] != true) {
			ap_com_three.setVisible(true);

			Label_com_three_good.setText(s[2]);
			Label_com_three_type.setText(s[3]);
			Label_com_three_size.setText(s[4]);
			Label_com_three_desc.setText(s[1] + " " + s[5] + "€");

			comSpotTaken[2] = true;
			comThree = s;
		} else {
			System.err.print("voll");// TODO joa muss besser!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!11
			co_manager.orderNumMinus();
		}

	}

	private void checkDoCom() {

		if (activeComission == 1) {
			if (Objects.equals(comOne[1].toLowerCase(), "einlagerung")) {
				if (Objects.equals(comOne[2].toLowerCase(), "stein"))
					setSomeFramesGreen(go_manager.checkPushObj(newStone(comOne[3], comOne[4])));
				if (Objects.equals(comOne[2].toLowerCase(), "papier"))
					setSomeFramesGreen(go_manager.checkPushObj(newPaper(comOne[3], comOne[4])));
				if (Objects.equals(comOne[2].toLowerCase(), "holz"))
					setSomeFramesGreen(go_manager.checkPushObj(newWood(comOne[3], comOne[4])));

			} else if (comOne[1].toLowerCase() == "auslagerung") {
				if (Objects.equals(comOne[2].toLowerCase(), "stein"))
					setSomeFramesGreen(go_manager.checkPopObj(newStone(comOne[3], comOne[4])));
				if (Objects.equals(comOne[2].toLowerCase(), "papier"))
					setSomeFramesGreen(go_manager.checkPopObj(newPaper(comOne[3], comOne[4])));
				if (Objects.equals(comOne[2].toLowerCase(), "holz"))
					setSomeFramesGreen(go_manager.checkPopObj(newWood(comOne[3], comOne[4])));
			}

		} else if (activeComission == 2) {
			if (Objects.equals(comTwo[1].toLowerCase(), "einlagerung")) {
				if (Objects.equals(comTwo[2].toLowerCase(), "stein"))
					setSomeFramesGreen(go_manager.checkPushObj(newStone(comTwo[3], comTwo[4])));
				if (Objects.equals(comTwo[2].toLowerCase(), "papier"))
					setSomeFramesGreen(go_manager.checkPushObj(newPaper(comTwo[3], comTwo[4])));
				if (Objects.equals(comTwo[2].toLowerCase(), "holz"))
					setSomeFramesGreen(go_manager.checkPushObj(newWood(comTwo[3], comTwo[4])));

			} else if (Objects.equals(comTwo[1].toLowerCase(), "auslagerung")) {
				if (Objects.equals(comTwo[2].toLowerCase(), "stein"))
					setSomeFramesGreen(go_manager.checkPopObj(newStone(comTwo[3], comTwo[4])));
				if (Objects.equals(comTwo[2].toLowerCase(), "papier"))
					setSomeFramesGreen(go_manager.checkPopObj(newPaper(comTwo[3], comTwo[4])));
				if (Objects.equals(comTwo[2].toLowerCase(), "holz"))
					setSomeFramesGreen(go_manager.checkPopObj(newWood(comTwo[3], comTwo[4])));
			}

		} else if (activeComission == 3) {
			if (Objects.equals(comThree[1].toLowerCase(), "einlagerung")) {
				if (Objects.equals(comThree[2].toLowerCase(), "stein"))
					setSomeFramesGreen(go_manager.checkPushObj(newStone(comThree[3], comThree[4])));
				if (Objects.equals(comThree[2].toLowerCase(), "papier"))
					setSomeFramesGreen(go_manager.checkPushObj(newPaper(comThree[3], comThree[4])));
				if (Objects.equals(comThree[2].toLowerCase(), "holz"))
					setSomeFramesGreen(go_manager.checkPushObj(newWood(comThree[3], comThree[4])));

			} else if (Objects.equals(comThree[1].toLowerCase(), "auslagerung")) {
				if (Objects.equals(comThree[2].toLowerCase(), "stein"))
					setSomeFramesGreen(go_manager.checkPopObj(newStone(comThree[3], comThree[4])));
				if (Objects.equals(comThree[2].toLowerCase(), "papier"))
					setSomeFramesGreen(go_manager.checkPopObj(newPaper(comThree[3], comThree[4])));
				if (Objects.equals(comThree[2].toLowerCase(), "holz"))
					setSomeFramesGreen(go_manager.checkPopObj(newWood(comThree[3], comThree[4])));
			}
		}

	}

	// TODO checken ob das Pop OBJ an stelle 1 ist oder nicht
	private void doCom(int stack) {
		if (activeComission == 1) {
			if (Objects.equals(comOne[1].toLowerCase(), "einlagerung")) {
				if (Objects.equals(comOne[2].toLowerCase(), "stein")) {
					go_manager.pushObj(newStone(comOne[3], comOne[4]), stack);
					setGridPics(stack, "stone");
				}
				if (Objects.equals(comOne[2].toLowerCase(), "papier")) {
					go_manager.pushObj(newPaper(comOne[3], comOne[4]), stack);
					setGridPics(stack, "paper");
				}
				if (Objects.equals(comOne[2].toLowerCase(), "holz")) {
					go_manager.pushObj(newWood(comOne[3], comOne[4]), stack);

					if (Objects.equals(comOne[4].toLowerCase(), "balken")) {
						for (int i = 0; i <= 3; i++)
							setGridPics(stack, "wood");
						balkenPic[stack] = true;
					} else
						setGridPics(stack, "wood");
				}

			} else if (Objects.equals(comOne[1].toLowerCase(), "auslagerung")) {
				if (Objects.equals(comOne[2].toLowerCase(), "stein"))
					go_manager.PopObj(stack);
				if (Objects.equals(comOne[2].toLowerCase(), "papier"))
					go_manager.PopObj(stack);
				if (Objects.equals(comOne[2].toLowerCase(), "holz"))
					go_manager.PopObj(stack);
				delGridPics(stack);
			}

			mo_manager.addPositivBooking(Integer.parseInt(comOne[5]), comOne[1]);
			label_money_change.setTextFill(Color.web("#33af47")); // #f84116
			label_money_change.setText("+ " + comOne[5]);
			label_money.setText(mo_manager.getMoney() + " €");

			ap_com_one.setVisible(false);
			setAllFramesBlack();
			comSpotTaken[0] = false;
			uncolorComissions();

			// changes the amount of takes spots
			usedSpots++;
			label_free_spots.setText(String.valueOf(usedSpots));

		} else if (activeComission == 2) {
			if (Objects.equals(comTwo[1].toLowerCase(), "einlagerung")) {
				if (Objects.equals(comTwo[2].toLowerCase(), "stein")) {
					go_manager.pushObj(newStone(comTwo[3], comTwo[4]), stack);
					setGridPics(stack, "stone");
				}
				if (Objects.equals(comTwo[2].toLowerCase(), "papier")) {
					go_manager.pushObj(newPaper(comTwo[3], comTwo[4]), stack);
					setGridPics(stack, "paper");
				}
				if (Objects.equals(comTwo[2].toLowerCase(), "holz")) {
					go_manager.pushObj(newWood(comTwo[3], comTwo[4]), stack);

					if (Objects.equals(comTwo[4].toLowerCase(), "balken")) {
						for (int i = 0; i <= 3; i++)
							setGridPics(stack, "wood");
						balkenPic[stack] = true;
					} else
						setGridPics(stack, "wood");
				}

			} else if (Objects.equals(comTwo[1].toLowerCase(), "auslagerung")) {
				if (Objects.equals(comTwo[2].toLowerCase(), "stein"))
					go_manager.PopObj(stack);
				if (Objects.equals(comTwo[2].toLowerCase(), "papier"))
					go_manager.PopObj(stack);
				if (Objects.equals(comTwo[2].toLowerCase(), "holz"))
					go_manager.PopObj(stack);
				delGridPics(stack);
			}

			mo_manager.addPositivBooking(Integer.parseInt(comTwo[5]), comTwo[1]);
			label_money_change.setTextFill(Color.web("#33af47")); // #f84116
			label_money_change.setText("+ " + comTwo[5]);
			label_money.setText(mo_manager.getMoney() + " €");

			ap_com_two.setVisible(false);
			setAllFramesBlack();
			comSpotTaken[1] = false;
			uncolorComissions();

			// changes the amount of takes spots
			usedSpots++;
			label_free_spots.setText(String.valueOf(usedSpots));

		} else if (activeComission == 3) {
			if (Objects.equals(comThree[1].toLowerCase(), "einlagerung")) {
				if (Objects.equals(comThree[2].toLowerCase(), "stein")) {
					go_manager.pushObj(newStone(comThree[3], comThree[4]), stack);
					setGridPics(stack, "stone");
				}
				if (Objects.equals(comThree[2].toLowerCase(), "papier")) {
					go_manager.pushObj(newPaper(comThree[3], comThree[4]), stack);
					setGridPics(stack, "paper");
				}
				if (Objects.equals(comThree[2].toLowerCase(), "holz")) {
					go_manager.pushObj(newWood(comThree[3], comThree[4]), stack);

					if (Objects.equals(comThree[4].toLowerCase(), "balken")) {
						for (int i = 0; i <= 3; i++)
							setGridPics(stack, "wood");
						balkenPic[stack] = true;
					} else
						setGridPics(stack, "wood");
				}

			} else if (Objects.equals(comThree[1].toLowerCase(), "auslagerung")) {
				if (Objects.equals(comThree[2].toLowerCase(), "stein"))
					go_manager.PopObj(stack);
				if (Objects.equals(comThree[2].toLowerCase(), "papier"))
					go_manager.PopObj(stack);
				if (Objects.equals(comThree[2].toLowerCase(), "holz"))
					go_manager.PopObj(stack);
				delGridPics(stack);
			}

			mo_manager.addPositivBooking(Integer.parseInt(comThree[5]), comThree[1]);
			label_money_change.setTextFill(Color.web("#33af47")); // #f84116
			label_money_change.setText("+ " + comThree[5]);
			label_money.setText(mo_manager.getMoney() + " €");

			ap_com_three.setVisible(false);
			setAllFramesBlack();
			comSpotTaken[2] = false;
			uncolorComissions();

			// changes the amount of takes spots
			usedSpots++;
			label_free_spots.setText(String.valueOf(usedSpots));
		}
	}

	private void destroyGood(int stack) {
		uncolorComissions();
		go_manager.PopObj(stack);
		setAllFramesBlack();
		destroyGood = false;

		mo_manager.destroy();
		label_money_change.setTextFill(Color.web("#f84116"));
		label_money_change.setText("- " + 500);
		label_money.setText(mo_manager.getMoney() + " €");

		// changes the amount of takes spots
		usedSpots--;
		label_free_spots.setText(String.valueOf(usedSpots));
	}

	private void moveGood(int stack) {
		uncolorComissions();
		if (moveGood == 1) {
			setSomeFramesGreen(go_manager.checkMoveTo());
			moveFrom = stack;
			moveGood = 2;
		} else if (moveGood == 2) {
			go_manager.move(moveFrom, stack);
			moveGood = 0;
			setAllFramesBlack();

			delGridPics(moveFrom);
			setGridPics(stack, go_manager.peak(stack));

			mo_manager.move();
			label_money_change.setTextFill(Color.web("#f84116"));
			label_money_change.setText("- " + 100);
			label_money.setText(mo_manager.getMoney() + " €");
		}
	}

	private Stone newStone(String type, String weight) {
		return new Stone(type, weight);
	}

	private Paper newPaper(String color, String size) {
		return new Paper(color, size);
	}

	private Wood newWood(String type, String form) {
		return new Wood(type, form);
	}

//	#########################################
//	#			Commission panes			#
//	#########################################
	public void uncolorComissions() {
		ap_com_one.setStyle("-fx-border-color: black; -fx-border-radius: 10; -fx-border-width: 3;");
		ap_com_two.setStyle("-fx-border-color: black; -fx-border-radius: 10; -fx-border-width: 3;");
		ap_com_three.setStyle("-fx-border-color: black; -fx-border-radius: 10; -fx-border-width: 3;");
		activeComission = 0;
		setAllFramesBlack();
	}

	public void commissionClickOne() {
		//
		ap_com_one.setStyle("-fx-border-color: #36cbd0; -fx-border-radius: 10; -fx-border-width: 3;");
		ap_com_two.setStyle("-fx-border-color: black; -fx-border-radius: 10; -fx-border-width: 3;");
		ap_com_three.setStyle("-fx-border-color: black; -fx-border-radius: 10; -fx-border-width: 3;");
		activeComission = 1;

		checkDoCom();
	}

	public void commissionClickTwo() {
		ap_com_one.setStyle("-fx-border-color: black; -fx-border-radius: 10; -fx-border-width: 3;");
		//
		ap_com_two.setStyle("-fx-border-color: #36cbd0; -fx-border-radius: 10; -fx-border-width: 3;");
		ap_com_three.setStyle("-fx-border-color: black; -fx-border-radius: 10; -fx-border-width: 3;");
		activeComission = 2;

		checkDoCom();
	}

	public void commissionClickThree() {
		ap_com_one.setStyle("-fx-border-color: black; -fx-border-radius: 10; -fx-border-width: 3;");
		ap_com_two.setStyle("-fx-border-color: black; -fx-border-radius: 10; -fx-border-width: 3;");
		//
		ap_com_three.setStyle("-fx-border-color: #36cbd0; -fx-border-radius: 10; -fx-border-width: 3;");
		activeComission = 3;

		checkDoCom();
	}
//
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
}
