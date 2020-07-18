package inf19b_2.managers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class IO_manager {

	private String line = "";
	private String cvsSplitBy = ";";

	private int clickedGrid = 10;

	private ArrayList<String[]> comission = new ArrayList<String[]>();

	public IO_manager() {
		File file = new File("src/inf19b_2/resources/Leistungsnachweis.csv");

		readCSV((String) file.getAbsolutePath());
	}

	public IO_manager(String csv_path) {
		readCSV(csv_path);
	}

	private void readCSV(String csvPath) {

		try (BufferedReader br = new BufferedReader(new FileReader(csvPath))) {

			while ((line = br.readLine()) != null) {

				String[] good = line.split(cvsSplitBy);

				comission.add(good);

//				System.out.println("Good[Auftrag= " + good[0] + ", Art= " + good[1] + " , Produkt=" + good[2]
//						+ ", Atb1= " + good[3] + ", Atb2= " + good[4] + ", Belohnung= " + good[5] + "]");

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public ArrayList<String[]> getComissionsList() {
		return comission;
	}

	public void setClickedGrid(int clickedGrid) {
		this.clickedGrid = clickedGrid;
		System.out.print(this.clickedGrid);
	}

	public int getClickedGrid() {
		if (clickedGrid < 9) {

			int temp = clickedGrid;
//			clickedGrid = 10;
			System.out.print(temp);
			return temp;
		} else
			return 10;
	}

}
