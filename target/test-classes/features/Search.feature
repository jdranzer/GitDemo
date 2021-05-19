Feature: Search and place order for vegetables

@SmokeTest
Scenario: Search for items and validate results
Given User is on Greencart landing page
When User search for Cucumber vegetable
Then "Cucumber" results are displayed

@RegressionTest
Scenario Outline: Search for items and move to checkout page
Given User is on Greencart landing page
When User search for <Name> vegetable
And Added items to cart
And User proceeded to Checkout page for purcharse
Then Verify selected <Name> items are displayed in Checkout page

Examples:
|Name		|
|Brinjal	|
|Beetroot	|