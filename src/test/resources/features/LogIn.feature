@login
Feature: Log In functionality

  Background: Login
    When Agent navigate to LogIn page

  @admin
  Scenario: Login as Admin
    When Agent signed in as an 'Admin' user
    Then Verify agent is on 'Admin' home page

  @customer
  Scenario: Login as Customer
    When Agent signed in as an 'Customer' user
    Then Verify agent is on 'Customer' home page