package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ShortcutReader {
	
	private List<Shortcut> options;
	
	public List<Shortcut> getOptions1(){
			
		BufferedReader crunchifyBuffer = null;
		
		try {
			crunchifyBuffer = new BufferedReader(new FileReader("Waehrungen.csv"));
			
			String crunchifyLine;
			options = new ArrayList<Shortcut>();
			
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
		return options;
	}

	private Shortcut crunchifyCSVtoArrayList(String crunchifyCSV) {
		Shortcut shortcut = null;
		
		if (crunchifyCSV != null) {
			String[] splitData = crunchifyCSV.split("\\s*;\\s*");
			shortcut = new Shortcut((splitData[3].trim()), splitData[4].trim(), splitData[0].trim(), splitData[1].trim(),splitData[2].trim());
		}
		return shortcut;
	}	
	
	public List<Shortcut> getOptions() {
		return options;
	}
}	
