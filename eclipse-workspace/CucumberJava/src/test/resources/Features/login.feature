@smokefeature
Feature: Smoke testing for norton

@smoketest	
Scenario Outline: Create account in Norton website
	Given Open Chrome browser
	When Click on Sign in link
	Then Create account successfully "<username>" and "<password>"
	

	
Examples:

    |username|password|
    |pugal.murugan@gmail.com|Jivesh30$| 
    |pugalmuruganm@gmail.com|Jivesh30$|
    
 @regtest   
Scenario: Login to Account
	Given Launch the application
	When Login to the Application
	Then User should be able login successfully 