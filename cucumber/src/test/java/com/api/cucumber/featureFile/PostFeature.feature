Feature: Post feature of facebook
	This will test the post functionality of the user wall
	
Background: Given User should be logged in 
	And should be present at its own wall 


Scenario: Post a text on user wall
	When I type the post as "This is a sample post" in the text wall
	And Click on post button
	Then The message should get posted
	
Scenario: Post a video on user wall 
	When User supply the YouTube link as "http://www.google.com" in the textbox
	And Click on post button
	Then Video should posted on user wall
	And Video should have proper Thumbnail