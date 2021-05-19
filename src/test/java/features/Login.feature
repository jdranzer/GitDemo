Feature: Application Login

Background:
Given Validate the browser
When Browser is triggered
Then Check if browser is started

@WebTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login in to application with "jir" and password "1234"
Then Home page is populated
And Cards displayed are "true"

@MobileTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login in to application with "john" and password "4321"
Then Home page is populated
And Cards displayed are "false"

@SmokeTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login in to application with "john" and password "4321"
Then Home page is populated
And Cards displayed are "false"

@MobileTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User sign up with following details
| jenny | abdc | john@abcd.com | Australia | 33456251 |
Then Home page is populated
And Cards displayed are "false"

@WebTest
Scenario Outline: Home page default login
Given User is on NetBanking landing page
When User login into application with <Username> and password <Password>
Then Home page is populated
And Cards displayed are "false"

Examples:
|Username	|Password	|
|user1		|pass1		|
|user2		|pass2		|
|user3		|pass3		|
|user4		|pass4		|