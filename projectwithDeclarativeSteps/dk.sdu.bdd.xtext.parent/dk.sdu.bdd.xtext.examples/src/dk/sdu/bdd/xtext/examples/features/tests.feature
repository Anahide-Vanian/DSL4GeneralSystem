			
		
			
		
		
			
		
		           
Feature: First side 

	Scenario: First side 
		Given the position of the robot "SuperRobot" is "upper left"
		When the robot "SuperRobot" moves to position "upper right" with "very slow" speed
		Then the figure "Square" is quarter_filled
		

	Scenario: Second side 
		Given the position of the robot "SuperRobot" is "upper right"
		When the robot "SuperRobot" moves to position "lower right" with "fast" speed
		Then the figure "Square" is half_full
		
		

	Scenario: Third side 
		Given the position of the robot "SuperRobot" is "lower right"
		When the robot "SuperRobot" moves to position "lower left" with "very fast" speed
		Then the figure "Square" is three_quarters_full
		
		

	Scenario: Fourth side 
		Given the position of the robot "SuperRobot" is "lower left"
		When the robot "SuperRobot" moves to position "upper left" with "slow" speed
		Then the figure "Square" is filled
