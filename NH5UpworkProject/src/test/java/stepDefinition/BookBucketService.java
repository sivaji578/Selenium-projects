package stepDefinition;


import BasicData.Base;
import BasicData.BookBucket;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookBucketService extends BookBucket {
	Base b=new Base();
	BookBucket c=new BookBucket();
	    @Given("that the user is logged in")
	    public void that_the_user_is_logged_in() throws Throwable {
	       b.Launch();
	    }
	    @When("user clicks on Our properties link displaying in the top of home page")
	    public void user_clicks_on_our_properties_link_displaying_in_the_top_of_home_page() throws Throwable {
	      c.ourProperties();
	    }

	    @Then("user navigates to the Our properties default map view screen")
	    public void user_navigates_to_the_our_properties_default_map_view_screen() throws Throwable {
	      c.validateOurPropertyText();
	    }
	    @Then("user enters {string} in the location field of PROPERTY SEARCH Widget")
	    public void user_enters_something_in_the_location_field_of_property_search_widget(String strArg1) throws Throwable {
	    	c.propertySearchField();
	    }
	   @And("user clicks on search button")
	    public void user_clicks_on_search_button() throws Throwable {
	    	searchButton();
	    }

	    @And("ensures that subtitle of the page updated correctly")
	    public void ensures_that_subtitle_of_the_page_updated_correctly() throws Throwable {
	    	ourPropertyText();
	    }
	    @Then("user turns the map view toggle off")
	    public void user_turns_the_map_view_toggle_off() throws Throwable {
	    	toggleButtonn();
	    }
	    @And("ensures that List view displays with expected property and the subtitle")
	    public void ensures_that_list_view_displays_with_expected_property_and_the_subtitle() throws Throwable {
	    	PropertySubTitleText();
	    }
	    @Then("user clicks the property name link on the property card in the list view")
	    public void user_clicks_the_property_name_link_on_the_property_card_in_the_list_view() throws Throwable {
	    	PropertyNameClicks();
	    }

	    @Then("User scrolls down and ensure that {string} widget displays with up to 4 properties and the VIEW MORE link")
	    public void user_scrolls_down_and_ensure_that_something_widget_displays_with_up_to_4_properties_and_the_view_more_link(String strArg1) throws Throwable {
	    	OtherPropertyImageCount();
	    }
	    @Then("user clicks on one of the property images in {string} widget")
	    public void user_clicks_on_one_of_the_property_images_in_something_widget(String strArg1) throws Throwable {
	    	onePropertyLinkImage();
	    }
	    @And("ensure that user navigates to that property details screen")
	    public void ensure_that_user_navigates_to_that_property_details_screen() throws Throwable {
	    	PropertyDetailNameEvent();
	    }
	    @Before
	    public void testTrail()
	    {
	    	System.out.println("Testing the Before Test");
	    }
	   /* @After
	    public void teardown() {
	    if (driver != null) {
	    driver.quit();
	    }
	    }*/
	 }
