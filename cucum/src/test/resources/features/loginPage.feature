Feature: validating facebook page
Scenario: Login page validation with invalid credential
Given User is on facebook page
When User enter the username and password
And User clicks on login Page
Then User verify the error message