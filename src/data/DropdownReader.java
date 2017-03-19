package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class DropdownReader{
	
	private String Filename;
	
	public DropdownReader(String Filename){
		this.Filename = Filename;
	}
	
	public ArrayList<String> getOptions(){
			
		ArrayList<String> options = null;
		BufferedReader crunchifyBuffer = null;
		
		try {
			crunchifyBuffer = new BufferedReader(new FileReader(this.Filename));
			
			String crunchifyLine;
			options = new ArrayList<String>();
			
			while ((crunchifyLine = crunchifyBuffer.readLine()) != null) {
				options = crunchifyCSVtoArrayList(crunchifyLine); 
			}
				
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
	
	private ArrayList<String> crunchifyCSVtoArrayList(String crunchifyCSV) {
		ArrayList<String> crunchifyResult = new ArrayList<String>();
		
		if (crunchifyCSV != null) {
			String[] splitData = crunchifyCSV.split("\\s*;\\s*");
			for (int i = 0; i < splitData.length; i++) {
				if (!(splitData[i] == null) || !(splitData[i].length() == 0)) {
					crunchifyResult.add(splitData[i].trim());
				}
			}
		}
		
		return crunchifyResult;
	}
}
