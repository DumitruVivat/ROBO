package robo;

public class BetaRobot extends AlphaRobot {
	
	private byte charge;
	private byte move = 0;
	
	
	
	//Constructor
	protected BetaRobot(String name,String model) {
		super(name,model);
		setCharge((byte)0);
	}
    //LIMITS
	public byte getCharge() {
		return charge;
	}

	public void setCharge(byte charge) {
		if(charge >= 0 && charge <= 100)
		this.charge = charge;
		else
		System.err.println("Charge , ERROR !!");
	}
    //MOVE
    public boolean moveRight() {
    	if(batteryLow() && super.moveRight()) {
    	  ChargeMove();
    	  return true;	
    	  }
    	  return false;
	}	
	public boolean moveLeft() {
		if(batteryLow() && super.moveLeft()) {
	    	ChargeMove();
	    	return true;	
	    	}
			return false;
	}
	public boolean moveDown() {
		if(batteryLow() && super.moveDown()) {
	    	ChargeMove();
	    	return true;	
	    	}
			return false;
	}
	public boolean moveUp() {
		if(batteryLow() && super.moveUp()) {
	    	ChargeMove();
	    	return true;	
	    	}
			return false;
	}
	///Limits
	public boolean batteryLow() {
	if(charge < 5) {
		System.err.println("Low Battery");
	    return false;
	}else {
	    return true;
	}
	}
	public void ChargeMove() {
	move++;
	if(move == 2) {
	   setCharge((byte)(getCharge()-1));
	   move = 0;
	} 
	}
	
	
}
