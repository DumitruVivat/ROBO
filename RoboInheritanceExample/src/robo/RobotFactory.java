package robo;

public class RobotFactory {
	public static AbstractRobot getRobot(String model, String name) {
		AbstractRobot Make = null;
		switch(model) {
		case "alpha":
			Make =  new AlphaRobot(model, name);
			break;
		case "beta":
			Make =  new BetaRobot(model, name);
			break;
		case "charlie":
			Make =  new CharlieRobot(model, name);
			break;
			default: System.out.println("We can't create this robot !!");
		}
		return Make;
	}

}
