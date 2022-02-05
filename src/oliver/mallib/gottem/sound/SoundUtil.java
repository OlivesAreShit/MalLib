package oliver.mallib.gottem.sound;

import java.io.InputStream;
import java.util.Objects;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import oliver.mallib.main.MalLib;

 /**
  * Made for Java Malware library; MalLib (9:20 GMT 5 February 2022)<br>
  * A simple util that can be used to play mp3 files/links to mp3 files<br>
  * 
  * @author napoleon
  */

public class SoundUtil {
	
	private Player player;
	private static Thread thread;
	
	public void start() {
		try {
			Objects.requireNonNull(player);
			
			thread = new Thread(() -> {
				try {
					player.play();
				}catch(JavaLayerException e) {
					try { 
						start();
					}catch(Exception excep) {
					}
				}
			});
			thread.start();
		} catch (Exception e) {
		}
	}
	
	public void stop() {
		if(isRunning()) {
			thread.interrupt();
			thread = null;
			
			if(player != null) {
				player.close();
			}
		}
	}
	
	public static boolean isRunning() {
		return thread != null;
	}
	
	public void setStream(InputStream inputStream) {
		try {
			player = new Player(inputStream);
		}catch (JavaLayerException excep2) {
			if(MalLib.error_print_debug) {
			excep2.printStackTrace(); 
			}
		}
	}
}
