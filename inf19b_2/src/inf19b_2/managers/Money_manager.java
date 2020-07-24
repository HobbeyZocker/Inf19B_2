package inf19b_2.managers;

import java.util.ArrayList;

public class Money_manager {

	private static ArrayList<String[]> bookingList = new ArrayList<String[]>();
	private int bank;

	private String[] book(String amount, String type) {
		String[] booking = new String[3];
		booking[0] = type;
		booking[1] = String.valueOf(bank);
		booking[2] = amount; // how much money gets added or subtracted

		return booking;
	}

	public void addBooking(int money, String type) { // get called for action made
		bank += money;
		bookingList.add(book("+" + String.valueOf(money), type));
	}

	public void move() {
		bank -= 100;
		bookingList.add(book("-" + String.valueOf(100), "Umräumung"));
	}

	public void destroy() {
		bank -= 500;
		bookingList.add(book("-" + String.valueOf(500), "Vernichtung"));
	}

	public ArrayList<String[]> getBookingList() {
		return bookingList;
	}

	public int getMoney() {
		return bank;
	}

}
