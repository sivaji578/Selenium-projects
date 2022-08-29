package stepDefinition;


	import cucumber.api.java.en.When;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.And;
    import cucumber.api.java.en.Given;
    import cucumber.api.junit.Cucumber;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

	
	public class newProposal {
		public static WebDriver driver;
	
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
	
		stepdef d=new stepdef();
	    @Given("^User click on create button and select the needful one$")
	    public void user_click_on_create_button_and_select_the_needful_one() throws Throwable {
	    	
	    	d.open_the_landing_page();
	    	d.entering_the_valid_creadiential_like_name_and_password();
	    	d.enter_the_submit_button();
	    	Thread.sleep(6000);
	      	WebElement createNew1= d.driver.findElement(createnew);
	    	createNew1.click();
	    	WebElement proposal1= d.driver.findElement(proposal);
	    	proposal1.click();
	    	WebElement clientAddNew1= d.driver.findElement(clientAddNew);
			clientAddNew1.click();
		}

	    @When("^User should be click on proposal button and entering the all details$")
	    public void user_should_be_click_on_proposal_button_and_entering_the_all_details() throws Throwable {
	    	WebElement firstname1=d.driver.findElement(firstName);
			firstname1.sendKeys("sekhar");
			WebElement lastname1=d.driver.findElement(lastName);
			lastname1.sendKeys("Kasi");
			//webDriverWait(selectResource);
			WebElement selectResource1=d.driver.findElement(selectResource);
			selectResource1.click();
			List<WebElement> selectAllLocations=d.driver.findElements(selectResourcelocation);
			for(int i=0;i<=selectAllLocations.size()-1;i++)
			{
				String alllocations=selectAllLocations.get(i).getText();
				if(alllocations.equalsIgnoreCase("Engineer"))
				{
					selectAllLocations.get(i).click();
					break;
				}
			}
//			WebElement selectResourcelocation1=d.driver.findElement(selectResourcelocation);
//			selectResourcelocation1.click();
			WebElement email1=d.driver.findElement(email);
			email1.sendKeys("sivaji@softsuave.com");
			WebElement phone1=d.driver.findElement(phone);
			phone1.sendKeys("9490076662");
			WebElement address1=d.driver.findElement(address);
			address1.sendKeys("nellore,Tamilnadu,524476");
			WebElement city1=d.driver.findElement(city);
			city1.sendKeys("chennai");
			WebElement selectState1=d.driver.findElement(selectState);
			selectState1.click();
			List<WebElement> data=d.driver.findElements(allStates);
		    for(int i=0;i<=data.size();i++)
		    {
		    	String datatext=data.get(i).getText();
		    	if(datatext.equalsIgnoreCase("ARKANSAS"))
		    	{
		    	  data.get(i).click();
		    	  break;
		    	}
		    }
		    WebElement zipcode1=d.driver.findElement(zipcode);
		    zipcode1.sendKeys("54365");
	    }

	    @Then("^User submit the details$")
	    public void user_submit_the_details() throws Throwable {
	    	WebElement submit1=d.driver.findElement(submit);
	    	System.out.println("before test");
		    submit1.click();
		 	System.out.println("after test");
		 	d.driver.navigate().back();
	    }

	    @And("^Proposal is created or not user should be validate$")
	    public void proposal_is_created_or_not_user_should_be_validate() throws Throwable {
	        
	    }

	}


