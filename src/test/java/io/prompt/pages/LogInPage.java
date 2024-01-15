package io.prompt.pages;

import io.prompt.utilities.ApplicationReader;
import io.prompt.utilities.BrowserUtils;
import io.prompt.utilities.DataReader;
import io.prompt.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
    BrowserUtils browserUtils = new BrowserUtils();

    public LogInPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(css = "#email")
    public WebElement inputUserName;
    @FindBy(css = "#password")
    public WebElement inputPassword;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;


    public String urlLogIn() {
        return "https://" + (ApplicationReader.getProperty("env")) + ".prompt.io";
    }

    public String urlHomePage(String role) {
        String result = "https://" + (ApplicationReader.getProperty("env"));
        switch (role) {
            case "Admin":
                browserUtils.sleep(6);
                result = result + ".prompt.io/kpi";
                break;
            case "Customer":
                browserUtils.sleep(5);
                result = result + ".prompt.io/accounts/";
                break;
        }
        return result;

    }


    public void loginWithConfigUser(String user) {
        String userName = "", password = "";
        switch (user.toLowerCase()) {
            case "admin":
                userName = DataReader.getProperty("adminUserName");
                password = DataReader.getProperty("adminPassword");
                break;
            case "customer":
                userName = DataReader.getProperty("customerUserName");
                password = DataReader.getProperty("customerPassword");
                break;
        }

        inputUserName.sendKeys(userName);
        inputPassword.sendKeys(password);
        loginButton.click();
        browserUtils.sleep(1);

        //Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


    }


}

