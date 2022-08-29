import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Pojo.Api;
import Pojo.getCourse;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;

public class OauthProgram {

	public static void main(String[] args) {
		String[] courseTitle= {"Selenium Webdriver Java","Protractor","Cypresss","feter"};
		System.setProperty("webdriver.chrome.driver","C:\\Users\\softsuave\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.googleapis.com/oauth2/v4/token?code=4%2F0AY0e-g6UUD1-sMKIpsxzb520ZVflKe7i8xD_oQk6X3t_fjDqhaROnrJncgGX7dEF0jllVg&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&client_secret=erZOWM9g3UtwNRj340YYaK_W&redirect_uri=https://rahulshettyacademy.com/getCourse.php&grant_type=authorization_code#");
		String accessTokenResponse=given().queryParams("code", "")
		.queryParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		.queryParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
		.queryParams("redirect_uri", "https://rahulshettyacademy.com/getCourse.php")
		.queryParams("grant_type", "authorization_code").when().log().all().post("https://www.googleapis.com/oauth2/v4/token").asString();
		JsonPath js=new JsonPath(accessTokenResponse);
		String tokenNumber=js.getString("access_token");
		System.out.println(tokenNumber);
				
		getCourse gc=given().queryParam("access_token",tokenNumber).expect().defaultParser(Parser.JSON).when().get("https://rahulshettyacademy.com/getCourse.php").as(getCourse.class);
        System.out.println(gc);
        System.out.println(gc.getLinkedin());
        List<Api> apiCourses=gc.getCourses().getApi();
		for(int i=0;i<apiCourses.size();i++)
		{
			if(apiCourses.get(i).getCourseTitle().equalsIgnoreCase("SoapUI Webservices testing"))
					{
				System.out.println(apiCourses.get(i).getPrice());
					}
		}
		
		//Get the course names of WebAutomation
		ArrayList<String> a= new ArrayList<String>();
		
	
		
		List<String> expectedList=	Arrays.asList(courseTitle);
		
		Assert.assertTrue(a.equals(expectedList));
		
		
		
		
		
		
		//System.out.println(response);
		
		
	}



	}


