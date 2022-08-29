package BasicData;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Base {
	public static WebDriver driver;
	By logoutButton = By.xpath("//span[contains(text(),'Logout')]");
	By SignIn       = By.xpath("(//a[text()='Sign in'])[2]");
	By Email        = By.xpath("//input[@placeholder='Email']");
	By Password     = By.xpath("//input[@placeholder='Password']");
	By Submit      = By.xpath("//input[@type='submit']");
public void Launch() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\softsuave\\Downloads\\chromedriver_win32 (13)\\chromedriver.exe");
	//WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://test.ospace.co.uk/");
	WebElement sign  = driver.findElement(SignIn);
	sign.click();
	Thread.sleep(6000);
	WebElement emai  = driver.findElement(Email);
	emai.sendKeys("launchone@test.com");
	WebElement passwor= driver.findElement(Password);
	passwor.sendKeys("Login@123");
	WebElement submitt=driver.findElement(Submit);
	submitt.click();
}
}

