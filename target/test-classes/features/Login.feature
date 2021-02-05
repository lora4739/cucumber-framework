Feature: Application Login 






@MobileTest
Scenario: Home page default Login
Given User is in on Landing page
When use login the application with "lora" and "1234"
Then Home page is populated
And cards are displayed "true"

@smoke
Scenario: Home page default Login
Given User is in on Landing page
When use login the application with "sri" and "2345"
Then Home page is populated
And cards are displayed "false"

@Regression
Scenario: Home page default Login
Given User is in on Landing page
When user signup with following details
| lora | sri | srihan | Loku | monica | mummy| Daddy |
Then Home page is populated
And cards are displayed "false"

@Regression
Scenario Outline: Home page default Login
Given User is in on Landing page
When use loggin the application with <username> and <password>
Then Home page is populated
And cards are displayed "true"


Examples:
|username |password |
|user1    |password1 |
|user2    |password2 |
|user3    |password3 |

















