package inf19b_2.UI;

import java.io.File;

import javafx.scene.image.*;

public class Controller {
	
	private ImageView grid_one_frame;

	public void gridOneClicked() {
		System.out.println("test5");
		Image image = new Image("src/inf19b_2/UI/textures/ramen_grün.png");
		grid_one_frame.setImage(image);

	}

	public void gridTwoClicked() {
		System.out.println("test5");
	}

	public void gridThreeClicked() {
		System.out.println("test5");
	}

	public void gridFourClicked() {
		System.out.println("test5");
	}

	public void gridFiveClicked() {
		System.out.println("test5");
	}

	public void gridSixClicked() {
		System.out.println("test5");
	}

	public void gridSevenClicked() {
		System.out.println("test5");
	}

	public void gridEightClicked() {
		System.out.println("test5");
	}

	public void gridNineClicked() {
		System.out.println("test5");
	}
	
	
	public void setStackFrameGreen(boolean[] stackNum) {
		if (stackNum[0] == true) grid_one_frame.setImage(new Image("../UI/textures/ramen_grün.png"));
	}

}