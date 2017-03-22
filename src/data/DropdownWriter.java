package data;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class DropdownWriter {
	
	private final String filename;
	
	public DropdownWriter(String path) {
		this.filename = path;
	}

	public void writer(String name) {

		File file = new File(filename);

		try {
			FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			if (name != ""){
				bw.write( name + ";");
			}

			bw.close();
			fw.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}