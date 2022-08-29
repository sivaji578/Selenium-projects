package TestData.JobTrack360Maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class CreateNewProposal extends Basic {
	By createnew=By.xpath("(//a[@class='dropdown-toggle'])[2]");
	By proposal=By.xpath("//a[@id='prev_pg']");
	By clientAddNew=By.xpath("(//span[@class='newProposalInlineText1'])[1]");
	By firstName=By.xpath("//input[@id='Name']");
	By lastName=By.xpath("//input[@id='LastName']");
	By selectResource=By.xpath("(//button[@class='btn dropdown-toggle selectpicker btn-default'])[1]");
	By selectResourcelocation=By.xpath("//a[@tabindex='0']");
	By email=By.xpath("//input[@id='EMail']");
	By phone=By.xpath("//input[@id='Phone1']");
	By address=By.xpath("//input[@id='Address']");
	By city=By.xpath("//input[@id='City']");
	By selectState=By.xpath("(//button[@class='btn dropdown-toggle selectpicker btn-default'])[2]");
	By allStates=By.xpath("//a[@tabindex='0']");
	By zipcode=By.xpath("//input[@id='Zip']");
	By submit=By.xpath("//button[@class='save_btn top_btn']");
	By PropertyNewAdd=By.xpath("(//span[@class='newProposalInlineText1'])[2]");
	By TitleValidation=By.xpath("//h1[text()='ADD NEW PROPERTY']");
	By HouseNo=By.xpath("//input[@name='streetValue']");
	By cityA=By.xpath("//input[@name='citydropdown']");
	By stateDropdown=By.xpath("//button[@class='btn dropdown-toggle selectpicker btn-default']");
	By allLocations=By.xpath("//span[@class='text']");
	By zipcode1 =By.xpath("//input[@id='zipValue']");
	By floorvalue=By.xpath("//input[@id='floorValue']");
	By add=By.xpath("//button[@type='submit']");
	By addNew=By.xpath("//a[@id='architectId']");
	By heading=By.xpath("//h1[@class='text-center']");
	By allHeadings=By.xpath("//label[@class='txt_label']");
	By firstNameB=By.xpath("//input[@id='Name']");
	By addButton=By.xpath("//button[text()='ADD']");
	public void newData()
	{
		
		webDriverWait(clientAddNew);
		WebElement clientAddNew1=driver.findElement(clientAddNew);
		clientAddNew1.click();
		WebElement firstname1=driver.findElement(firstName);
		firstname1.sendKeys("sekhar");
		WebElement lastname1=driver.findElement(lastName);
		lastname1.sendKeys("Kasi");
		webDriverWait(selectResource);
		WebElement selectResource1=driver.findElement(selectResource);
		selectResource1.click();
		WebElement selectResourcelocation1=driver.findElement(selectResourcelocation);
		selectResourcelocation1.click();
		WebElement email1=driver.findElement(email);
		email1.sendKeys("sivaji@softsuave.com");
		WebElement phone1=driver.findElement(phone);
		phone1.sendKeys("9490076662");
		WebElement address1=driver.findElement(address);
		address1.sendKeys("nellore,Tamilnadu,524476");
		WebElement city1=driver.findElement(city);
		city1.sendKeys("chennai");
		WebElement selectState1=driver.findElement(selectState);
		selectState1.click();
		List<WebElement> data=driver.findElements(allStates);
	    for(int i=0;i<=data.size();i++)
	    {
	    	String datatext=data.get(i).getText();
	    	if(datatext.equalsIgnoreCase("ARKANSAS"))
	    	{
	    	  data.get(i).click();
	    	  break;
	    	}
	    }
	    WebElement zipcode1=driver.findElement(zipcode);
	    zipcode1.sendKeys("54365");
	    WebElement submit1=driver.findElement(submit);
	    submit1.click();
	   	}
	public void propertyAddress() throws InterruptedException
	{
		WebElement createnew1=driver.findElement(createnew);
		createnew1.click();
		WebElement proposal1=driver.findElement(proposal);
		Actions a=new Actions(driver);
		a.moveToElement(proposal1).click().perform();
		//webDriverWait(PropertyNewAdd);
		Thread.sleep(5000);
		WebElement PropertyNewAdd1=driver.findElement(PropertyNewAdd);
		PropertyNewAdd1.click();
		Boolean propertypagetext=driver.findElement(TitleValidation).isDisplayed();
		if(propertypagetext.equals("ADD NEW PROPERTY"))
		{
			String data=driver.findElement(TitleValidation).getText();
			System.out.println(data);
		}
		if(propertypagetext.equals(false))
		{
			System.out.println("this is not opening as we expected page");
		}
		WebElement houseNumber=driver.findElement(HouseNo);
		houseNumber.sendKeys("3434");
		WebElement city1=driver.findElement(cityA);
		city1.sendKeys("chennaio");
		WebElement stateDropdown1=driver.findElement(stateDropdown);
		stateDropdown1.click();
		List<WebElement> locations=driver.findElements(allLocations);
		for(int i=0;i<locations.size();i++)
		{
			String option=locations.get(i).getText();
			if(option.equalsIgnoreCase("ARKANSAS"))
			{
				locations.get(i).click();
				break;
			}
		}
		WebElement zipcodee=driver.findElement(zipcode1);
		zipcodee.sendKeys("524424");
		WebElement floorvalues=driver.findElement(floorvalue);
		floorvalues.sendKeys("3");
		WebElement addButton=driver.findElement(add);
		addButton.click();
		}
	public void architechEngineer() throws InterruptedException
	{
		WebElement addNewButton=driver.findElement(addNew);
		addNewButton.click();
		WebElement text=driver.findElement(heading);
		String textdata=text.getText();
		System.out.println(textdata+"this is heading");
		String expected="Add Architect / Engineer";
		Assert.assertEquals(textdata, expected);
		List<WebElement> totalHeadings=driver.findElements(allHeadings);
		for(int j=0;j<totalHeadings.size();j++)
		{
			String totalText=totalHeadings.get(j).getText();
			System.out.println(totalText);
		}
		WebElement firstNameText=driver.findElement(firstNameB);
		firstNameText.sendKeys("Sivaji");
		WebElement lastname1=driver.findElement(lastName);
		lastname1.sendKeys("Kasi");
		webDriverWait(selectResource);
		WebElement selectResource1=driver.findElement(selectResource);
		selectResource1.click();
		List<WebElement> selectResourcelocation1=driver.findElements(selectResourcelocation);
		System.out.println("SIvaji");
		for(int j=1;j<=selectResourcelocation1.size()-1;j++)
		{
			String textElements=selectResourcelocation1.get(j).getText();
			if(textElements.equalsIgnoreCase("Architect"))
			{
				selectResourcelocation1.get(j).click();
				break;
			}
		}
		//selectResourcelocation1.click();
		WebElement email1=driver.findElement(email);
		email1.sendKeys("sivaji@softsuave.com");
		WebElement phone1=driver.findElement(phone);
		phone1.sendKeys("9490076662");
		WebElement address1=driver.findElement(address);
		address1.sendKeys("nellore,Tamilnadu,524476");
		WebElement city1=driver.findElement(city);
		city1.sendKeys("chennai");
		WebElement selectState1=driver.findElement(selectState);
		selectState1.click();
		List<WebElement> data=driver.findElements(allStates);
	    for(int i=0;i<=data.size();i++)
	    {
	    	String datatext=data.get(i).getText();
	    	if(datatext.equalsIgnoreCase("ARKANSAS"))
	    	{
	    	  data.get(i).click();
	    	  break;
	    	}
	    }
	    WebElement zipcode1=driver.findElement(zipcode);
	    zipcode1.sendKeys("54365");
	    Thread.sleep(4000);
	    WebElement adbutton=driver.findElement(addButton);
	    System.out.println("SN");
	    adbutton.click();
		
		
	}

}
