package oliver.mallib.gottem;

import java.awt.Desktop;
import java.net.URI;

public class Troll {
	
	public static void openLink(String link) {
		try {
			  Desktop desktop = java.awt.Desktop.getDesktop();
			  URI oURL = new URI(link);
			  desktop.browse(oURL);
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
	
}
