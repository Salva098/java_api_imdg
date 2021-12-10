package javaapi_imdg;

import java.io.IOException;
import java.net.HttpURLConnection;

import org.json.JSONObject;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;


public class mainapp {
	private static HttpURLConnection connection;

	public static void main(String[] args) {
		
		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder().url("https://imdb-api.com/en/API/Title/k_d5pbojc1/tt1375666").build();
		Response response;
		try {
			response = client.newCall(request).execute();
			var a= response.body().string();
			JSONObject json = new JSONObject(a);
			var ab = json.get("title");
			
			System.out.println(ab); 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
