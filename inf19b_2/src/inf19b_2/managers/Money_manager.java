package inf19b_2.managers;

import java.util.ArrayList;

public class Money_manager {

	// Aufbau: num, typ (Einlagerungsauftrag[in], Auslagerungsauftrag[out],
	// Umlagerung[re], Verschrottung[del]), betrag

	private static ArrayList<String[]> bookingList = new ArrayList<String[]>();
	private int bank;

	private String[] book(String amount, String type) { // makes a new Array, ready to be added to the ArrayList
		String[] booking = new String[3];
		booking[0] = type; // Number Tab
		booking[1] = String.valueOf(bank); // Type of commission
		booking[2] = amount; // how much money gets added or subtracted

		return booking;
	}

	public void addBooking(int money, String type) { // get called for action made
		bank += money;
		bookingList.add(book("+" + String.valueOf(money), type));
	}

	public void move() {
		bank -= 100;
		bookingList.add(book("-" + String.valueOf(100), "Umr�umung"));
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
