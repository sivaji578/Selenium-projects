package TestData.pageObjectModuleJobTrack360;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Starting {
	public static WebDriver driver;
	By email=By.xpath("//input[@type='email']");
	By password=By.xpath("//input[@type='password']");
	By signin  = By.xpath("//button[text()='SIGN IN']");
	public void first() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\softsuave\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jobtrack360.com/");
		WebElement Email1=driver.findElement(email);
		Thread.sleep(3000);
		Email1.sendKeys("vinny.nuthakki@gmail.com");
		WebElement Password1=driver.findElement(password);
		Password1.sendKeys("JobTrack1#$%^");
		WebElement Signin1 =driver.findElement(signin);
		Signin1.click();
	}
}


