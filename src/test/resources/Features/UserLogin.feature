Feature: feature to test user login

  Scenario: check user login functionality with valid credentials

    Given user in user login page
    And user enter username
    And user enter password
    When user click login button
    Then user navigated to products page

    And user select price low to high from sort list
    Then user select add to cart button of backpack
