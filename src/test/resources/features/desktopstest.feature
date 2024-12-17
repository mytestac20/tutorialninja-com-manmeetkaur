Feature: Desktops Page

  Scenario: verifyProductArrangeInAlphaBaticalOrder
    Given I hover on "Desktops" Tab
    And I click on "Show All Desktops"
    When I select sort by "Name: Z to A"
    Then I verify that products are sorted in Descending order