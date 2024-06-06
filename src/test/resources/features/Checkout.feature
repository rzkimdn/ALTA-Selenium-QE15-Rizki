Feature: Checkout Test
  Scenario: Verify product saucelabs backpack is on the checkout page
    When User login with valid username "standard_user" and password "secret_sauce"
    Then On the product page verify tha saucelabs backpack is displayed
    And Add to cart button saucelabs backpack is displayed
    And Click add to cart saucelabs backpack
    And Click chart button
    Then Verify the product saucelabs backpack is on the checkout page