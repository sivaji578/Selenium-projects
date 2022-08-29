package stepDefinition;


import BasicData.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginClass {
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
	    public void validate_the_home_page_title_here() throws Throwable {
	    	 System.out.print("Sivaji");
	    }

	
       
    }

