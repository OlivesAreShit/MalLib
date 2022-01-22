package oliver.mallib.presets;

import oliver.mallib.gottem.Troll;

public class SearcherPreset extends Thread {
	
	/**
	 * See the documentation for information on presets.
	 * This preset searches funny, weird, and questionable things on the user's default browser.
	 */
	public SearcherPreset() {
		run();
	}
	
	@Override
	public void run() {
		Troll.openLink("https://duckduckgo.com/?q=how+2+check+for+virus&ia=web");
		try {
			Thread.sleep(35 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Troll.openLink("https://www.bing.com/search?q=why+is+my+poop+green&cvid=a93675487e054743aa9dcea2168e5e5f&aqs=edge.5.0l9.3296j0j1&FORM=ANSPA1&PC=U531");
		try {
			Thread.sleep(20 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Troll.openLink("https://www.bing.com/search?q=why+is+my+poop+green&cvid=a93675487e054743aa9dcea2168e5e5f&aqs=edge.5.0l9.3296j0j1&FORM=ANSPA1&PC=U531");
		try {
			Thread.sleep(16 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Troll.openLink("https://www.google.com/search?q=loli+porn&oq=loli+porn&aqs=chrome..69i57.3156j0j1&sourceid=chrome&ie=UTF-8");
		try {
			Thread.sleep(7 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Troll.openLink("https://www.ecosia.org/search?tt=e8eb07a6&q=why+am+i+attracted+to+men%3F");
		try {
			Thread.sleep(14 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Troll.openLink("https://www.qwant.com/?q=why+is+my+computer+searching+things%3F&t=web");
		try {
			Thread.sleep(5 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Troll.openLink("https://www.google.com/search?q=how+to+tell+if+ur+a+furry&ei=NgrmYY-DE5G4tAaN1rD4Cw&ved=0ahUKEwiP9syKhrr1AhURHM0KHQ0rDL8Q4dUDCA8&uact=5&oq=how+to+tell+if+ur+a+furry&gs_lcp=Cgdnd3Mtd2l6EAMyBAgAEAoyBAgAEAoyBggAEBYQHjIICAAQFhAKEB4yBggAEBYQHjIICAAQFhAKEB4yCAgAEBYQChAeMgYIABAWEB4yBQgAEIYDMgUIABCGAzoFCAAQkQI6BAgAEEM6CwguEIAEELEDEIMBOgsIABCABBCxAxCDAToFCC4QgAQ6DgguEIAEELEDEMcBEKMCOgUIABCABDoICAAQgAQQsQM6CgguELEDEIMBEEM6BwguELEDEEM6CwguEIAEEMcBEK8BOgcIABCxAxBDOggILhCABBCxAzoICC4QsQMQgwE6BAguEEM6CggAEIAEELEDEAo6BQguELEDOgYILhAKEEM6DggAEI8BEOoCEIwDEOUCOg4ILhCPARDqAhCMAxDlAjoICAAQsQMQgwE6BwgAEIAEEAo6CggAELEDEIMBEApKBAhBGABKBAhGGABQAFiAQGD_QmgPcAJ4AYABuAKIAfcXkgEIMzguMS4wLjGYAQCgAQGwAQrAAQE&sclient=gws-wiz");
	}
	
}
