package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class stepdef {


	public static WebDriver driver;
	
	By email=By.xpath("//input[@type='email']");
	By password=By.xpath("//input[@type='password']");
	By signin  = By.xpath("//button[text()='SIGN IN']");
	By allHeadings=By.xpath("//a[@class='k-link']");
	By projectText=By.xpath("//a[text()='PROJECT MANAGER']");
	
	@Given("Open the landing page")
	public void open_the_landing_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\softsuave\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://jobtrack360.com/");
        driver.manage().window().maximize();
       
	}

	@When("Entering the valid creadiential like name and password")
	public void entering_the_valid_creadiential_like_name_and_password() {
		 WebElement userName=driver.findElement(email);
		    userName.sendKeys("vinny.nuthakki@gmail.com");
		    WebElement pasword=driver.findElement(password);
		    pasword.sendKeys("JobTrack1#$%^");
	}

	@Then("Enter the submit button")
	public void enter_the_submit_button() {
		WebElement submit=driver.findElement(signin);
    	submit.click();
	}

	@Then("Checking whether landing page details is showing or not")
	public void checking_whether_landing_page_details_is_showing_or_not() {
		List<WebElement> validationData=driver.findElements(allHeadings);
		for(int i=0;i<validationData.size()-1;i++)
		{
			String data=validationData.get(i).getText();
			System.out.println(data);
			if(data.equalsIgnoreCase("PROJECT MANAGER"))
			{
				String text=driver.findElement(projectText).getText();
				System.out.println(text);
				Assert.assertEquals(text, data);
			}
		}
		
	}
}
