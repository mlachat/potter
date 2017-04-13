Feature: Mathematical operations
	Scenario: Average
		Given user adds 5 times the value 1.5
		  And user adds 5 times the value 3.5
		When average is calculated
		Then the result should be: 2.5
	Scenario: Min
		Given user adds 2 times the value 1.5
		  And user adds 3 times the value 3.5
		  And user adds 5 times the value 4.78
		When min is calculated
		Then the result should be: 1.5
	Scenario: Max
		Given user adds 2 times the value 1.5
		  And user adds 3 times the value 3.5
		  And user adds 5 times the value 4.78
		When max is calculated
		Then the result should be: 4.78
	Scenario: Sum
		Given user adds 2 times the value 47.11
		  And user adds 3 times the value 08.15
		When sum is calculated
		Then the result should be: 63.41