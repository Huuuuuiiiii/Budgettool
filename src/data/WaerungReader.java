package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WaerungReader {

	private List<Waerung> options;
	
	public WaerungReader() {
		
		BufferedReader crunchifyBuffer = null;
		
		try {
			crunchifyBuffer = new BufferedReader(new FileReader("Waehrungen.csv"));
			
			String crunchifyLine;
			options = new ArrayList<Waerung>();
			
			while ((crunchifyLine = crunchifyBuffer.readLine()) != null) {
				options.add(crunchifyCSVtoArrayList(crunchifyLine));
			}
			
			System.out.println(options);
				
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				crunchifyBuffer.close();
			} catch (IOException crunchifyException) {
				crunchifyException.printStackTrace();
			}
		}
	}

	private Waerung crunchifyCSVtoArrayList(String crunchifyCSV) {
		Waerung waerung = null;
		
		if (crunchifyCSV != null) {
			String[] splitData = crunchifyCSV.split("\\s*;\\s*");
			waerung = new Waerung(Integer.parseInt(splitData[0].trim()), splitData[1].trim(), splitData[2].trim(), Double.parseDouble(splitData[3].trim()));
		}
		return waerung;
	}	
	
	public List<Waerung> getOptions() {
		return options;
	}
}	