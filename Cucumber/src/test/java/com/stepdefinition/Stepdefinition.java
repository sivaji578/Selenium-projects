package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefinition {
	WebDriver driver;
	
	@Given("User entering the youtube")
	public void user_entering_the_youtube() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@When("Enter the movie name as Simhadri")
	public void enter_the_movie_name_as_Simhadri() {
		WebElement element = driver.findElement(By.xpath("//input[@id='search']"));
		element.sendKeys("selenium");
	
	}

	@When("User click on search button")
	public void user_click_on_search_button() {
		WebElement element = driver.findElement(By.id("search-icon-legacy"));
		element.click();
	}

	@When("Click on any one video")
	public void click_on_any_one_video() {
		WebElement element = driver.findElement(By.xpath("//yt-formatted-string[text()='Selenium Full Course - Learn Selenium in 12 Hours | Selenium Tutorial For Beginners | Edureka']"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		element.click();
		
	}

	@Then("Able to see movie")
	public void able_to_see_movie() {
	//	driver.quit();
	   
	}


}
