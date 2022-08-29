import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
 public static WebDriver driver;
	public void launch()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\softsuave\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://storefront:Cworld2018@qa.campingworld.com/account-login");
	driver.manage().window().maximize();
	
	}

}
