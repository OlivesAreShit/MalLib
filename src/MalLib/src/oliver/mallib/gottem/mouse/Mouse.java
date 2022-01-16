package oliver.mallib.gottem.mouse;

import java.awt.AWTException;
import java.awt.Robot;

public class Mouse {
	
	public static void moveMouse(int x, int y) {
		try {
			Robot bot = new Robot();
			bot.mouseMove(x, y);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	
	public static void clickMouseButton(int key) {
		try {
			Robot bot = new Robot();
			bot.mousePress(MouseButtons.LEFT_CLICK);
			bot.mouseRelease(key);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	
}
