package io.prompt.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.prompt.pages.BasePage;
import io.prompt.pages.BroadcastPage;
import io.prompt.utilities.BrowserUtils;
import io.prompt.utilities.Driver;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class Broadcast {

    BrowserUtils browserUtils= new BrowserUtils();
    BroadcastPage broadcastPage = new BroadcastPage();
    BasePage basePage = new BasePage();

    @Given("Agent navigate to {string} module")
    public void agent_navigate_to_module(String string) {
        broadcastPage.broadcastModule.click();
        browserUtils.sleep(2);
    }
    @When("Agent click Create Broadcast button")
    public void agent_click_create_broadcast_button() {
        browserUtils.clickWithJS(broadcastPage.createBroadcastButton);
        browserUtils.sleep(1);


    }
    @When("Agent select contact list on Audience page")
    public void agent_select_contact_list_on_audience_page() {
        //  browserUtils.clickWithJS(broadcastPage.myList);
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
    public void agent_select_delivery_type_and_delivery_timing_on_delivery_options_page(String string, String string2) {

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
    @When("Agent click Go to Send Queue button")
    public void agent_click_go_to_send_queue_button() {
        broadcastPage.goToSendQueueButton.click();
        browserUtils.sleep(1);
    }
    @When("Agent click Send Message button")
    public void agent_click_send_message_button() {
        broadcastPage.sendMessageButton.click();
        browserUtils.sleep(4);
    }
    @When("Agent click View Broadcast Metrics button")
    public void agent_click_view_broadcast_metrics_button() {


     Assert.assertEquals("Send Queue",broadcastPage.sendQueueTitle.getText());
       broadcastPage.goToActiveConversationsButton.click();
        browserUtils.sleep(2);
    }
    @Then("Verify Status in Broadcast History tab")
    public void verify_status_in_broadcast_history_tab() {
        basePage.broadcasts.click();
        browserUtils.sleep(5);
        System.out.println(broadcastPage.broadcastStatus.getText());
        Assert.assertEquals("Delivery In Progress",broadcastPage.broadcastStatus.getText());

        browserUtils.sleep(31);
        //sleep=25 sec->failed, sleep=31 sec->pass,
        System.out.println(broadcastPage.broadcastStatus.getText());
        Assert.assertEquals("Sends Complete",broadcastPage.broadcastStatus.getText());
    }

}
