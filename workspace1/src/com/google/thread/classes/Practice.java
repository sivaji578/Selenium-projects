package com.google.thread.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public WebDriver driver;
	public void browser(String Browser)
	{
		if(Browser.equalsIgnoreCase("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\softsuave\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		}
	}
	public void practData()
	{
		driver.get("https://www.youtube.com/");
		WebElement search= driver.findElement(By.xpath("//input[@id='search']"));
		search.sendKeys("Selenium testing videos");
		search.sendKeys(Keys.ENTER);
	}

}
