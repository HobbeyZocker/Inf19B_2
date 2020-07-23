package inf19b_2.UI;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import inf19b_2.resources.textures.ImageLocation;
import inf19b_2.goods.Paper;
import inf19b_2.goods.Stone;
import inf19b_2.managers.Commission_manager;
import inf19b_2.managers.Game_manager;
import inf19b_2.managers.Goods_manager;
import inf19b_2.managers.IO_manager;
import inf19b_2.managers.Money_manager;
import javafx.scene.image.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
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
	private Label label_money_minus;
	@FXML
	private Label label_money_plus;

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

	private int clickedGrid = 10;
	private int choosenCommission = 0;

	// Arrays which contain the Commission
	private String[] comOne;
	private String[] comTwo;
	private String[] comThree;
	private int activeComission;
	private boolean[] comSpotTaken = new boolean[3];

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
		System.out.println("test1");
		this.clickedGrid = 0;
		
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

	// obsolet?
	public void btnAccept() {
		setAllFramesBlack();

		// muss in auftrag auswählen

//		setSomeFramesGreen(go_manager.checkPushObj(new Paper("blau","a4")));
//		setSomeFramesGreen(go_manager.checkPushObj(new Stone("mamor","leicht")));
		setSomeFramesGreen(go_manager.checkPushObj(new Stone("mamor", "schwer")));
		System.out.print(Arrays.toString(go_manager.checkPushObj(new Stone("mamor", "schwer"))));

	}

	public void btnDecline() {
//		xxx
	}

	public void btnNewCom() {
		String[] s = co_manager.getOrder();
		System.out.println(Arrays.toString(s));
		setOrderLabel(s);
	}

	public void btnMove() {
//		xxx
	}

	public void btnDestroy() {
//		xxx
	}

	// Obsolet?
	public void btnShowAccount() {
//		xxx
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
//	#										#
//	#########################################
	private void setOrderLabel(String[] s) {

		if (comSpotTaken[0] != true) {

			Label_com_one_good.setText(s[2]);
			Label_com_one_type.setText(s[3]);
			Label_com_one_size.setText(s[4]);
			Label_com_one_desc.setText(s[1]);
			
			comSpotTaken[0] = true;
		}
		else if (comSpotTaken[1] != true) {

			Label_com_two_good.setText(s[2]);
			Label_com_two_type.setText(s[3]);
			Label_com_two_size.setText(s[4]);
			Label_com_two_desc.setText(s[1]);
			
			comSpotTaken[1] = true;
		} 
		else if (comSpotTaken[2] != true) {

			Label_com_three_good.setText(s[2]);
			Label_com_three_type.setText(s[3]);
			Label_com_three_size.setText(s[4]);
			Label_com_three_desc.setText(s[1]);
			
			comSpotTaken[2] = true;
		}
		else {
			System.err.print("voll");// TODO joa muss besser!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!11
			co_manager.orderNumMinus();
		}

	}

//	#########################################
//	#			Commission panes			#
//	#########################################
	public void uncolorComissions() {
		ap_com_one.setStyle("-fx-border-color: black; -fx-border-radius: 10; -fx-border-width: 3;");
		ap_com_two.setStyle("-fx-border-color: black; -fx-border-radius: 10; -fx-border-width: 3;");
		ap_com_three.setStyle("-fx-border-color: black; -fx-border-radius: 10; -fx-border-width: 3;");
		activeComission = 0;
	}

	public void commissionClickOne() {
		//
		ap_com_one.setStyle("-fx-border-color: #36cbd0; -fx-border-radius: 10; -fx-border-width: 3;");
		ap_com_two.setStyle("-fx-border-color: black; -fx-border-radius: 10; -fx-border-width: 3;");
		ap_com_three.setStyle("-fx-border-color: black; -fx-border-radius: 10; -fx-border-width: 3;");
		activeComission = 1;
	}

	public void commissionClickTwo() {
		ap_com_one.setStyle("-fx-border-color: black; -fx-border-radius: 10; -fx-border-width: 3;");
		//
		ap_com_two.setStyle("-fx-border-color: #36cbd0; -fx-border-radius: 10; -fx-border-width: 3;");
		ap_com_three.setStyle("-fx-border-color: black; -fx-border-radius: 10; -fx-border-width: 3;");
		activeComission = 2;
	}

	public void commissionClickThree() {
		ap_com_one.setStyle("-fx-border-color: black; -fx-border-radius: 10; -fx-border-width: 3;");
		ap_com_two.setStyle("-fx-border-color: black; -fx-border-radius: 10; -fx-border-width: 3;");
		//
		ap_com_three.setStyle("-fx-border-color: #36cbd0; -fx-border-radius: 10; -fx-border-width: 3;");
		activeComission = 3;
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
