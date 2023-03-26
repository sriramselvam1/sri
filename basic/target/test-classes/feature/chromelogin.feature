Feature: Validating Chrome page
Scenario: login page validation with invalid credential
Given User is on GooGLe page
When User enter "<name>" and "<password>"
And user clicks on login button
Then verify the message

Examples:
|username|password|
|hello|1234|
|bye|234|
|dad|345|
