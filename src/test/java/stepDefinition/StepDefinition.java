package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
	    
	}

	@Given("^Navigate to the \"([^\"]*)\" site$")
	public void navigate_to_the_site(String arg1) throws Throwable {
	   
	}

	@Given("^Click on the login link on the HomePage to land on the secure sign-in page$")
	public void click_on_the_login_link_on_the_HomePage_to_land_on_the_secure_sign_in_page() throws Throwable {
	    
	}

	@When("^User enters valid (.+) and (.+) and logs in$")
    public void user_enters_valid_and_and_logs_in(String username, String password) throws Throwable {
        
    }

	@Then("^Verify that that the user is successfully logged in$")
	public void verify_that_that_the_user_is_successfully_logged_in() throws Throwable {
	    
	}

	@Then("^close the browsers$")
	public void close_the_browsers() throws Throwable {
	    
	}
	
	
}
