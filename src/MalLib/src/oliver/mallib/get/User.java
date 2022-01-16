package oliver.mallib.get;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class User {
	
	public static String getUserLanguage() {
		return System.getProperty("user.language");
	}
	
	public static String getUserCountry() {
		return System.getProperty("user.country");
	}
	
	public static String getUserName() {
		return System.getProperty("user.name");
	}
	
	public static String getUserIP() {
		
		String ip = "127.0.0.1";
		try {
			URL url;
			url = new URL("http://checkip.amazonaws.com/");
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			ip = (br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return ip;
	}
	
}
