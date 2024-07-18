Feature: Inventory page feature

Scenario: Inventory page title
Given user logged in successfully
When user is on inventory page
Then title should be "Swag labs"

Scenario: Add the inventory to the cart
Given User is on inventory page
When user click on item
Then Item should be opened in different page
And user clicks on add to cart button
Then Item should be added to the cart

