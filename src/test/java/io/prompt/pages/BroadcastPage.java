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

    @FindBy(xpath = "(//span[@class='ant-checkbox'])[5]")
    public WebElement myList;

    @FindBy(xpath = "//span[.='Continue to Channels']")
    public WebElement continueToChannelsButton;

    @FindBy(xpath = "(//span[@class='ant-checkbox'])[6]")
    public WebElement twilioPhoneNumber;

    @FindBy(xpath = "//button[.='Continue to Delivery']")
    public WebElement continueToDeliveryButton;

    @FindBy(xpath = "//button[.='Continue to Compose']")
    public WebElement continueToComposeButton;

    @FindBy(xpath = "//textarea[@id ='chat-entry']")
    public WebElement messageWindow;

    @FindBy(xpath = "//span[@class ='anticon anticon-play-square']")
    public WebElement selectMedia;
    @FindBy(xpath = "(//button[@class ='ant-btn ant-btn-primary StyledAntButton--yu9zik evtayf'])[3]")
    public WebElement selectVideo;

    @FindBy(xpath = "//button[.='Add to Queue']")
    public WebElement addToQueueButton;
    @FindBy(xpath = "//button[.='Go to Send Queue']")
    public WebElement goToSendQueueButton;

    @FindBy(xpath = "//button[.='Continue to Review']")
    public WebElement continueToReviewButton;

    @FindBy(xpath = "//button[.='Send Message']")
    public WebElement sendMessageButton;

    @FindBy(xpath = "//h3[@title='Send Queue']")
    public WebElement sendQueueTitle;
    @FindBy(xpath = "//button[.='View Broadcast Metrics']")
    public WebElement goToActiveConversationsButton;

    @FindBy(xpath = "//div[@class ='BaseText--9eaeti-div Div--ktmud0 StatusWrapper--1qpbx2a gfOOGn iaWrMG']")
    public WebElement broadcastStatus;

}
