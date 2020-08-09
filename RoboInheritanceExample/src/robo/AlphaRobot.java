package robo;

public class AlphaRobot extends AbstractRobot {
	
	private String name;
	private String model;
	private int x;
	private int y;
	
	//Constructor
	protected AlphaRobot(String name, String model) {
	  setName(name);
	  setModel(model);
	  setX(0);
	  setY(0);
	}
    
	//LIMITS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name != null) {
		this.name = name;
	    } else {
		System.err.println("value name it's emply");
	    }
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		if(model != null)
		this.model = model;
		else
		System.err.println("value model it's empty");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if (x > 0 && x < 100)
		this.x = x;
		else
		System.err.println("Wrong X coordonates");
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if (y > 0 && y < 100)
		this.y = y;
		else
		System.err.println("Wrong Y coordonates");
	}
	
    //MOVE
	public boolean moveRight() {
		if(Coordinates(getX())) {
		setX(getX() +1);
		return true;
		}
		return false;
	}

	public boolean moveLeft() {
		if(Coordinates(getX())) {
		setX(getX() -1);
		return true;
		}
		return false;
	}

	public boolean moveDown() {
		if(Coordinates(getY())) {
		setY(getY() +1);
		return true;
		}
		return false;
	}

	public boolean moveUp() {
		if(Coordinates(getY())) {
		setY(getY() -1);
		return true;
		}
		return false;
	}
	
	boolean Coordinates(int coordinates) {
		return (coordinates > 0 && coordinates < 100);
	}

	@Override
	public void setCharge(int charge) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public byte getCharge() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean moveDownRight() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean moveUpRight() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean moveDownLeft() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean moveUpLeft() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
}
