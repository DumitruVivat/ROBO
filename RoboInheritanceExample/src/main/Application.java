package main;

import robo.AbstractRobot;
import robo.RobotFactory;
import tests.DiagonalWalkTest;



public class Application {

	public static void main(String[] args) {
		
	
		
	    AbstractRobot robo = RobotFactory.getRobot("alpha", "terminator");
	    
	    System.out.printf("Walk test passed %d%%\n", DiagonalWalkTest.runCase(robo));
	
		
	}

}
