@BddTests 
Feature: BddTests 

Background: 
	Given I am on scenario "Background" 
	
@SA 
Scenario: First scenario 
	Given I am on Scenario1 of "Logo validation"
	When Open Firefox and start application 
	Then  logo image is displayed 
	
@SB 
Scenario: Top Right links 
	Given Open Firefox and start application 
	Then Links check with "Contact us" and "Sign in" 
	Then Click "Sign in" 
	
@SASC 
Scenario Outline: Test Login 
	Given open_Firefox_and_start_application 
	Then I login with "<username>" and password "<password>" 
	Then Validate message 
	Examples: 
		| username |    | password |
		| abcd@gmail.com  |    | Mercury  |
		
		@SASD 
		Scenario Outline: Validation 
			Given open_Firefox_and_start_application 
			When Click "Sign in" 
			Then I login with "<username>" and password "<password>" 
			Then "QURATE Selenium" should be displayed 
			Examples: 
				| username |    | password |
				| qurate@selenium.com |    | qurate |
				
				@SASE 
				Scenario: AddItem Tocart 
					Given open_Firefox_and_start_application 
					Then Mousehover DRESSES 
					Then click SummerDresses 
					
  