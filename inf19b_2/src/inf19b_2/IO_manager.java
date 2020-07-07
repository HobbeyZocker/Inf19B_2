package inf19b_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class IO_manager {

	private String csvFile = "C:\\Users\\AntonFelixReuterAwes\\git\\Inf19B_2\\Leistungsnachweis.csv";
	private String line = "";
	private String cvsSplitBy = ";";

	private ArrayList<String[]> comission = new ArrayList<String[]>();

	public void readCSV(String csvPath) {

		if (csvPath != null)
			csvFile = csvPath;

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {

				String[] good = line.split(cvsSplitBy);

//				System.out.println("Good[Auftrag= " + good[0] + ", Art= " + good[1] + " , Produkt=" + good[2]
//						+ ", Atb1= " + good[3] + ", Atb2= " + good[4] + ", Belohnung= " + good[5] + "]");

				comission.add(good);

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public ArrayList<String[]> getComissionsList() {
		return comission;
	}

}
