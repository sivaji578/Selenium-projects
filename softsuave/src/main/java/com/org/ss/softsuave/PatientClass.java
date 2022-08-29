package com.org.ss.softsuave;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PatientClass  {
	
	public static WebElement patientbtn(WebDriver driver)
	{
		return driver.findElement(By.xpath("//button/span[text()='Patient']"));
	}
	public static WebElement phoneno(WebDriver driver)
	{
		return driver.findElement(By.xpath("//input[@id='userName']"));
		
	}
	public static WebElement password(WebDriver driver)
	{
		return driver.findElement(By.xpath("//input[@id='password']"));
	}
	public static WebElement submit(WebDriver driver)
    {
	return driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained jss13 MuiButton-containedPrimary']"));
    }

}
