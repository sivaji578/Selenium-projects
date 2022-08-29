package PageModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Object {
 WebDriver driver;
	By search=By.xpath("//input[@id='twotabsearchtextbox']");
	public void trail(String str)
	{
		WebElement da=driver.findElement(search);
		da.sendKeys(str);
		
	}


}
