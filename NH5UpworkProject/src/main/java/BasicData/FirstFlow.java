package BasicData;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


 
public class FirstFlow extends Base
{
	By titleValidation=By.xpath("//h1[@class='banner__heading']");

	public void flow() throws InterruptedException
	{
		Thread.sleep(4000);
	WebElement title=driver.findElement(titleValidation);
	 String titleText=title.getText();
	 System.out.println("Testing"+titleText);
	 String exactText="Find and book clinical, group and workspace rooms";
	 Thread.sleep(2000);
	 Assert.assertEquals(titleText,exactText);
	}
}
