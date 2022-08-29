package TestData.JobTrack360Maven;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CompingClass extends Basic{
	By firstemail=By.xpath("//div[@class='bx-inputwrap']");
	By continuebutton=By.xpath("//button[text()='Continue to site ']");
	By email=By.xpath("//span[text()='Email Address']");
	By password=By.xpath("//span[text()='Password']");
	By submit=By.xpath("//button[@value='Login']");
	By form = By.id("bx-form-1176068-step-1");
	
	public void first() throws InterruptedException
	{
		Thread.sleep(12000);
		WebElement firstemail1=driver.findElement(firstemail);
		firstemail1.sendKeys("Srikanth@softsuave.com");
		if(firstemail1.isDisplayed())
		{
			firstemail1.sendKeys("Srikanth@softsuave.com");
			WebElement continuebutton1=driver.findElement(continuebutton);
			continuebutton1.click();
		}
		Thread.sleep(4000);
		driver.findElement(email).sendKeys("srikanth@softsuave.com");
		driver.findElement(password).sendKeys("Sivaji578");
		driver.findElement(submit);
		
	}

}
