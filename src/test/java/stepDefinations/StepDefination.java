package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefination {

    @Given("^User is on bank landing page$")
    public void user_is_on_bank_landing_page() throws Throwable {
        //throw new PendingException();
    	System.out.println("user landing on home page");
    	System.out.println("user landing on home page");
    	System.out.println("user landing on home page");
    }

    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println(strArg2);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        //throw new PendingException();
    	System.out.println("home page is populated");
    	System.out.println("home page is populated1");
    	System.out.println("home page is populated2");
    	// new code 
    	
    	System.out.println("home page is populated3");
    	System.out.println("home page is populated4");
    }
    

	@Then("^Cards displayed are \"([^\"]*)\"$")
	public void cards_displayed_are(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
		System.out.println("should work");
		//throw new PendingException();
		System.out.println("should work2");
		System.out.println("should work3");
		System.out.println("should work4");
	}



}