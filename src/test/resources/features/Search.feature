Feature: Search Test
  @tugas
  Scenario: Search for products with products already on the chart and add them then remove
    Given User login with valid username "standard_user" and password "secret_sauce"
    And Add to cart button saucelabs backpack is displayed
    And Click add to cart saucelabs backpack
    When On the product page verify product already on the cart
    Then Click filter and set Z to A "Name (Z to A)"
    And Verify that saucelabs onesie and all the things t-shirt red is displayed
    And Click add to cart saucelabs onesie and all the things t-shirt red
    And Remove button on the saucelabs onesie and all the things t-shirt red is displayed
    And Click chart button
    Then Verify the product saucelabs onesie and all the things t-shirt red is on the checkout page
    And Click remove button on the product all the things t-shirt red
#    And Verify product all the things t-shirt red is removed on the checkout page
    Then Click Continue Shopping