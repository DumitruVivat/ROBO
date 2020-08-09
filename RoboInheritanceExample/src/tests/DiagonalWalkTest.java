package tests;


import robo.AbstractRobot;


public class DiagonalWalkTest {
	public static int runCase(AbstractRobot robo){
		 int percentage = 0;
		 
		 robo.setY(50);
	     robo.setX(100);
		 if (robo.getX() > 100 && robo.getY() > 100) {
			 System.err.println("moveDownRight test failed\nREASON: The robot is out of coordinates!!");
	         return percentage;
		 } 
		 percentage += 25;
		 
		 robo.setY(-50);
	     robo.setX(-1);
		 if (robo.getX() < 0 && robo.getY() < 0) {
			 System.err.println("moveUpLeft test failed\nREASON: The robot is out of coordinates!!");
	            return percentage;
		 }
		 percentage += 25;
		
		 robo.setY(120);
	     robo.setX(-1);
		 if (robo.getX() < 0 && robo.getY() > 100) {
			 System.err.println("moveDownLeft test failed\nREASON: The robot is out of coordinates!!");
	            return percentage;
		 }
		 percentage += 25;
		 
		 robo.setY(-100);
	     robo.setX(1000);
		 if (robo.getX() > 100 && robo.getY() < 0) {
			 System.err.println("moveUpLeft test failed\nREASON: The robot is out of coordinates!!");
	            return percentage;
		 }
		 percentage += 25;
		 
		 return percentage;
	 }

}
