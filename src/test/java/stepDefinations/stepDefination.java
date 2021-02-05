package stepDefinations;

import java.util.List;

import org.junit.runner.RunWith;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;



	
	@RunWith(Cucumber.class)
	public class stepDefination{
		
		

		
		    @Given("^User is in on Landing page$")
		    public void user_is_in_on_landing_page() throws Throwable {
		    	
		    	//code to navigate the url
		        
		    }
		    
		    @Given("^Browser validation$")
		    public void browser_validation() throws Throwable {
		    	System.out.println("browser validation");
		        
		    }

		    @When("^Browser opens$")
		    public void browser_opens() throws Throwable {
		       System.out.println("browser opens");
		    }

		    @Then("^check the title of the browser$")
		    public void check_the_title_of_the_browser() throws Throwable {
		    	System.out.println("check the title of a browser");
		        
		    }

		


		    @When("^use login the application with \"([^\"]*)\" and \"([^\"]*)\"$")
		    public void use_login_the_application_with_and(String arg1, String arg2) throws Throwable {
		        // Write code here that turns the phrase above into concrete actions
		        System.out.println(arg1);
		        System.out.println(arg2);
		    }

		    @Then("^Home page is populated$")
		    public void home_page_is_populated() throws Throwable {
		       //Home page validations
		    	
		    	System.out.println("Landed in the homepage");
		    }

		    @Then("^cards are displayed \"([^\"]*)\"$")
		    public void cards_are_displayed(String arg1) throws Throwable {
		        // Write code here that turns the phrase above into concrete actions
		        System.out.println(arg1);
		    }  
		        
		    @When("^user signup with following details$")
		     public void user_signup_with_following_details(DataTable data) throws Throwable {
		    	List<List<String>> obj= data.raw();
		    	System.out.println(obj.get(0).get(0));
		    	System.out.println(obj.get(0).get(1));
		    	System.out.println(obj.get(0).get(2));
		    	System.out.println(obj.get(0).get(3));
		    	System.out.println(obj.get(0).get(4));
		        }
		    
		    @When("^use loggin the application with (.+) and (.+)$")
		    public void use_loggin_the_application_with_and(String username, String password) throws Throwable {
		    	System.out.println(username);
		    	System.out.println(password);
		    }
		    }
		    
		    
		    
	

		

	
