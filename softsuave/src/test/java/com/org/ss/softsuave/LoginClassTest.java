package com.org.ss.softsuave;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginClassTest {
	public static WebDriver driver;

@BeforeTest	
public static void launch() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\softsuave\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://dev.virujh.com/");
	LoginClass.LoginButton(driver).click();
	Thread.sleep(3000);
	
//	LoginClass.validationError(driver);
	
}
	@Test(priority = 1)
	public void login() throws InterruptedException
	{

		
		LoginClass.userName(driver).sendKeys("dummy@softsuave.com");
		LoginClass.password(driver).sendKeys("Sivaji578");
		LoginClass.loginbtn(driver).click();
		Thread.sleep(5000);
		LoginClass.validationError(driver);
	}
	
	@Test(priority = 2)
	public void patientlogin() {
		PatientClass.patientbtn(driver).click();
		PatientClass.phoneno(driver).sendKeys("9876543210");
		PatientClass.password(driver).sendKeys("ASdffg123");
		PatientClass.submit(driver).click();
	}
	
}
