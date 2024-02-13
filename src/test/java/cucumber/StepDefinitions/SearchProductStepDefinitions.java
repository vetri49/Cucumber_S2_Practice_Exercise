package cucumber.StepDefinitions;

import cucumber.pagefactory.SearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProductStepDefinitions {
	
	 private SharedSteps sharedSteps; // SharedSteps instance variable
	    private SearchPage searchPage; // SearchPage instance variable

	    // Constructor to receive the SharedSteps and SearchPage instances
	    public SearchProductStepDefinitions(SharedSteps sharedSteps, SearchPage searchPage) {
	        this.sharedSteps = sharedSteps;
	        this.searchPage = searchPage;
	    }
	@Given("User is logged in")
	public void user_is_logged_in() {
	    searchPage.driver=sharedSteps.getDriver();
	    searchPage.onLoginPage();
	}

	@When("User searches for a product {string}")
	public void user_searches_for_a_product(String name) {
		searchPage.searchProduct(name);
	    
	}

	@Then("Search results should be displayed {string}")
	public void search_results_should_be_displayed(String title) {
	    searchPage.verifyTitle(title);
	}

}
