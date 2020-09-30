Feature: Post feature of facebook
	This will test the post functionality of the user wall
	
	
Scenario: Post a text on user wall
	Given User should be logged in 
	And should be present at its own wall
	When I type the post in the text wall
	And Click on post button
	Then The message should get posted
	
Scenario: Post a video on user wall 
	Given User should be logged in 
	And should be present at its own wall
	When User supply the YouTube link in the textbox
	And Click on post button
	Then Video should posted on user wall
	And Video should have proper Thumbnail