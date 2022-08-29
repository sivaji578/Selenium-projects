import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstClass {
	WebDriver driver;
	By firstemail=By.xpath("//input[@placeholder='Enter Email Here']");
	By checkbox=By.xpath("//span[@class='bx-component  bx-checkshape']");
	By continuebutton=By.xpath("//button[text()='Continue to site ']");
	By email=By.xpath("//input[@placeholder='Email Address']");
	By password=By.xpath("//input[@placeholder='Password']");
	By submit=By.xpath("//button[@value='Login']");
	By liveMessage=By.xpath("//img[@alt='Live chat']");
	By searchField=By.xpath("//div[@class='lp_input_area lpc_composer__text-area-wrapper lpc_desktop']");
	public FirstClass(WebDriver driver)
	{
		this.driver=driver;
	}
	public void login() throws InterruptedException
	{
		//Thread.sleep(12000);
	
		Thread.sleep(13000);
		WebElement firstemail1=driver.findElement(firstemail);
		//firstemail1.sendKeys("Srikanth@softsuave.com");
		if(firstemail1.isDisplayed())
		{
			//WebElement firstemail2=driver.findElement(firstemail);
			System.out.println("this is executing");
			firstemail1.sendKeys("Srikanth@softsuave.com");
			Thread.sleep(2000);
			WebElement checkBox1=driver.findElement(checkbox);
			checkBox1.click();
			WebElement continuebutton1=driver.findElement(continuebutton);
			continuebutton1.click();
		}
		Thread.sleep(7000);
		System.out.println("this is second one");
		driver.findElement(email).sendKeys("srikanth@softsuave.com");
		driver.findElement(password).sendKeys("Sivaji578");
		driver.findElement(submit).click();
		Thread.sleep(8000);
		WebElement liveMessage1=driver.findElement(liveMessage);
		if(liveMessage1.isDisplayed())
		{
		liveMessage1.click();
		Thread.sleep(11000);
	//	WebDriverWait wait=new WebDriverWait(driver,25);
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(searchField));
		System.out.println("this is third execution testing");
		WebElement search=driver.findElement(searchField);
		
		search.sendKeys("how can i found out good product");
		search.sendKeys(Keys.ENTER);
		}

	}
	
}
