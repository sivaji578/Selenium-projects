import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

import Pojo.Location;
import Pojo.SerializationAddPlace;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class SeariliazeTest {
	public static void main(String[] args)
	{
	 RestAssured.baseURI="https://rahulshettyacademy.com";
	 SerializationAddPlace sap=new SerializationAddPlace();
	 sap.setAccuracy(50);
	 sap.setAddress("29, side layout, cohen 09");
	 sap.setLangauge("French-In");
	 sap.setPhoneNumber("(+91) 983 893 3937");
	 sap.setWebsite("https://rahulshettyacademy.com");
	 sap.setName("Front line house");
	 List<String> myList=new ArrayList<String>();
	 myList.add("shoe park");
	 myList.add("shop");
	 sap.setTypes(myList);
	 Location l=new Location();
	 l.setLat(-38.383494);
	 l.setLog(33.436787);
	 sap.setLocations(l);
	Response res= given().log().all().queryParam("key","qaclick123").body(sap).when()
	 .post("/maps/api/place/add/json").then().log().all().assertThat().statusCode(200).extract().response();
	String responsestring=res.asString();
	System.out.println(responsestring);
	
	}

}
