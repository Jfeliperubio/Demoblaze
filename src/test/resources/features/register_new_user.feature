Feature: Register a new user

  Scenario: Successfully register a new user
    Given I am on the Product Store registration page
    When I enter a new username and password
    And I click on the sign up button
    Then I should see a confirmation message
