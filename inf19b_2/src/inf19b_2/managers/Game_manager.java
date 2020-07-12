package inf19b_2.managers;

public class Game_manager {

	/*
	 * TODO: 
	 * 		game_manager.xx(stackNum) fertig machen
	 * 
	 */
	
	private int stackNum ;
	private volatile boolean stackSet ;
	
	

	public static void newCommission(/* goods, payment/price, menge immer 1 */) {

	}

	public void stackChosen(int StackNum) {
		stackNum = StackNum;
		//stackSet = true;                   ?
	}
	
	
	public int chooseStack(boolean[] StackNum) throws InterruptedException {
		
//		 Ruft UI auf, UI muss die Stacks angeben und den richtigen Zurückliefern	
		
		while ( stackSet != true) {
			Thread.sleep(1000);
		}
		
		return stackNum;
	}
	
	public int chooseStack(boolean[][] StackNum) {
	
//		 call Ui / IO ,select stack	
	
		return 0;
	}  

}
