package Com.Qa.Page.BaseClassData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.Qa.Values.Utils.TestUtils;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public TestBase()
	{
		try {
			prop=new Properties();
			FileInputStream fis=new FileInputStream("C:\\Users\\softsuave\\WorkSiteLabs\\FreeCRMTest\\src\\main\\java\\Com\\Qa\\Values\\Config\\Config.properties");
			prop.load(fis);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void intialization()
	{
		String browserName=prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\softsuave\\Downloads\\chromedriver_win32 (10)\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUTS, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICITE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}
