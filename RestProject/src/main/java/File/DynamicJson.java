package File;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
@Test(dataProvider="BookData")
public class DynamicJson {
	public void addBook(String asgs,String ckyl)
	{
		String response=RestAssured.baseURI="http://216.10.245.166";
		given().header("Content-Type","application/json").body(PayLoad.AddBook("asgs","ckyl"))
		.when().log().all().post("/Library/Addbook.php").then().assertThat().statusCode(200).extract()
		.response().toString();
		JsonPath js=ReusableMethods.rawJson(response);
		String id=js.get("ID");
		System.out.println(id);
	}
	@DataProvider(name="BookData")
	public Object[][] getData()
	{
		return new Object[][] {{"astd","6789"},{"ndks","8564"},{"hfjd","4673"}};
	}

}
