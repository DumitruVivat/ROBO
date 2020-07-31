package robo;

public class BetaRobot extends AlphaRobot {
	
	private byte charge;
	
	//Constructor
	public BetaRobot(String name,String model) {
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
		if(ChargeLimits(charge)) {
		System.err.println("Loow Battery !!");
		}
		return super.moveRight();
	}
	public boolean moveLeft() {
		if(ChargeLimits(charge)) {
			System.err.println("Loow Battery !!");
			}
		return super.moveLeft();
	}
	public boolean moveDown() {
		if(ChargeLimits(charge)) {
			System.err.println("Loow Battery !!");
			}
		return super.moveDown();
	}
	public boolean moveUp() {
		if(ChargeLimits(charge)) {
			System.err.println("Loow Battery !!");
			}
		return super.moveUp();
	}
	///Limits
	public boolean ChargeLimits(byte battery) {
		return (battery < 5);
	}
	
	
}
