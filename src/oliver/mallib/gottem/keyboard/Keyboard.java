package oliver.mallib.gottem.keyboard;

import java.awt.AWTException;
import java.awt.Robot;

public class Keyboard {
	
	/**
	 * Types a key. Reference oliver.mallib.gottem.keyboard.KeyboardKeys for the different keys.
	 */
	public static void typeKey(int key) {
		try {
			Robot bot = new Robot();
			bot.keyPress(key);
		} catch (AWTException e) {
			e.printStackTrace();
		}
		
	}
	
}
