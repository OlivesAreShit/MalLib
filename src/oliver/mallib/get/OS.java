package oliver.mallib.get;

public class OS {
	
	/**
	 * Gets the name of the OS in a string.
	 */
	public static String getOSName() {
		return System.getProperty("os.name");
	}
	
	/**
	 * Gets the version of the OS in a string.
	 */
	public static String getOSVersion() {
		return System.getProperty("os.version");
	}
	
	/**
	 * Gets the architecture of the OS in a string.
	 * ex: "amd64"
	 */
	public static String getOSArchitecture() {
		return System.getProperty("os.arch");
	}
	
}
