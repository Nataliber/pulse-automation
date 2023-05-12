
  Feature: Log In functionality


    Scenario: Login
      When Agent navigate to LogIn page
      And Agent signed in as an "Admin" user
      Then Agent should see the homepage


    Scenario: Login
      When Agent navigate to LogIn page
      And Agent signed in as an "Staff" user
      Then Agent should see the homepage