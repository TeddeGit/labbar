import java.awt.*;

public class Saab95 extends Car implements Movable { //Subklass

    public boolean turboOn;

    public String modelName; // The car model name
    
    public Saab95(){
        nrDoors = 2;
        color = Color.red;
        enginePower = 125;
	    turboOn = false;
        modelName = "Saab95";
        stopEngine();
    }

    public void setTurboOn(){
	    turboOn = true;
    }

    public void setTurboOff(){
	    turboOn = false;
    }
    
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }

    public void incrementSpeed(double amount){
        if ((currentSpeed >= 0) && (currentSpeed <= enginePower)) {
            currentSpeed = getCurrentSpeed() + speedFactor() * amount;
        }
    }

    public void decrementSpeed(double amount){
        if ((currentSpeed >= 0) && (currentSpeed <= enginePower)) {
            currentSpeed = getCurrentSpeed() - speedFactor() * amount;
        }
    }

}
