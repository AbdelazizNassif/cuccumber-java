Feature: Test Login Functionality

  @smoke
  Scenario: Check login is successful with valid credentials
    Given user in login page
    When user enter valid username and password
    And click login button
    Then the user is navigated to the home page
