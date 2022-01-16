package oliver.mallib.gottem.mouse;

import java.awt.AWTException;
import java.awt.Robot;

public class Mouse {
	
	/**
	 * Moves the mouse to a specific x and y coordinate on screen.
	 */
	public static void moveMouse(int x, int y) {
		try {
			Robot bot = new Robot();
			bot.mouseMove(x, y);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Clicks a mouse button. Reference oliver.mallib.gottem.mouse.MouseButtons for the different buttons.
	 */
	public static void clickMouseButton(int key) {
		try {
			Robot bot = new Robot();
			bot.mousePress(key);
			bot.mouseRelease(key);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	
}
