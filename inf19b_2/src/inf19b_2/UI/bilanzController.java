package inf19b_2.UI;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import inf19b_2.managers.Bilanz;
import inf19b_2.managers.Money_manager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class bilanzController implements Initializable {

	private final ObservableList<Bilanz> data = FXCollections.observableArrayList();

	@FXML
	private TableView<Bilanz> table;
	@FXML
	private TableColumn<Bilanz, String> bookingTypeCol;
	@FXML
	private TableColumn<Bilanz, String> balanceCol;
	@FXML
	private TableColumn<Bilanz, String> lastBookingCol;

	private Money_manager mo_manager = new Money_manager();

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		bookingTypeCol.setCellValueFactory(new PropertyValueFactory<Bilanz, String>("bookingType"));
		balanceCol.setCellValueFactory(new PropertyValueFactory<Bilanz, String>("balance"));
		lastBookingCol.setCellValueFactory(new PropertyValueFactory<Bilanz, String>("lastBooking"));

		getMoney();

		table.setItems(this.data);

	}

	private void getMoney() {
		ArrayList<String[]> bookingList = mo_manager.getBookingList();

		for (int i = 0; i < bookingList.size(); i++) {
			data.add(new Bilanz(bookingList.get(i)[0], bookingList.get(i)[1], bookingList.get(i)[2]));
		}
	}

}
