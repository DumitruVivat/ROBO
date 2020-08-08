package tests;

import robo.BetaRobot;

public class ChargeTest {

	public static int runCase(BetaRobot robo){
        int percentage = 0;
        
        // charge can't be < 0
        robo.setCharge((byte) -100);
        if(robo.getCharge() < 0 ) {
        	System.err.println("Name test failed\nREASON: charge is lower than 0!");
        return percentage;
        }
        percentage+=30;
    
        // charge can't be > 100.
        robo.setCharge((byte) 1000);
        if(robo.getCharge() > 100 ) {
        	System.err.println("Name test failed\nREASON: charge is bigger than 100!");
        return percentage;
        }
        percentage+=30;
        
        // robot is stops , if the charge is lower than 5.
        robo.setCharge((byte) 50);
        while(robo.moveRight());
        if(robo.getCharge() <= 5) {
        	System.err.println("Name test failed\nREASON: charge is lower than 5!");
	        return percentage;
        }
        percentage+=40;
        
        return percentage;
}
}
