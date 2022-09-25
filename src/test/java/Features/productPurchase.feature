Feature: Purchase an Item
  Scenario: Add Item to cart and check out then verify the total
    Given user is in the login page
    And user enter username
    And user enter password
    When the user click login button
    Then Home page is displayed