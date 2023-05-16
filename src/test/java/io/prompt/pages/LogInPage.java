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
    public LogInPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//input[@autocomplete='username']")
    public WebElement inputUserName;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//a[@data-qa='button-log-in']")
    public WebElement loginButton;




    public String urlLogIn(){
        return "https://"+ApplicationReader.getProperty("org").toLowerCase()+"."+(ApplicationReader.getProperty("env"))+".io/#login";
    }
    public String urlHome(){
        return "https://"+ApplicationReader.getProperty("org").toLowerCase()+"."+(ApplicationReader.getProperty("env"))+".io/spark/#home";
    }


    public void loginWithConfigUser(String user) {
        String userName = "", password = "";
        switch (user.toLowerCase()) {
            case "admin":
                userName = DataReader.getProperty("adminUserName");
                password = DataReader.getProperty("adminPassword");
                break;
            case "staff":
                userName = DataReader.getProperty("staffUserName");
                password = DataReader.getProperty("staffPassword");
                break;
        }

        inputUserName.sendKeys(userName);
        inputPassword.sendKeys(password);
        loginButton.click();
        browserUtils.sleep(1);
        //browserUtils.time(2000);
        //Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


    }


}

