package main;

import robo.AbstractRobot;
import robo.RobotFactory;
import tests.DiagonalWalkTest;


public class Application {

	public static void main(String[] args) {
		
		//System.out.printf( "Simple test passed %d%%\n", SimpleTest.runCase( new CharlieRobot("Robik","alpha") ) );
		
		//System.out.printf( "Simple test passed %d%%\n", SimpleTest.runCase( new CharlieRobot("Teminator","T5") ) );
		
		//System.out.printf("Charge test passed %d%%\n", ChargeTest.runCase( new CharlieRobot("Evangelion","M16")));
		
		//System.out.printf( "Walk test passed %d%%\n", DiagonalWalkTest.runCase( new CharlieRobot("Evrica","#56") ) );
		
	    AbstractRobot robo = RobotFactory.getRobot("alpha", "terminator");
	    
	    System.out.printf("Walk test passed %d%%\n", DiagonalWalkTest.runCase(robo));
	   
		
	}

}
