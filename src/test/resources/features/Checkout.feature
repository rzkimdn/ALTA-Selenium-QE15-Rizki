@smoketest
Feature: Checkout Test
#  Scenario: Verify product saucelabs backpack is on the checkout page
#    When User login with valid username "standard_user" and password "secret_sauce"
#    Then On the product page verify tha saucelabs backpack is displayed
#    And Add to cart button saucelabs backpack is displayed
#    And Click add to cart saucelabs backpack
#    And Click chart button
#    Then Verify the product saucelabs backpack is on the checkout page
  Scenario: Checkout product saucelabs backpack until complete
    When User login with valid username "standard_user" and password "secret_sauce"
    And Add to cart button saucelabs backpack is displayed
    And Click cart icon
    And Click checkout button
    And Input firs name "Rizki" and last name "Imaddudin" and postal code "1234"
    And Click continue button
    And Click finish button
    Then Should be displayed checkout complete with title "Thank you for your order!"