@broadcast
Feature: Send Broadcast

  Background: Admin user on the Home Page
    When Agent navigate to LogIn page
    And Agent signed in as an "Admin" user
    And Agent should see the homepage


 @P2PBroadcastImmediate
  Scenario: Agent create a P2P Broadcast with Immediate Delivery
    Given Agent navigate to "Broadcasts" module
    When Agent click Create Broadcast button
    And Agent select contact list on Audience page
    And Agent click Continue to Channels button
    And Agent select channel on Channels page
    And Agent click Continue to Delivery button
    And Agent select Delivery Type "P2P" and Delivery Timing "Immediate" on Delivery Options page
    And Agent click Continue to Compose button
    And Agent add to message text, Media Bundle and Link
    And Agent click Continue to Review button
    And Agent click Add to Queue button
    And Agent click Go to Send Queue button
    And Agent click Send Message button
    And Agent click View Broadcast Metrics button
    Then Verify Status 'Delivery In Progress' in Broadcast History tab
   Then Verify Status 'Sends Complete' in Broadcast History tab

  @A2PBroadcastImmediate
  Scenario: Agent create a A2P Broadcast with Immediate Delivery
    Given Agent navigate to "Broadcasts" module
    When Agent click Create Broadcast button
    And Agent select contact list on Audience page
    And Agent click Continue to Channels button
    And Agent select channel on Channels page
    And Agent click Continue to Delivery button
    And Agent select Delivery Type 'A2P' and Delivery Timing "Immediate" on Delivery Options page
    And Agent click Continue to Compose button
    And Agent add to message text, Media Bundle and Link
    And Agent click Continue to Review button
    And Agent click Confirm Broadcast button
    And Agent click View Broadcast Metrics button
    Given Agent navigate to "Broadcasts" module
    Then Verify Status 'Delivery In Progress' in Broadcast History tab
    Then Verify Status 'Sends Complete' in Broadcast History tab

  @A2PBroadcastPaused
  Scenario: Agent create a A2P Broadcast with Immediate Delivery
    Given Agent navigate to "Broadcasts" module
    When Agent click Create Broadcast button
    And Agent select contact list on Audience page
    And Agent click Continue to Channels button
    And Agent select channel on Channels page
    And Agent click Continue to Delivery button
    And Agent select Delivery Type 'A2P' and Delivery Timing "Paused" on Delivery Options page
    And Agent click Continue to Compose button
    And Agent add to message text, Media Bundle and Link
    And Agent click Continue to Review button
    And Agent click Confirm Broadcast button
    And Agent click View Broadcast Metrics button
    Given Agent navigate to "Broadcasts" module
    Then Verify Status 'Delivery Paused' in Broadcast History tab
    And Agent click on last eclipse menu and resume delivery
    And Agent click Resume Delivery confirm
    Then Verify Status 'Delivery In Progress' in Broadcast History tab
    Then Verify Status 'Sends Complete' in Broadcast History tab


