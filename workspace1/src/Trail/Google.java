package Trail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Google extends Multi{
	
	public Google(WebDriver driver) {
		super(driver);
	}
	public void setDataValue()
	{
		WebElement glgoole=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		glgoole.sendKeys("Naveen automation");
		glgoole.click();
		driver.findElements(By.xpath("//h3")).stream().forEach(ele-> System.out.println(ele.getText()));
	}
	public void tearDown()
	{
		driver.quit();
	}


}
