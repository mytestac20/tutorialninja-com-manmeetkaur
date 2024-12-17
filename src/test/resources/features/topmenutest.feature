Feature: Top Menu Navigation Feature

  In Order to perform successful login
  As a User
  I have to enter correct username and password

  Scenario: verifyUserShouldNavigateToDesktopsPageSuccessfully
    Given I mouse hover on "Desktops" Tab
    And I click on "Show All Desktops"
    Then I verify that the page title is "Desktops"

  Scenario: verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully
    Given I am on the homepage
    When I hover over "Laptops & Notebooks" tab and click
    And I call selectMenu method and pass the menu "Show All Laptops & Notebooks"
    Then I should see the text "Laptops & Notebooks"

  Scenario: verifyUserShouldNavigateToComponentsPageSuccessfully
    Given I am on the homepage
    When I hover over "Components" tab and click
    And I call selectMenu method and pass the menu "Show All Components"
    Then I should see the text "Components"






