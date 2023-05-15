@broadcast
Feature: Send P2P Broadcast

  Background: Admin user on the Home Page
    When Agent navigate to LogIn page
    And Agent signed in as an "Admin" user
    And Agent should see the homepage


@alex
  Scenario: Agent create a P2P Broadcast with Immediate Delivery

    Given Agent navigate to "Broadcasts" module
    When Agent click "Create Broadcast" button
    And Agent select contact list on Audience page
    And Agent click "Continue to Channels" button
    And Agent select channel on Channels page
    And Agent click "Continue to Delivery" button
    And Agent select Delivery Type "P2P Broadcast" and Delivery Timing "Immediate Delivery" on Delivery Options page
    And Agent click "Continue to Compose" button
    And Agent add to message text, Media Bundle and Link
    And Agent click "Continue to Review" button
    And Agent click "Add to Queue" button
    And Agent click "Go to Send Queue" button
    And Agent click "Send Message" button
    And Agent click "View Broadcast Metrics" button
    Then Verify Status in Broadcast History tab




