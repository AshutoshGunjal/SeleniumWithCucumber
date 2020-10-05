Feature: User Login Feature 

Scenario: User Login 
	
	Given User is at the login page of the application 
	When User login with following username and password 
		|UsernameOne|PasswordOne|
		|UsernameTwo|PasswordTwo|
	Then User should be able to login with correct username and passwrod 
	
Scenario: Home page default login
    Given User is on NetBanking landing page
    When User loing into application with Username and Password
    Then Home Page is populated
    And Cards are displyed
    
