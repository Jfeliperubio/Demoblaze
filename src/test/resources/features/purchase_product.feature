Feature: Purchase a product

  Scenario Outline: Successfully purchase a product from a specific category
    Given I am on the Product Store home page
    When I navigate to the "<category>" category
    And I select the product "<product>"
    And I add the product to the cart
    And I proceed to checkout
    And I enter my purchase details and confirm the purchase
    Then I should see a confirmation message with the text "<confirmation_message>"

    Examples:
      | category   | product       | confirmation_message             |
      | Laptops    | Sony vaio i5  | Thank you for your purchase!     |
      | Monitors   | Apple monitor 24 | Thank you for your purchase!     |
      | Phones     | Nexus 6       | Thank you for your purchase!     |
