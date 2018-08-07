package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import com.google.gson.Gson;

public class Main {

	public static void main(String[] args) {
		
		Gson gson = new Gson();
		
		String json = "";
		try {
			String courseNumber = "6285";
			String endpoint = "courses/" + courseNumber + "/schedule.json";
			String apiKey = "02caa6bf5b7163ecb0a358e89530505c";
			String params = "term=1189";
			URL url = new URL(String.format("https://api.uwaterloo.ca/v2/%s.json?key=%s%s", endpoint, apiKey, params.equals("") ? "": "&"+params));
			URLConnection conn = url.openConnection();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String finalOutput = "";
			
			String line;
			while((line = br.readLine()) != null){
				finalOutput += finalOutput.equalsIgnoreCase("")? line : "\n"+line;
			}
			json = finalOutput;
		} catch (IOException e) {
			e.printStackTrace();
		}
		Course test = gson.fromJson(json, Course.class);
		System.out.println(test.getData().title);
	}
}
