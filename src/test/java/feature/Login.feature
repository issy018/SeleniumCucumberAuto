Feature: Application login 

Scenario Outline: Positive test case to validate login

Given Initialize the browser with chrome
And Navigate to the "http://qaclickacademy.com" site
And Click on the login link on the HomePage to land on the secure sign-in page
When User enters valid <username> and <password> and logs in
Then Verify that that the user is successfully logged in
And close the browsers

   
Examples:
| username | password |
| test99@gmail.com | 123456 |
| test123@gmail.com | 654321 | 

