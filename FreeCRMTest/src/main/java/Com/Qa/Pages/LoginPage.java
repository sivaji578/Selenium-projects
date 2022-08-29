package Com.Qa.Pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Qa.Page.BaseClassData.TestBase;

public class LoginPage extends TestBase {
	//Page Factory Elements
	//@FindBy(name="username")
	//@FindBy()
	//WebElement username;
	//@FindBy(name="password")
	//WebElement password;
	@FindBy(xpath="//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")
	WebElement LoginBtn;
	@FindBy(xpath="//a[@class='btn btn-sm btn-primary btn-icon btn-icon-left btn-shadow btn-border btn-rect offset-sm-top-60 offset-top-30']")
	WebElement SignUpBtn;
	@FindBy(xpath="(//span[text()='your business cloud partner '])[1]")
	WebElement textValidation;
	//Intializing the page objects
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	//Actions
	public String validateLoginPage()
	{
	  //return driver.getTitle();	
		return driver.getTitle();
	}
	public boolean validateCrmText()
	{
		return textValidation.isEnabled();
	}
	public HomePage login(String un,String pwd)
	{
		//username.sendKeys(un);
		//password.sendKeys(pwd);
		LoginBtn.click();
		return new HomePage();
	}

}
