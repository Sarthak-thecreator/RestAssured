Feature: Addition

Scenario: Addition of Two Number
Given I have two variables "10" & "19"
When I do addition 
Then result should display in Console

Scenario: Addition of Two Number with List
Given I have two variables as Below
	|  8 |
	| 10 |
	When I do Addition
	Then result should display in Console
	
Scenario: Addition of Two Number with Map
Given I have two numbers as Map
		| num1 | 80 |
		| num2 | 10 |
	When I do Addition
	Then result should display in Console 