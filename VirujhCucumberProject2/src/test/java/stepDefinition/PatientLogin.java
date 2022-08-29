package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
//import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasicData.Base;
import BasicData.FirstFlow;
import BasicData.RegressionFlow;


public class PatientLogin extends RegressionFlow {
	public static RequestSpecification request;
	public static Response response;
	String msg;
	public static String token;
	public static String patientIdNumber;
	//public static String address;
	public static String passcod;
	public static WebDriver driver;
	public static String url;
	public static String urldata;
	public static String patientId;
	
	
	//By titleValidation=By.xpath("//h1[@class='banner__heading']");
FirstFlow f=new FirstFlow();
RegressionFlow rf =new RegressionFlow();
	@Given("^Enter the url data$")
	
    public void enter_the_url_data() throws Throwable {
	 Base b=new Base();
       b.Launch();
    }

    @When("^Enter the creadientials data on application$")
    public void enter_the_creadientials_somethingsomething_data_on_application() throws Throwable {
        System.out.print("Sivaji");
    }

    @Then("^Application should be open the home page$")
    public void application_should_be_open_the_home_page() throws Throwable {
    	 System.out.print("Sivaji");
    }

    @And("^Validate the Home page title here$")
    public void validate_the_home_page_title_here() throws InterruptedException {
    	 System.out.print("Sivaji");
    	 /*WebElement title=driver.findElement(titleValidation);
    	// Thread.sleep(3000);
    	 String titleText=title.getText();
    	 System.out.println("Testing"+titleText);
    	 String exactText="Find and book clinical, group and workspace rooms";
    	 Assert.assertEquals(exactText, titleText);*/
    	 f.flow();
    }
    @Given("I select {string} on the homepage")
    public void i_select_something_on_the_homepage(String strArg1) throws Throwable {
       findaRoom();
    }

    @When("I select add to booking on the element in index 1")
    public void i_select_add_to_booking_on_the_element_in_index_1() throws Throwable {
    	addBooking();
    }

    @When("I select {string} from the {string} dropdown on the quickbook widget")
    public void i_select_something_from_the_something_dropdown_on_the_quickbook_widget(String ser, String disa) throws Throwable {
    	emergencyService(ser,disa);	
    }

    @When("I select day {string} of {string} from the datepicker on the quickbook widget")
    public void i_select_day_something_of_something_from_the_datepicker_on_the_quickbook_widget(String strArg1, String strArg2) throws Throwable {
    	selectDate();
    }
  
    @When("I select to {string} from the {string} dropdown on the quickbook widget")
    public void i_select_to_something_from_the_something_dropdown_on_the_quickbook_widget(String strArg1, String strArg2) throws Throwable {
    	
    	startstime();
    }
    @And ("I add to select {string} from the {string} dropdown on the quickbook widget")
    public void i_add_to_select_something_from_the_something_dropdown_on_the_quickbook_widget(String strArg1, String strArg2) throws Throwable {
    	selectsHost();  
    }


    @Then("The add to basket button is enabled on the quickbook widget")
    public void the_add_to_basket_button_is_enabled_on_the_quickbook_widget() throws Throwable {
    	addBasket();
    }

    @And("I select {string} on the find rooms quick book widget")
    public void i_select_something_on_the_find_rooms_quick_book_widget(String strArg1) throws Throwable {
    	clickAddtoBasket();
    }
    @Then("I verify that {string} is visible on the quickbook widget")
    public void i_verify_that_is_visible_on_the_quickbook_widget(String string) throws InterruptedException {
    	
    	validatesuccessMsg();
    }
    @And("I select b {string} on the find rooms quick book widget")
    public void i_select_b_something_on_the_find_rooms_quick_book_widget(String strArg1) throws Throwable {
    	continueshoppingbtn();  
    }

    @When("I select add to booking on the element in index 2")
    public void i_select_add_to_booking_on_the_element_in_index_2() throws Throwable {
    	addBooking(); 
    }

    @When("I add select {string} from the {string} dropdown on the quickbook widget")
    public void i_select_add_something_from_the_something_dropdown_on_the_quickbook_widget(String Ser, String disa) throws Throwable {
    	emergencyService(Ser,disa);
    }
   // @And("^I select a \"([^\"]*)\" on the find rooms quick book widget$")
    //public void i_select_a_something_on_the_find_rooms_quick_book_widget(String strArg1) throws Throwable {
        
   // }

    @When("I select a day {string} of {string} from the datepicker on the quickbook widget")
    public void i_select_a_day_something_of_something_from_the_datepicker_on_the_quickbook_widget(String strArg1, String strArg2) throws Throwable {
    	selectDate();
    }
    @And("I choose the first available slot")
    public void i_choose_the_first_available_slot() throws Throwable {
    	firstavilableslot();
    }

    




    //@And("^I select \"([^\"]*)\" from the \"([^\"]*)\" dropdown on the quickbook widget$")
   // public void i_select_something_from_the_something_dropdown_on_the_quickbook_widget(String strArg1, String strArg2) throws Throwable {
    }



	




