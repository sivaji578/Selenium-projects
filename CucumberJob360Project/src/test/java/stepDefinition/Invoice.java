package stepDefinition;
    import cucumber.api.PendingException;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.When;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.And;
	import cucumber.api.junit.Cucumber;
import junit.framework.Assert;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

@RunWith(Cucumber.class)
	public class Invoice {
		By invoiceSymbol=By.xpath("//i[@class='icons8-credit-card']");
		By invoice      =By.xpath("//span[text()='Invoices']");
		By allHeadingsInvoice=By.xpath("//a[@class='k-link']");
		By actionDropdown=By.xpath("//button[@class='btn dropdown-toggle selectpicker btn-default']");
	    By columnEmployList=By.xpath("//tr[@data-uid='d3c33205-0e80-468f-8de4-bf78a09289e0']");
	    By search=By.xpath("//input[@placeholder='Search by Address, Project#, Client, Invoice#']");
	    By listInvoices=By.xpath("//tbody[@role='rowgroup']");
	    By pay          =By.xpath("//a[@class='edit-button-grid']");
	    By newPayment   =By.xpath("//input[@id='dollarinput']");
	    By calendarSymbol=By.xpath("//span[@class='k-icon k-i-calendar']");
	    By calendarDate =By.xpath("//a[@tabindex='-1']");
	    By checkNumber  =By.xpath("//input[@placeholder='Check']");
	    By add          =By.xpath("//button[@class='save_btn top_btn']");
	    By paybuttonn   =By.xpath("//button[@onclick='submitPayment()']");
	    By successfulTextMsg=By.xpath("//h4[text()='Payment was added successfully.']");
	    
	    stepdef d=new stepdef();
		@Given("^Click on invoice button$")
		
	    public void click_on_invoice_button() throws Throwable {
			d.open_the_landing_page();
			d.entering_the_valid_creadiential_like_name_and_password();
			d.enter_the_submit_button();
			Actions a=new Actions(d.driver);
			WebElement insymbol=d.driver.findElement(invoiceSymbol);
			a.moveToElement(insymbol).build().perform();
			WebElement invoiceModule=d.driver.findElement(invoice);
			invoiceModule.click();
			Thread.sleep(5000);
			List <WebElement> allTableHeadings=d.driver.findElements(allHeadingsInvoice);
			int i;
			for(i=0;i<allTableHeadings.size()-1;i++)
			{
				String HeadingText=allTableHeadings.get(i).getText();
				System.out.println("           "+HeadingText+"         ");
			}
			List <WebElement> actionDropdownBoxes=d.driver.findElements(actionDropdown);
			Thread.sleep(3000);
			int j;
			for(j=0;j<actionDropdownBoxes.size()-1;j++)
			{
				String dropdownText=actionDropdownBoxes.get(j).getText();
				System.out.println(dropdownText);
				if(dropdownText.equalsIgnoreCase("void"))
				{
					WebElement columnlistt=d.driver.findElement(columnEmployList);
					String columnText=columnlistt.getText();
					System.out.println("           "+columnText+"      ");
				}
			}
	       
	    }

	    @When("^Pay the invoice money in details page$")
	    public void pay_the_invoice_money_in_details_page() throws Throwable {
	    	WebElement invoicefilter=d.driver.findElement(search);
	    	invoicefilter.sendKeys("1701");
	    	invoicefilter.sendKeys(Keys.ENTER);
	    	WebElement listofinvoices=d.driver.findElement(listInvoices);
	    	String invoiceText=listofinvoices.getText();
	    	System.out.println(invoiceText);
	    	Thread.sleep(4000);
	    	WebElement paybutton=d.driver.findElement(pay);
	    	System.out.println("Sivaji");
	    	paybutton.click();
	    	WebElement newPayment1=d.driver.findElement(newPayment);
	    	newPayment1.sendKeys("10");
	    	WebElement calendarSymbol1=d.driver.findElement(calendarSymbol);
	    	calendarSymbol1.click();
	    	List<WebElement> dates=d.driver.findElements(calendarDate);
	    	int k;
	    	for(k=0;k<dates.size();k++)
	    	{
	    		String date=dates.get(k).getText();
	    		if(date.equalsIgnoreCase("20"))
	    		{
	    			dates.get(k).click();
	    			break;
	    		}
	    	}
	    	
	    	
	     
	    }

	    @Then("^User checking the status weather it will change paid or not$")
	    public void user_checking_the_status_weather_it_will_change_paid_or_not() throws Throwable {
	   
	      WebElement checkNumber1=d.driver.findElement(checkNumber);
	      checkNumber1.sendKeys("12");
	      WebElement add1=d.driver.findElement(add);
	      add1.click();
	    //  WebElement paybutton2=d.driver.findElement(paybuttonn);
	      Actions b=new Actions(d.driver);
	      WebElement paybutton2=d.driver.findElement(paybuttonn);
	      b.moveToElement(paybutton2).click().build().perform();
	      
	      //paybutton2.click();
	      
	    }

	    @And("^Checking the user saved details$")
	    public void checking_the_user_saved_details() throws Throwable {
	    	Thread.sleep(6000);
	    	//WebElement successmsg=d.driver.findElement(successfulTextMsg);
	    	//String sText=successmsg.getText();
	    	//System.out.println(sText);
	    	String actualText="Payment was added successfully.";
	    //	Assert.assertEquals(sText, actualText);
	        
	    }

	

}
