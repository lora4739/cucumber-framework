Feature: Application Login 
@sanity
Scenario: Home page default Login
Given User is in on Landing page
When use login the application with "lora" and "1234"
Then Home page is populated
And cards are displayed "true"


















