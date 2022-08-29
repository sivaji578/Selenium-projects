package stepDefinition;
//import cucumber.api.PendingException
    import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
	import cucumber.api.java.en.And;
	import cucumber.api.junit.Cucumber;
import junit.framework.Assert;

import org.junit.runner.RunWith;
    import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
    import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

	@RunWith(Cucumber.class)
	public class AddWork {
		By createnew=By.xpath("(//a[@class='dropdown-toggle'])[2]");
		By proposal=By.xpath("//a[@id='prev_pg']");
		By addclick=By.xpath("//button[@id='addWork']");
		By itemno  =By.xpath("//input[@name='itemNo1']");
		By description=By.xpath("//textarea[@name='itemDesc1']");
		By quantity=By.xpath("//input[@name='itemQty1']");
		By dropdownclick=By.xpath("//select[@class='itemUnit_Type']");
		By unitPrice =By.xpath("//input[@name='itemUnitPrice1']");
		By amount=By.xpath("//input[@name='itemAmount1']");
		By amountvlu=By.xpath("//input[@name='itemAmount1']");
		By subTotal=By.xpath("//span[@id='subTotalDisplayValue']");
		By selectfile=By.xpath("//label[@class='selectphoto_btn select_files_style']");
		
		By radioButton=By.xpath("//input[@value='AIA']");
		By retainageAmount=By.xpath("//input[@id='perctRetainage']");
		By notes=By.xpath("//textarea[@id='notes']");
		By generalCondition=By.xpath("//textarea[@name='generalConditions']");
		By paymentSchedule=By.xpath("//textarea[@name='paymentSchedule']");
		By saveDraft=By.xpath("//button[text()='Save as draft']");
		
		
        stepdef d=new stepdef();
        //PropertyClass p=new PropertyClass();
	    @Given("^User click on add work button$")
	    public void user_click_on_add_work_button() throws Throwable {
	    	d.open_the_landing_page();
	    	d.entering_the_valid_creadiential_like_name_and_password();
	    	d.enter_the_submit_button();
	    	//p.user_entered_the_all_valid_details_on_valid_fields();
	    	WebElement createnew1=d.driver.findElement(createnew);
			createnew1.click();
			WebElement proposal1=d.driver.findElement(proposal);
			Actions a=new Actions(d.driver);
			a.moveToElement(proposal1).click().perform();
			JavascriptExecutor js =(JavascriptExecutor)d.driver;
					js.executeScript("window.scrollBy(0,4000)","");
		    WebElement addclick1=d.driver.findElement(addclick);
	    	addclick1.click();
	    	Thread.sleep(6000);
	    	
	    	//Actions action = new Actions(d.driver);
	    	//action.moveToElement(description1).clickAndHold().moveByOffset(50, 500).release().perform();
	    	//action.moveToElement(description1, 22, 550); //moves to bottom right corner
	    	//action.clickAndHold();
	    	//action.moveByOffset(211, 1105); 
	    	//action.release();
	    	//action.perform();
	       
	    }

	    @When("^User filled the all details on the page$")
	    public void user_filled_the_all_details_on_the_page() throws Throwable {
	    	WebElement itemno1=d.driver.findElement(itemno);
	    	itemno1.sendKeys("25");
	    	WebElement description1=d.driver.findElement(description);
	    	description1.sendKeys("this is important we need to maintain security");
	    	WebElement textArea= description1;
	    	JavascriptExecutor executor = (JavascriptExecutor) d.driver;
	    	executor.executeScript("arguments[0].setAttribute('style', 'WIDTH:500px;HEIGHT:365px');", textArea);
	    	executor.executeScript("window.scrollBy(0,10)");
	    	executor.executeScript("window.scrollBy(0,-7)"); 
	    	WebElement quantity1=d.driver.findElement(quantity);
	    	quantity1.sendKeys("25");
	    	Select s=new Select(d.driver.findElement(dropdownclick));
	    	s.selectByIndex(3);
	    	WebElement unitprice1=d.driver.findElement(unitPrice);
	    	unitprice1.sendKeys("10");
	    	WebElement amount1=d.driver.findElement(amount);
	    	amount1.click();
	    	WebElement amountvalue=d.driver.findElement(amountvlu);
	    	String amountValue1=amountvalue.getText();
	    	System.out.println("This is total amount value"+amountValue1);
	    	WebElement data=d.driver.findElement(subTotal);
	        String  value=data.getText();
	        System.out.println("This is total value"+value);
	        //Assert.assertEquals(value, amountValue1);
	        WebElement selectfile1=d.driver.findElement(selectfile);
	        selectfile1.click();
	        System.out.println("Sivaji file uploading testing");
	       // selectfile1.sendKeys("C:\\Users\\softsuave\\package-lock.json");
	        Thread.sleep(4000);
	        Runtime.getRuntime().exec("C:\\Users\\softsuave\\Desktop\\AutoIt\\FileUpload.exe");
	        WebElement button=d.driver.findElement(radioButton);
	        button.click();
	        WebElement ramount=d.driver.findElement(retainageAmount);
	        ramount.sendKeys("10");
	        WebElement textNotes=d.driver.findElement(notes);
	        textNotes.sendKeys("Iam entering testing data here for just testing purpose");
	        WebElement description2=d.driver.findElement(generalCondition);
	        WebElement descSize=description2;
	        executor.executeScript("arguments[0].setAttribute('style', 'WIDTH:400px;HEIGHT:400px');", descSize);
	        WebElement paymentScheduleText=d.driver.findElement(paymentSchedule);
	        paymentScheduleText.sendKeys("this is for entering data only");
	        
	        
	    }
	    @And("^User should verify the work flow is created or not$")
	    public void user_should_verify_the_work_flow_is_created_or_not() throws Throwable {
	        WebElement saveDraftButton=d.driver.findElement(saveDraft);
	        saveDraftButton.click();
	    }

	

}
