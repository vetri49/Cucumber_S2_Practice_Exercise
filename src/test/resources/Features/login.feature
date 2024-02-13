Feature: Login Functionality

  Scenario: User logs in with valid credentials
    Given User is on the login page
    When User enters valid username and password
    Then User should be logged in successfully
