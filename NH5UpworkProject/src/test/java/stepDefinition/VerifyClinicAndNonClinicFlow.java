package stepDefinition;

import BasicData.Base;
import BasicData.VerifyClinicAndNClinic;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyClinicAndNonClinicFlow {
	Base b=new Base();
	VerifyClinicAndNClinic v=new VerifyClinicAndNClinic();
	 @Given("I a navigate to the open space homepage")
	    public void i_navigate_to_the_open_space_homepage() throws Throwable {
	       b.Launch();
	    }

	    @Then("I select m {string} on the homepage")
	    public void i_select_something_on_the_homepage(String strArg1) throws Throwable {
	      System.out.println("Sivaji");
	    }

	    @Then("I select the clinical room {string}")
	    public void i_select_the_clinical_room_something(String strArg1) throws Throwable {
	    	v.roomType();
	    }

	    @And("I select {string} on the booking page")
	    public void i_select_something_on_the_booking_page(String strArg1) throws Throwable {
	     v.minoroperationsdd();
	    }


}
