package robo;

import Interface.BatteryInterface;
import Interface.CoordinatesInterface;
import Interface.MoveInterface;

public abstract class AbstractRobot implements CoordinatesInterface,BatteryInterface,MoveInterface {
	 // Robot schema 
    public abstract void setName(String name);
    public abstract String getName();

    public abstract void setModel(String model);
    public abstract String getModel();

}
