package data;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ShortcutWriter {

	private final String filename = "Shortcuts";

	public ShortcutWriter(Shortcut shortcut) {

		File file = new File(filename);

		try {
			FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write(shortcut.getName() + ";" + shortcut.getKathegorie() + ";" + shortcut.getDatum() + ";" + shortcut.getGruppe() + ";" + shortcut.getText() + ";" + shortcut.getImage() + "\n");
			
			bw.close();
			fw.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}