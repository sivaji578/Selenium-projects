import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

import Pojo.Location;
import Pojo.SerializationAddPlace;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
public class SpecBuilderTest {
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
	 RequestSpecification req=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addQueryParam("key","qaclick123")
	 .setContentType(ContentType.JSON).build();
	 ResponseSpecification resspe=new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
	RequestSpecification res= given().spec(req).body(sap);
	 Response response=res.when().post("/maps/api/place/add/json").then().log().all().spec(resspe).extract().response();
	String responsestring=response.asString();
	System.out.println(responsestring+"for testing purpose");
	
	}

}
