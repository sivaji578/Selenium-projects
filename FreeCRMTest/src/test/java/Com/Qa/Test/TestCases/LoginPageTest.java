package Com.Qa.Test.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Qa.Page.BaseClassData.TestBase;
import Com.Qa.Pages.HomePage;
import Com.Qa.Pages.LoginPage;
import junit.framework.Assert;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	public LoginPageTest()
	{
		super();
	}
	@BeforeMethod
	public void setUp()
	{
		intialization();
		loginpage=new LoginPage();
	}
	@Test(priority=2)
	public void loginPageTitleTest()
	{
	String text=loginpage.validateLoginPage();
	System.out.println(text);
	String data="your business cloud partner";
	Assert.assertEquals(text, data);
	}
	@Test(priority=1)
	public void loginTest()
	{
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod()
	public void tearDown()
	{
		driver.close();
	}

}
