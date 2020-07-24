package inf19b_2.managers;

import javafx.beans.property.SimpleStringProperty;

public  class Bilanz {
	private final SimpleStringProperty bookingType, balance, lastBooking;

	public Bilanz(String bType, String iBalance, String lBooking ) {
		this.bookingType = new SimpleStringProperty(bType);
		this.balance = new SimpleStringProperty(iBalance);
		this.lastBooking = new SimpleStringProperty(lBooking);
	} 

	public String getBookingType() {
		return bookingType.get();
	}

	public void setBookingType(String bType) {
		this.bookingType.set(bType);
	}

	public String getBalance() {
		return balance.get();
	}

	public void setBalance(String iBalance) {
		this.balance.set(iBalance);
	}

	public String getLastBooking() {
		return lastBooking.get();
	}

	public void setLastBooking(String lBooking) {
		this.lastBooking.set(lBooking);
	}
}
	