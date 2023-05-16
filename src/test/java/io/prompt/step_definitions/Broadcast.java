package io.prompt.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.prompt.pages.BroadcastPage;
import io.prompt.utilities.BrowserUtils;

public class Broadcast {

    BrowserUtils browserUtils= new BrowserUtils();
    BroadcastPage broadcastPage = new BroadcastPage();

    @Given("Agent navigate to {string} module")
    public void agent_navigate_to_module(String string) {
       broadcastPage.broadcastModule.click();
       browserUtils.sleep(2);

    }

    @When("Agent click {string} button")
    public void agent_click_button(String string) {

        browserUtils.clickWithJS(broadcastPage.createBroadcastButton);
       // broadcastPage.createBroadcastButton.click();
        browserUtils.sleep(2);
        //browserUtils.findElementThatContainsText("button", string).click();

    }

    @When("Agent select contact list on Audience page")
    public void agent_select_contact_list_on_audience_page() {
        browserUtils.clickWithJS(broadcastPage.myList);
      // broadcastPage.myList.click();

    }

    @When("Agent select channel on Channels page")
    public void agent_select_channel_on_channels_page() {
        broadcastPage.continueToChannelsButton.click();
    }

    @When("Agent select Delivery Type {string} and Delivery Timing {string} on Delivery Options page")
    public void agent_select_delivery_type_and_delivery_timing_on_delivery_options_page(String string, String string2) {

    }

    @When("Agent add to message text, Media Bundle and Link")
    public void agent_add_to_message_text_media_bundle_and_link() {

    }

    @Then("Verify Status in Broadcast History tab")
    public void verify_status_in_broadcast_history_tab() {

    }


}
