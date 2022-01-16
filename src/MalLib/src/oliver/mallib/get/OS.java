package oliver.mallib.get;

public class OS {
	
	public static String getOSName() {
		return System.getProperty("os.name");
	}
	
	public static String getOSVersion() {
		return System.getProperty("os.version");
	}
	
	public static String getOSArchitecture() {
		return System.getProperty("os.arch");
	}
	
}
