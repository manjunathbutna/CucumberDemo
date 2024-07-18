Feature: Login Page feature

Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then title of the page should be "Swag Labs"

Scenario: Login with correct credentials
Given user is on login page
When user enters username "standard_user"
And user enters the password "secret_sauce"
And user clicks on the login button
Then user lands on inventory page
Then url of the page should be "https://www.saucedemo.com/v1/inventory.html"

Scenario: logout functionality
Given User logged in as "standard_user" and "secret_sauce"
When user is on inventory page
When user clicks on open menu button
And user clicks on logout button
