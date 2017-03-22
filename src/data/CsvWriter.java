package data;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class CsvWriter {
	
	private final String filename;
	
	public CsvWriter(String path) {
		this.filename = path;
	}

	public void writer(Kostenstelle kostenstelle) {

		File file = new File(filename);

		try {
			FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(kostenstelle.getName() + ";" + kostenstelle.getKathegorie() + ";" + kostenstelle.getDatum() + ";" + kostenstelle.getGruppe() + "\n");

			bw.close();
			fw.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}