package BasicData;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VerifyClinicAndNClinic extends Base{
  By roomtyp = By.xpath("(//button[@data-testid='roomTypeButton'])[2]");
  By minorOperation = By.xpath("(//label[@class='room-types__option room-types__option--clinical'])[1]");
  By treatment   = By.xpath("(//label[@class='room-types__option room-types__option--clinical'])[2]");
  By examination = By.xpath("(//label[@class='room-types__option room-types__option--clinical'])[3]");
  By consolting  = By.xpath("(//label[@class='room-types__option room-types__option--clinical'])[4]");
public void roomType()
{
	WebElement rType = driver.findElement(roomtyp);
	rType.click();
}
public void minoroperationsdd()
{
	/*<WebElement> moperation= driver.findElements(minorOperation);
	for(int i=0;i<moperation.size();i++)
	{
		String name=moperation.get(i).getText();
		if(name.equalsIgnoreCase("Minor operations"))
		{
			moperation.get(i).click();
		}
		else if(name.equalsIgnoreCase(name))
	}*/
	WebElement moperation = driver.findElement(minorOperation);
	moperation.click();
	WebElement trtment = driver.findElement(treatment);
	trtment.click();
	
}
public void examination()
{
	WebElement exanation = driver.findElement(examination);
	exanation.click();
}
public void consulting()
{
WebElement cnulting = driver.findElement(consolting);
cnulting.click();
}
}
