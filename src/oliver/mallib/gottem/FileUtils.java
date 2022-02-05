package oliver.mallib.gottem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {
	
	public static String br = "\r";
	
	/**
	 * Creates a new file with the text chosen.
	 */
	public static File createFileWithText(String filePath, String text) {
		File file = new File(filePath); 
		 
		try {
			FileWriter writer = new FileWriter(filePath);
			writer.write(text);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return file;
		
	}
	
}
