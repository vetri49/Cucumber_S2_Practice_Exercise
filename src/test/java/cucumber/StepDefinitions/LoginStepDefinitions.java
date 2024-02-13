package cucumber.StepDefinitions;

import cucumber.pagefactory.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {
    private SharedSteps sharedSteps;
    private LoginPage loginPage;

    public LoginStepDefinitions(SharedSteps sharedSteps, LoginPage loginPage) {
        this.sharedSteps = sharedSteps;
        this.loginPage = loginPage;
    }

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        loginPage.driver = sharedSteps.getDriver();
        loginPage.onLoginPage();
    }

    @When("User enters valid username and password")
    public void user_enters_valid_username_and_password() {
    
        loginPage.enterCredentials();
    }

    @Then("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        loginPage.verifyLogin();
    }
}
