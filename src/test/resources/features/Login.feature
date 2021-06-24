@Login
Feature: Sauce Labs Login
  Scenario: Valid Login
    Given I am in the login page
    When I enter a correct user name
    And I enter a correct password
    And I click on the login button
    Then I see home page
  Scenario: Invalid login
    Given I am in the login page
    When I enter incorrect user name
    And I enter incorrect password
    And I click on the login button
    Then I see error message on the login page





