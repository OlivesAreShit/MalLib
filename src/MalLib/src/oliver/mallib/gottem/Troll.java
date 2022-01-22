package oliver.mallib.gottem;

import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.Random;

import javax.imageio.ImageIO;

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
	
	public static void executeCommand(String command) {
		try {
			Runtime.getRuntime().exec(command);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
