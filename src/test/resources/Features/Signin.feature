Feature: User Login
Registered User should be able to successfully login

Scenario: Login with valid credentials
Given User navigates to Login page
When User enters valid email address "Bugslayers@SDET143"
And enters valid password "SuDhJoRa_143"
And clicks on Login button
Then User should login successfully and Username should be displayed alongwith Signout button

