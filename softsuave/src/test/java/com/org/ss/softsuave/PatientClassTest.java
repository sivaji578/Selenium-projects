package com.org.ss.softsuave;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PatientClassTest {
	public static WebDriver driver;
	@BeforeTest
	public void launchbrowser() throws InterruptedException {
//		LoginClassTest l=new LoginClassTest();
		LoginClassTest.launch();
		
	}
	
	@Test
	public void patientloginMethod ()
	{
	//	PatientClass p=new PatientClass();
		
		PatientClass.patientbtn(driver).click();
		PatientClass.phoneno(driver).sendKeys("9876543210");
		PatientClass.password(driver).sendKeys("ASdffg123");
		PatientClass.submit(driver).click();
	}

	
	

}
