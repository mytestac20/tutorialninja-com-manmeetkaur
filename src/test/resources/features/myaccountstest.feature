Feature: My Account Navigation

  Scenario: verifyUserShouldNavigateToRegisterPageSuccessfully
    Given I am on the homepage
    When I click on "My Account" link
    And I select "Register" from My Account options
    Then I should see the text "Register Account"

  Scenario: verifyUserShouldNavigateToLoginPageSuccessfully
    Given I am on the homepage
    When I click on "My Account" link
    And I select "Login" from My Account options
    Then I should see the text "Returning Customer"

  Scenario: verifyThatUserRegisterAccountSuccessfully
    Given I am on the homepage
    When I click on "My Account" link
    And I select "Register" from My Account options
    And I enter first name "John"
    And I enter last name "Doe"
    And I enter email "john.doe@example.com"
    And I enter telephone "1234567890"
    And I enter password "Password123"
    And I enter password confirm "Password123"
    And I select "Yes" for Subscribe radio button
    And I click on the Privacy Policy checkbox
    And I click on the "Continue" button
    Then I should see the message "Your Account Has Been Created!"
    When I click on the "Continue" button
    And I click on "My Account" link
    And I select "Logout" from My Account options
    Then I should see the text "Account Logout"
    When I click on the "Continue" button

  Scenario: verifyThatUserShouldLoginAndLogoutSuccessfully
    Given I am on the homepage
    When I click on "My Account" link
    And I select "Login" from My Account options
    And I enter email "john.doe@example.com"
    And I enter password "Password123"
    And I click on "Login" button
    Then I should see the text "My Account"
    When I click on "My Account" link
    And I select "Logout" from My Account options
    Then I should see the text "Account Logout"
    When I click on the "Continue" button