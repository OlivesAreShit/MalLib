package oliver.mallib.gottem;

import java.awt.Desktop;
import java.net.URI;

import oliver.mallib.gottem.sound.SoundUtil;
import oliver.mallib.main.MalLib;

public class Troll {
	
	private SoundUtil sound = new SoundUtil();
	
	/**
	* Opens a link in the default browser.
	*/
	public static void openLink(String link) {
		try {
			  Desktop desktop = java.awt.Desktop.getDesktop();
			  URI oURL = new URI(link);
			  desktop.browse(oURL);
			}catch (Exception e) {
				if(MalLib.error_print_debug) {
				e.printStackTrace();
				}
			}
	}
	
	/**
	* Plays an MP3 file at the URL provided.
	*/
	public static void playUrlMP3(String link) {
		try {
			  sound.stop();
			  sound.setStream(new java.net.URL(link).openStream());
			  sound.start();
			}catch (Exception e) {
				if(MalLib.error_print_debug) {
				e.printStackTrace();
				}
			}
	}
}
