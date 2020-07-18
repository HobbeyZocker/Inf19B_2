package inf19b_2.managers;

import java.util.ArrayList;

public class Money_manager {

	private String[] booking = new String[3];
	// Aufbau: num, typ (Einlagerungsauftrag[in], Auslagerungsauftrag[out],
	// Umlagerung[re], Verschrottung[del]), betrag
	private ArrayList<String[]> bookingList = new ArrayList<String[]>();

	private static int bank;													
	private static int revenue;
	private static int expenses;

	private void book(String amount, String type) {							//makes a new Array, ready to be added to the ArrayList
		booking[0] = String.valueOf(Integer.parseInt(booking[0]) + 1);		//Number Tab
		booking[1] = type;													//Type of commission 
		booking[2] = amount;												//how much money gets added or subtracted
	}

	private static void addMoney(int money) {
		bank += money;
		revenue += money;
	}

	private static void subMoney(int money) {
		bank -= money;
		expenses += money;
	}

	public void addBooking(int money, String type) throws Exception {						//get called for action made
		switch (type) {

		case "in":															//every booking where you make money
		case "out":
			addMoney(money);
			book("+" + String.valueOf(money), type);						//new string[]
			break;

		case "re":															//every booking where you loose money
		case "del":
			subMoney(money);
			book("-" + String.valueOf(money), type);						//new string[]
			break;

		default:
			throw new Exception("Wrong type used, Money_manager");									//excption for when the type is wrong, shouldn't happen tho

		}

		bookingList.add(booking);
	}

	public ArrayList<String[]> getBookingList() {
		return bookingList;
	}

	public int getMoney() {
		return bank;
	}

	public int getRevenue() {
		return revenue;
	}

	public int getExpenses() {
		return expenses;
	}

}
