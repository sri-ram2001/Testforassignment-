package org.appl;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class apJsonread {
public static void main(String[] args) throws IOException, ParseException {
	FileReader FR= new FileReader("C:\\Users\\srira\\eclipse-workspace\\API\\src\\test\\resources\\Json\\task.json");

	JSONParser JP= new JSONParser();
	Object p = JP.parse(FR);
    JSONObject l=(JSONObject)p;
    Object m = l.get("data");
    JSONArray ja= (JSONArray)m;
    Object ob = ja.get(3);
    JSONObject pl=(JSONObject)ob;
    System.out.println("Name:"+pl.get("id").toString());
    System.out.println("Email:"+pl.get("email").toString());
    System.out.println("FirstName:"+pl.get("first_name").toString());
    System.out.println("Lastname:"+pl.get("last_name").toString());
    System.out.println("Avatar"+pl.get("avatar").toString());

}
}
