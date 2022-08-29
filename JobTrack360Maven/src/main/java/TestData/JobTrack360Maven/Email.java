package TestData.JobTrack360Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Email extends Basic {
	By google=By.xpath("//input[@class='gLFyf gsfi']");
	//By googleLogin=By.xpath("//h3[text()='Gmail - Google']");
	By emailButton=By.xpath("//h3[text()='Email. Login']");
	By mailCreadientials=By.xpath("(//div[@class='WBW9sf'])[2]");
	
	public void loginFlow() throws InterruptedException
	{
		WebElement gogle=driver.findElement(google);
		gogle.sendKeys("email login");
		gogle.sendKeys(Keys.ENTER);
		Thread.sleep(6000);
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		boolean status=js.executeScript("document.readyState").toString().equals("complete");
		if(status)
		{
			System.out.println("page is loading");
		}
		else
		{
			System.out.println("page is not loading");
		}
		*/
		WebElement emailBtn=driver.findElement(emailButton);
		emailBtn.click();
	    WebElement mailcreadientials1=driver.findElement(mailCreadientials);
	    mailcreadientials1.click();
	    
	}

}
