package oliver.mallib.gottem;

import java.io.IOException;

public class OS {
	
	public static void execute(String command) {
		try {
			Runtime.getRuntime().exec(command);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
