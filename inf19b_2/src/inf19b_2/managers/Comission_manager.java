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

}
