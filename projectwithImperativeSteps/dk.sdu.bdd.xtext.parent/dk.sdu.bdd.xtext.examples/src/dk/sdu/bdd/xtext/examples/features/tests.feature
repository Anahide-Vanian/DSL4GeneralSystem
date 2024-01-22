	

	




Feature: Robot drawing a square

	Scenario: Given the the scenario "Scenario1" is starting 
        Given the figure "SuperSquare" is NOT_DONE
        And the position of the robot "SuperRobot" is "upper left"
        When the robot "SuperRobot" moves to position "upper right" with "very slow" speed
        And the robot "SuperRobot" stands_still to position "upper right"
        And the robot "SuperRobot" moves to position "lower right" with "fast" speed
        Then the position of the robot "SuperRobot" is "lower right"

	Scenario: When the scenario "Scenario2" starts
        Given the figure "SuperSquare" is IN_PROGRESS
        When the robot "SuperRobot" moves to position "lower left" with "very fast" speed
        Then the position of the robot "SuperRobot" is "lower left"

	Scenario: Then the scenario "Scenario3" is starting
        Given the figure "SuperSquare" is NEAR_COMPLETION
        When the robot "SuperRobot" moves to position "upper left" with "very fast" speed
        And the robot "SuperRobot" stands_still to position "upper left"
        Then the figure "SuperSquare" is DONE
