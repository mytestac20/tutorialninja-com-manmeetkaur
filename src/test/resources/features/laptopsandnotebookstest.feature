Feature: Laptops and Notebooks

  Scenario: verifyProductsPriceDisplayHighToLowSuccessfully
    Given I am on the homepage
    When I hover over "Laptops & Notebooks" tab and click
    And I click on "Show All Laptops & Notebooks"
    And I select "Price (High > Low)" from Sort By dropdown
    Then the product prices should be displayed from High to Low

  Scenario: verifyThatUserPlaceOrderSuccessfully
    Given I am on the homepage
    When I hover over "Laptops & Notebooks" tab and click
    And I click on "Show All Laptops & Notebooks"
    And I select "Price (High > Low)" from Sort By dropdown
    And I select "MacBook" product
    Then I should see the text "MacBook"
    When I click on "Add To Cart" button
    Then I should see the success message "Success: You have added MacBook to your shopping cart!"
    When I click on the "shopping cart" link
    Then I should see the text "Shopping Cart"
    And I should see the product name "MacBook"
    And I change the quantity to "2"
    When I click on "Update" button
    Then I should see the message "Success: You have modified your shopping cart!"
    And I should see the total "£737.45"
    When I click on the "Checkout" button
    Then I should see the text "Checkout"
    And I should see the text "New Customer"
    When I click on the "Guest Checkout" radio button
    And I click on "Continue" tab
    And I fill in the mandatory fields
    And I click on "Continue" button
    And I add comments about my order
    And I check the "Terms & Conditions" checkbox
    When I click on "Continue" button
    Then I should see the message "Warning: Payment method required!"

