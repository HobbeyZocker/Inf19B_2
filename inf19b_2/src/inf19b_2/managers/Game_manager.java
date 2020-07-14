package inf19b_2.managers;

import java.util.concurrent.TimeUnit;
import inf19b_2.UI.Controller;

public class Game_manager {

	/*
	 * TODO: game_manager.xx(stackNum) fertig machen
	 * 
	 */

	private int stackNum;
	private volatile boolean stackSet;
	Controller controller = new Controller();
	IO_manager io_manager = new IO_manager();

	public static void newCommission(/* goods, payment/price, menge immer 1 */) {

	}

	public void stackChosen(int StackNum) {
		stackNum = StackNum;
		// stackSet = true; ?
	}

	public int chooseStack(boolean[] StackNum) {

		controller.setSomeFramesGreen(StackNum);
		
		System.out.print(io_manager.getClickedGrid());
		
		while (io_manager.getClickedGrid() == 10 && StackNum[io_manager.getClickedGrid()] != true) {

			
				System.out.print(io_manager.getClickedGrid());
				
				try {
					
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//			try catch 			TimeUnit.SECONDS.sleep(1); 
			}

		
		controller.setAllFramesBlack();

		return io_manager.getClickedGrid();
	}

	public int chooseStack(boolean[][] StackNum) {

//		 copy chooseStack from up theres	

		return 0;
	}

}
