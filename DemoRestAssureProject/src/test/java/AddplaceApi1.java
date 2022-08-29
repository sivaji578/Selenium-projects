import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;

import files.PayLoad;
import files.ReUsable;

public class AddplaceApi1 {
	public static void main(String[] args) throws IOException
	{
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response=given().log().all().queryParam("key","qaclick123").headers("Content-Type","application/json")
		.body(new String(Files.readAllBytes(Paths.get("C:\\Users\\softsuave\\Documents\\addPlace.txt")))).when().post("maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP")).extract().response()
		.asString();
		System.out.println(response);
		JsonPath js=new JsonPath(response);
		String responseValue=js.getString("place_id");
		System.out.println(responseValue);
		//Update PUT api
		String address1="70 Summer walk, USA";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json").body("{\r\n" + 
				"\"place_id\":\""+responseValue+"\",\r\n" + 
				"\"address\":\""+address1+"\",\r\n" + 
				"\"key\":\"qaclick123\"\r\n" + 
				"}").when().put("maps/api/place/update/json").then().log().all().assertThat().statusCode(200)
		.body("msg", equalTo("Address successfully updated"));
		//Get API
		String responseText=given().queryParam("key", "qaclick123")
		.queryParam("place_id","2a1de6b89d233f4cd8e69cb37f162c92").when().get("maps/api/place/get/json").then()
		.log().all().
		assertThat().statusCode(200).extract().response().asString();
		JsonPath js2=ReUsable.rawToJson(responseText);
		String actualAddress=js2.getString("address");
		System.out.println(actualAddress);
		Assert.assertEquals(actualAddress, address1);
	}

}
