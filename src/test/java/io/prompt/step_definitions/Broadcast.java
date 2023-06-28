package io.prompt.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.prompt.pages.BasePage;
import io.prompt.pages.BroadcastPage;
import io.prompt.utilities.BrowserUtils;
import io.prompt.utilities.Driver;
import org.junit.Assert;

import javax.swing.text.View;
import java.util.concurrent.TimeUnit;

public class Broadcast {

    BrowserUtils browserUtils= new BrowserUtils();
    BroadcastPage broadcastPage = new BroadcastPage();
    BasePage basePage = new BasePage();

    @Given("Agent navigate to {string} page")
    public void agent_navigate_to_page(String string) {
        basePage.broadcastModule.click();
        browserUtils.sleep(2);
    }
    @When("Agent click Create Broadcast button")
    public void agent_click_create_broadcast_button() {
        browserUtils.clickWithJS(broadcastPage.createBroadcastButton);
        browserUtils.sleep(1);


    }
    @When("Agent select contact list on Audience page")
    public void agent_select_contact_list_on_audience_page() {
       broadcastPage.myList.click();
    }
    @When("Agent click Continue to Channels button")
    public void agent_click_continue_to_channels_button() {
        broadcastPage.continueToChannelsButton.click();
    }
    @When("Agent select channel on Channels page")
    public void agent_select_channel_on_channels_page() {
        broadcastPage.twilioPhoneNumber.click();
        browserUtils.sleep(1);
    }
    @When("Agent click Continue to Delivery button")
    public void agent_click_continue_to_delivery_button() {
        broadcastPage.continueToDeliveryButton.click();
        browserUtils.sleep(1);
    }
    @When("Agent select Delivery Type {string} and Delivery Timing {string} on Delivery Options page")
    public void agent_select_delivery_type_and_delivery_timing_on_delivery_options_page(String type, String delivery) {
    broadcastPage.deliveryOptions(type,delivery);
    }
    @When("Agent click Continue to Compose button")
    public void agent_click_continue_to_compose_button() {
       broadcastPage.continueToComposeButton.click();
       browserUtils.sleep(1);
    }
    @When("Agent add to message text, Media Bundle and Link")
    public void agent_add_to_message_text_media_bundle_and_link() {
        broadcastPage.messageWindow.sendKeys(basePage.messagetext());
        browserUtils.sleep(1);
        broadcastPage.selectMedia.click();
        browserUtils.sleep(1);
        broadcastPage.selectVideo.click();
        browserUtils.sleep(1);
        broadcastPage.selectLink.click();
        browserUtils.sleep(1);
        broadcastPage.insertSmartLink.click();
        browserUtils.sleep(1);

            }
    @When("Agent click Continue to Review button")
    public void agent_click_continue_to_review_button() {
    broadcastPage.continueToReviewButton.click();
        browserUtils.sleep(1);
    }


    @When("Agent click Add to Queue button")
    public void agent_click_add_to_queue_button() {
        broadcastPage.addToQueueButton.click();
        browserUtils.sleep(1);

    }
    @When("Agent click Confirm Broadcast button")
    public void agent_click_confirm_broadcast_button() {
        broadcastPage.confirmBroadcastButton.click();
        browserUtils.sleep(1);


    }
    @When("Agent click Go to Send Queue button")
    public void agent_click_go_to_send_queue_button() {
        broadcastPage.goToSendQueueButton.click();
        browserUtils.sleep(1);

    }
    @When("Agent click Send Message button")
    public void agent_click_send_message_button() {
        broadcastPage.sendMessageButton.click();
        browserUtils.sleep(1);
        broadcastPage.sendMessageButton.click();
        browserUtils.sleep(4);
        Assert.assertEquals("Send Queue",broadcastPage.sendQueueTitle.getText());
    }
    @When("Agent click View Broadcast Metrics button")
    public void agent_click_view_broadcast_metrics_button() {
       broadcastPage.viewBroadcastMetricsbutton.click();
       browserUtils.sleep(2);
    }

    @Then("Agent click on last eclipse menu and resume delivery")
    public void agent_click_on_last_eclipse_menu_and_resume_delivery() {
        broadcastPage.eclipsesMenu.click();
        browserUtils.sleep(2);
        broadcastPage.resumeDeliveryButton.click();
        browserUtils.sleep(1);
    }
    @Then("Agent click Resume Delivery confirm")
    public void agent_click_resume_delivery_confirm() {
        broadcastPage.resumeDeliveryConfirmButton.click();
        browserUtils.sleep(3);
    }
    @Then("Verify Status {string} in Broadcast History tab")
    public void verify_status_in_broadcast_history_tab(String string) {
        browserUtils.sleep(2);
        if(string.contains("Complete")){
            browserUtils.sleep(33);
        }

        System.out.println(broadcastPage.deliveryStatus(string));
        Assert.assertEquals(string, broadcastPage.deliveryStatus(string));

    }







}
