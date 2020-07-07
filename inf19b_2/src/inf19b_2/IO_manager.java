package inf19b_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IO_manager {

	public static void readCSV(String csvPath) {

		String csvFile = "C:\\Users\\AntonFelixReuterAwes\\git\\Inf19B_2\\Leistungsnachweis.csv";
		if (csvPath != null) csvFile = csvPath;
		String line = "";
		String cvsSplitBy = ";";

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] good = line.split(cvsSplitBy);

				System.out.println("Good[Auftrag= "+good[0]+", Art= " + good[1] + " , Produkt=" + good[2] + ", Atb1= " + good[3] +", Atb2= " + good[4] +", Belohnung= " + good[5] +"]");

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
