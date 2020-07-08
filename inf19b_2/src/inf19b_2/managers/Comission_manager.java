package inf19b_2.managers;



import java.util.ArrayList;

public class Comission_manager {

	private ArrayList<String[]> comission = new ArrayList<String[]>();

	public Comission_manager(ArrayList<String[]> list) {

		comission = list;
	}
	
	public String[] getOrder(int orderNum) {
		
		String[] order = comission.get(orderNum); 
			
		return order;
	}
	
	public void acceptOrder(int orderNum) {
		//call goods_Manager
		// add money to money manager
	}
	
	public void rejektOrder(int orderNum) {
		//call goods_Manager
	}
	
	public void skipOrder(int orderNum) {
		//call goods_Manager
	}

}
