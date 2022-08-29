package PageModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	WebDriver driver;
	Object o;
	
	public void data()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\softsuave\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("www.amazon.co.in");
	}
	
	public void data2()
	{
		o=new Object();
		o.trail("shirt");
	}

}
