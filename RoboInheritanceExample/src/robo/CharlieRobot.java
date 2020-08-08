package robo;

public class CharlieRobot extends BetaRobot{
	
	protected CharlieRobot(String name, String model) {
		super(name, model);
	}
	

	public boolean moveDownRight() {
		return super.moveDown() && super.moveRight();

	}

    public boolean moveDownLeft() {
    	return super.moveDown() && super.moveLeft();

	}

    public boolean moveUpRight() {
    	 return super.moveUp() && super.moveRight();

	}

    public boolean moveUpLeft() {
    	 return super.moveUp() && super.moveLeft();

	}

}
