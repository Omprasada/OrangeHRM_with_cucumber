Feature: Test the Login Functionality of OrangeHRM

#Scenario: Test the valid Login

#Given User is on Login Page
#When User enters "admin" and "admin123"
#And Click on Login button
#Then user should land into Homepage

Scenario Outline: Test the valid Login

Given User is on Login Page
When User enters <username> and <password>
And Click on Login button
Then user should land into Homepage

Examples:
		|username|password|
		|Admin|admin123|
		|admin|Admin123|
		|Admin|Admin123|

