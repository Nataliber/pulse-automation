package io.prompt.pages;

import io.cucumber.java.sl.In;
import io.prompt.step_definitions.Broadcast;
import io.prompt.utilities.DataReader;
import io.prompt.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BroadcastPage {

    public BroadcastPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//span[.='Create Broadcast']/..")
    public WebElement createBroadcastButton;

    @FindBy(xpath = "(//span[@class='ant-checkbox'])[2]")
    public WebElement myList;

    @FindBy(xpath = "//span[.='Continue to Channels']")
    public WebElement continueToChannelsButton;

    @FindBy(xpath = "(//span[@class='ant-checkbox'])[4]")
    public WebElement twilioPhoneNumber;

    @FindBy(xpath = "//button[.='Continue to Delivery']")
    public WebElement continueToDeliveryButton;

    @FindBy(xpath = "//button[.='Continue to Compose']")
    public WebElement continueToComposeButton;

    @FindBy(xpath = "//textarea[@id ='chat-entry']")
    public WebElement messageWindow;

    @FindBy(xpath = "//span[@class ='anticon anticon-play-square']")
    public WebElement selectMedia;
    @FindBy(xpath = "(//button[@class ='ant-btn ant-btn-primary StyledAntButton--yu9zik evtayf'])[2]")
    public WebElement selectVideo;

    @FindBy(xpath = "//span[@class ='anticon anticon-link']")
    public WebElement selectLink;
    @FindBy(xpath = "//span[.='Insert Smart Link']")
    public WebElement insertSmartLink;


    @FindBy(xpath = "//button[.='Add to Queue']")
    public WebElement addToQueueButton;

    @FindBy(xpath = "//button[.='Confirm Broadcast']")
    public WebElement confirmBroadcastButton;
    @FindBy(xpath = "//button[.='Go to Send Queue']")
    public WebElement goToSendQueueButton;

    @FindBy(xpath = "//button[.='Continue to Review']")
    public WebElement continueToReviewButton;

    @FindBy(xpath = "//button[.='Send Message']")
    public WebElement sendMessageButton;

    @FindBy(xpath = "//h3[@title='Send Queue']")
    public WebElement sendQueueTitle;
    @FindBy(xpath = "//button[.='View Broadcast Metrics']")
    public WebElement viewBroadcastMetricsbutton;

    @FindBy(xpath = "//button[.='Go to Active Conversations']")
    public WebElement goToActiveConversationsButton;



    @FindBy(xpath = "//span[contains(.,'A2P Opt-In Broadcast')]/../../span/input")
    public WebElement selectA2PBroadcast;
    @FindBy(xpath = "//span[contains(.,'P2P Broadcast')]/../../span/input")
    public WebElement selectP2PBroadcast;
    @FindBy(xpath = "//span[contains(.,'Immediate Delivery')]/../../span/input")
    public WebElement selectImmediateDelivery;

    @FindBy(xpath = "//span[contains(.,'Paused Delivery')]/../../span/input")
    public WebElement selectPausedDelivery;

    @FindBy(xpath = "//span[contains(.,'Scheduled Delivery')]/../../span/input")
    public WebElement selectScheduledDelivery;

//Delivery Options
public void deliveryOptions(String deliveryType,  String deliveryTiming) {

    switch (deliveryType + " " + deliveryTiming) {
        case "A2P Immediate":
            selectA2PBroadcast.click();
            selectImmediateDelivery.click();
            break;
        case "P2P Immediate":
            selectP2PBroadcast.click();
            selectImmediateDelivery.click();
            break;
        case "A2P Paused":
            selectA2PBroadcast.click();
            selectPausedDelivery.click();
            break;
        case "P2P Paused":
            selectP2PBroadcast.click();
            selectPausedDelivery.click();
            break;

    }
}
    @FindBy(xpath = "(//table[contains(.,' Sends Complete')]//div/div/div)[1]")
    public WebElement broadcastStatusComplete;
    @FindBy(xpath = "(//table[contains(.,'Delivery Paused')]//div/div/div)[1]")
    public WebElement broadcastStatusPaused;
    @FindBy(xpath = "(//table[contains(.,'Delivery In Progress')]//div/div/div)[1]")
    public WebElement broadcastStatusInProgress;

     public String deliveryStatus(String status) {
        String result="";
        switch (status) {
            case "Sends Complete":
                result= broadcastStatusComplete.getText();
                break;
            case "Delivery Paused":
                result=broadcastStatusPaused.getText();
                break;
            case "Delivery In Progress":
                result=broadcastStatusInProgress.getText();
                break;
        }
        return result;

    }

    @FindBy(xpath = "(//button[@class='ant-btn ant-btn-default ant-btn-icon-only ant-dropdown-trigger'])[1]")
    public WebElement eclipsesMenu;

   @FindBy(xpath = "//li[contains(.,'View Details')]")
   public WebElement eclipsesMenuViewDetails;



    @FindBy(xpath = "(//li/span[.='Resume Delivery'])[1]")
    public WebElement resumeDeliveryButton;

    @FindBy(xpath = "//button/span[.='Resume Delivery']")
    public WebElement resumeDeliveryConfirmButton;




        //@FindBy(xpath = "(//input[@class='ant-radio-input'])[1]")
        // public WebElement radiobroadcastA2P;
        // @FindBy(xpath = "//button[.='View Broadcast Metrics']")
        // public WebElement viewBroadcastMetricsButton;



}