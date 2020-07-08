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

	private void book(String amount, String type) {
		booking[0] = String.valueOf(Integer.parseInt(booking[0]) + 1);
		booking[1] = type;
		booking[2] = amount;
	}

	private static void addMoney(int money) {
		bank += money;
		revenue += money;
	}

	private static void subMoney(int money) {
		bank -= money;
		expenses += money;
	}

	public void addBooking(int money, String type) {
		switch (type) {

		case "in":
		case "out":
			addMoney(money);
			book("+" + String.valueOf(money), type);
			break;

		case "re":
		case "del":
			subMoney(money);
			book("-" + String.valueOf(money), type);
			break;

		default:
//			throw exception falsche typen

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
