Feature: login functionality

  Scenario: verify user is able to login to the application
    Given user launched the browser
    And user navigated to the "URL"
    When user entered the user name "Admin" and password "admin123"
    Then verify user login into the application
