package TestData.JobTrack360Maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ValidationClassTest extends CreateNewProposal{
	By allHeadings=By.xpath("//h4");
	By subHeadings=By.xpath("//label[@for='jobTypeFilterRadio']");
@Test

public void allValidationHeadings() throws InterruptedException
{
	Basic b=new Basic();
	b.first();
	newData();
	List<WebElement> allhead=driver.findElements(allHeadings);
	for(int i=0;i<allhead.size()-1;i++)
	{
		String data=allhead.get(i).getText();
		System.out.println(data);
		if(data.equalsIgnoreCase("Job Type"))
		{
			List<WebElement> subhead=driver.findElements(subHeadings);
			for(int j=0;j<i;j++)
			{
				String subdata=subhead.get(j).getText();
				System.out.println("Main HEADING"+data+"SUBheadingds"+subdata);
				System.out.println("Checking"+j);
			}
		}
	}
}
}
