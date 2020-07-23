package inf19b_2.managers;

import java.util.ArrayList;

public class Commission_manager {

	private ArrayList<String[]> commission = new ArrayList<String[]>();
	private int orderNum = 0;

	public Commission_manager(ArrayList<String[]> list) {

		commission = list;
		commission.remove(0);
	}

	public String[] getOrder() {

		String[] order = commission.get(orderNum % commission.size());

		orderNum++;

		return order;
	}

	public void orderNumMinus() {
		orderNum--;
	}
}
