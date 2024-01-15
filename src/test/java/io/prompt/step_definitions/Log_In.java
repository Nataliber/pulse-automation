package io.prompt.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.prompt.pages.LogInPage;
import io.prompt.utilities.BrowserUtils;
import io.prompt.utilities.Driver;

public class Log_In {

    LogInPage logInPage = new LogInPage();
    BrowserUtils browserUtils= new BrowserUtils();

    @When("Agent navigate to LogIn page")
    public void agent_navigate_to_login_page() {
        Driver.getDriver().get(logInPage.urlLogIn());
    }

    @When("Agent signed in as an {string} user")
    public void agent_signed_in_as_an_user(String string) {
        logInPage.loginWithConfigUser(string);
    }

    @Then("Verify agent is on {string} home page")
    public void verify_agent_is_on_home_page(String role) {
        System.out.println("Agent navigated to URL: " + logInPage.urlHomePage(role));
        browserUtils.verifyURL(logInPage.urlHomePage(role));
    }


}
