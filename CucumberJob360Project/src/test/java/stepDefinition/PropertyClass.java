package stepDefinition;
   // import cucumber.api.PendingException;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


	@RunWith(Cucumber.class)
	public class PropertyClass  {
		By createnew=By.xpath("(//a[@class='dropdown-toggle'])[2]");
		By proposal=By.xpath("//a[@id='prev_pg']");
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
        stepdef d=new stepdef();
	    @Given("^User entered the all valid details on valid fields$")
	    public void user_entered_the_all_valid_details_on_valid_fields() throws Throwable {
	    	d.open_the_landing_page();
	    	d.entering_the_valid_creadiential_like_name_and_password();
	    	d.enter_the_submit_button();
	    	WebElement createnew1=d.driver.findElement(createnew);
			createnew1.click();
			WebElement proposal1=d.driver.findElement(proposal);
			Actions a=new Actions(d.driver);
			a.moveToElement(proposal1).click().perform();
			//webDriverWait(PropertyNewAdd);
			Thread.sleep(5000);
			WebElement PropertyNewAdd1=d.driver.findElement(PropertyNewAdd);
			PropertyNewAdd1.click();
			Boolean propertypagetext=d.driver.findElement(TitleValidation).isDisplayed();
			if(propertypagetext.equals("ADD NEW PROPERTY"))
			{
				String data=d.driver.findElement(TitleValidation).getText();
				System.out.println(data);
			}
			if(propertypagetext.equals(false))
			{
				System.out.println("this is not opening as we expected page");
			}
	    }
  @When("^User submit the all propety details$")
   public void user_submit_the_all_propety_details() throws Throwable {
			WebElement houseNumber=d.driver.findElement(HouseNo);
			houseNumber.sendKeys("3434");
			WebElement city1=d.driver.findElement(cityA);
			city1.sendKeys("chennaio");
			WebElement stateDropdown1=d.driver.findElement(stateDropdown);
			stateDropdown1.click();
			List<WebElement> locations=d.driver.findElements(allLocations);
			for(int i=0;i<locations.size();i++)
			{
				String option=locations.get(i).getText();
				if(option.equalsIgnoreCase("ARKANSAS"))
				{
					locations.get(i).click();
					break;
				}
			}
			WebElement zipcodee=d.driver.findElement(zipcode1);
			zipcodee.sendKeys("524424");
			WebElement floorvalues=d.driver.findElement(floorvalue);
			floorvalues.sendKeys("3");
  }
			
	   

	    @Then("^User should get the property created confirm message$")
	    public void user_should_get_the_property_created_confirm_message() throws Throwable {
	       WebElement addButton=d.driver.findElement(add);
			addButton.click();
			
	    }

	    @And("^User should validate the validation message$")
	    public void user_should_validate_the_validation_message() throws Throwable {
	        throw new PendingException();
	    }

	}
