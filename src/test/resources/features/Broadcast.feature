@broadcast  @smoke
Feature: Send P2P Broadcast

  Background: Login as admin
    When Agent navigate to LogIn page


 @admin
   Scenario:
     When Agent signed in as an "Admin" user
     And Agent should see the homepage


 @staff
  Scenario:
    When Agent signed in as an "Staff" user
    And Agent should see the homepage
