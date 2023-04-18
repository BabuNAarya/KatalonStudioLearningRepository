Feature: Test login Functionality

  Scenario: Check login is successful with valid cedentials
    Given user is on login page
    When user enters the username and password
    And clicks on login button
    Then user is navigated to the Home page
