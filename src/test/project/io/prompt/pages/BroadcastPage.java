package io.prompt.pages;

import io.prompt.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BroadcastPage {

    public BroadcastPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//span[.='Broadcasts']")
    public WebElement broadcastModule;

    @FindBy(xpath = "//span[.='Create Broadcast']/..")
    public WebElement createBroadcastButton;

    @FindBy(xpath = "//td[.='My list']")
    public WebElement myList;

    @FindBy(xpath = "//span[.='Continue to Channels']")
    public WebElement continueToChannelsButton;

    @FindBy(xpath = "(//span[@class='ant-checkbox'])[6]")
    public WebElement twilioPhoneNumber;





    public void sleep(int second){
        second *=1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e ) {

        }
    }
}
