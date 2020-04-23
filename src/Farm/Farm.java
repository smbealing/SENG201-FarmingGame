package Farm;
import java.util.ArrayList;

import Animal.Animal;
import Crop.Crop;

public abstract class Farm {

    private String name;
    private String type;
    private Farmer farmer;
    private double moneyAvailable;
    private int maintenanceLevel = 1;


    public Farm(String tempName, Farmer tempFarmer, String tempType) {
        name = tempName;
        farmer = tempFarmer;
        type = tempType;

    }

    public void setName(String tempName) {
        name = tempName;
    }

    public String getName() {
        return name;
    }
    
    public String getType() {
    	return type;
    }
    
    public Farmer getFarmer() {
    	return farmer;
    }
    
    public double getMoneyAvailable() {
    	return moneyAvailable;
    }

    public int getMaintenanceLevel() {
        return maintenanceLevel;
    }

    public void setMaintenanceLevel(int tempMaintenanceLevel) {
        maintenanceLevel = tempMaintenanceLevel;
    }


}
