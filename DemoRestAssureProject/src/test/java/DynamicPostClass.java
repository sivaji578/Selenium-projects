import io.restassured.RestAssured;

import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import files.PayLoad;
import files.ReUsable;
public class DynamicPostClass {
@Test(dataProvider="BookData")
public void addBook(String isbn,String aisle)
{
		RestAssured.baseURI="http://216.10.245.166";
		String text=given().log().all().header("Content-Type","application/json").body(PayLoad.addBook(isbn,aisle)).when()
		.post("Library/Addbook.php ").then().log().all().statusCode(200).extract().response().asString();
		JsonPath js=ReUsable.rawToJson(text);
		String idN=js.getString("ID");
		System.out.println(idN);
}

@DataProvider(name="BookData")
public Object[][] getData()
{
	return new Object[][] {{"amkdd","6553"},{"ggkls","5967"},{"dgfss","4563"}};
}
}
	


