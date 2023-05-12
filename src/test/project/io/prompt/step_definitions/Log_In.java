package io.prompt.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.prompt.pages.LogInPage;
import io.prompt.utilities.BrowserUtils;
import io.prompt.utilities.Driver;

public class Log_In {

    LogInPage logInPage = new LogInPage();
    BrowserUtils browserUtils= new BrowserUtils();


    @Then("Agent should see the homepage")
    public void agent_should_see_the_homepage() {
    browserUtils.verifyURL(logInPage.urlHome());
    }


    @When("Agent navigate to LogIn page")
    public void agent_navigate_to_login_page() {
        Driver.getDriver().get(logInPage.urlLogIn());
    }

    @When("Agent signed in as an {string} user")
    public void agent_signed_in_as_an_user(String string) {
        logInPage.loginWithConfigUser(string);
    }




}
