Feature: feature to test user login

  Scenario: check user login functionality with valid credentials

    Given user in user login page
    And user enter username
    And user enter password
    When user click login button
    Then user navigated to products page