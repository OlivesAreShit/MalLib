package oliver.mallib.gottem;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;

import javax.swing.JOptionPane;

public class GUI {
	
	public static void createExitableErrorMessage(String text, String title) {
		JOptionPane.showMessageDialog(null, text, title, JOptionPane.ERROR_MESSAGE);
	}
	
	public static void createNonExitableErrorMessage(String text, String title) {
		while(true) {
		JOptionPane.showMessageDialog(null, text, title, JOptionPane.ERROR_MESSAGE);
		}
	}
	
    public static void windowsNotification(String title, String text) {
        SystemTray tray = SystemTray.getSystemTray();

        Image image = Toolkit.getDefaultToolkit().createImage("icon.png");

        TrayIcon trayIcon = new TrayIcon(image, "420");
        trayIcon.setImageAutoSize(true);
        //trayIcon.setToolTip("tooltip");
        try {
			tray.add(trayIcon);
		} catch (AWTException e) {
			e.printStackTrace();
		}

        trayIcon.displayMessage(title, text, MessageType.ERROR);
    }
	
}
