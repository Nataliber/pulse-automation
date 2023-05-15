package io.prompt.pages;

import io.prompt.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //@FindBy(xpath = "//span[.='Broadcasts']")
    //
    //
    // public WebElement broadcastModule;

}
