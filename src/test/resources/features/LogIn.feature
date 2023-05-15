
  Feature: Log In functionality

    Background: Login
      When Agent navigate to LogIn page


    @admin
    Scenario: Login as Admin
      When Agent signed in as an "Admin" user
      And Agent should see the homepage


    @staff
    Scenario: Login as Staff
      When Agent signed in as an "Staff" user
      And Agent should see the homepage