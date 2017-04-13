Feature: Calculate total price
	Scenario: 1 book
		Given user adds Band 1 1 times to the shopping cart
		When the shopping cart total is calculated
		Then the price should be: 8.0
 Scenario: 2 books of the same band
 		Given user adds Band 1 2 times to the shopping cart
 		When the shopping cart total is calculated
		Then the price should be: 16.0
 Scenario: 2 books from diff bands with rabatt
 		Given user adds Band 1 1 times to the shopping cart
 		And user adds Band 2 1 times to the shopping cart
 		When the shopping cart total is calculated
		Then the price should be: 15.2
Scenario: 3 books from 2 diff bands with rabatt
 		Given user adds Band 1 2 times to the shopping cart
 		And user adds Band 2 1 times to the shopping cart
 		When the shopping cart total is calculated
		Then the price should be: 22.8		
Scenario: 8 books from 5 diff bands with rabatt
 		Given user adds Band 1 2 times to the shopping cart
 		And user adds Band 2 2 times to the shopping cart
 		And user adds Band 3 2 times to the shopping cart
 		And user adds Band 4 1 times to the shopping cart
 		And user adds Band 5 1 times to the shopping cart
 		When the shopping cart total is calculated
		Then the price should be: 48.0	