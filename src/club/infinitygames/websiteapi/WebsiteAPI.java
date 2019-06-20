package club.infinitygames.websiteapi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

import club.infinitygames.websiteapi.entity.User;

public class WebsiteAPI {
	public static WebsiteAPI api;
	
	public static WebsiteAPI get() {
		if(api == null) {
			api = new WebsiteAPI();
		}
		return api;
	}
	
	private String API_SERVER = null;
	private String API_KEY = null;
	private String API_VERSION = null;
	
	public WebsiteAPI() {
		API_SERVER = "http://infinitysky.dx.am/api";
		API_VERSION = "v2";
		API_KEY = "##### [ Removed for public release ] ######";
	}
	
	public String getUserAsJson(String identifier) throws Exception {
		String url = API_SERVER + "/" + API_VERSION + "/" + API_KEY + "/" + "userInfo?username=" + identifier;
		return get(url);
	}
	
	public User getUser(String identifier) throws Exception {
		Gson gson = new Gson();
		return gson.fromJson(getUserAsJson(identifier), User.class);
	}
	
	private String get(String url) throws Exception {
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", "InfinityGames");
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		return response.toString();
	}
}
