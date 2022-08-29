package files;

import io.restassured.path.json.JsonPath;

public class ReUsable {
	public static JsonPath rawToJson(String responseText)
	{
		JsonPath js2=new JsonPath(responseText);
		return js2;
	}

}
