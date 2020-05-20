package farm;


public class Farm {

	/**
	 * The name of the farm.
	 */
    private String name;
    
    /**
	 * The type of the farm.
	 */
    private String type;
    
    /**
	 * The farmer of the farm.
	 */
    private Farmer farmer;
    
    /**
	 * The current need for maintenance of the farm.
	 */
    private int maintenanceLevel = 0;

    /**
	 * The maximum crop capacity of the farm.
	 */
    private final int maxCropCount;
    
    /**
	 * The maximum animal capacity of the farm.
	 */
    private final int maxAnimalCount;
    
    /**
	 * The maximum need for maintenance of the farm.
	 */
    private final int maxMaintenanceLevel = 3;

    /**
	 * The constructor method for a Farm.
	 * @param tempName  farm's name (String)
	 * @param tempFarmer  farm's farmer (Farmer)
	 * @param tempType   farm's type (String)
	 * @param tempMaxCropCount  farm's maximum crop capacity (integer)
	 * @param tempMaxAnimalCount  farm's maximum animal capacity (integer)
	 */
    public Farm(String tempName, Farmer tempFarmer, String tempType, int tempMaxCropCount, int tempMaxAnimalCount) {
        name = tempName;
        farmer = tempFarmer;
        type = tempType;
        maxCropCount = tempMaxCropCount;
        maxAnimalCount = tempMaxAnimalCount;

    }
    
    /**
	 * Setter for farm's name.
	 * @param tempName  a name for the farm (String)
	 */
    public void setName(String tempName) {
        name = tempName;
    }

    /**
	 * Getter for farm's name.
	 */
    public String getName() {
        return name;
    }
    
    /**
	 * Getter for farm's type.
	 */
    public String getType() {
    	return type;
    }
    
    /**
	 * Getter for farm's farmer.
	 */
    public Farmer getFarmer() {
    	return farmer;
    }

    /**
	 * Getter for farm's current need for maintenance.
	 */
    public int getMaintenanceLevel() {
        return maintenanceLevel;
    }
    
    /**
	 * Getter for farm's maximum need for maintenance.
	 */
    public int getMaxMaintenanceLevel() {
        return maxMaintenanceLevel;
    }

    /**
	 * Setter for farm's current need for maintenance.
	 * @param tempMaintenanceLevel  a level to set maintenanceLevel to (integer)
	 */
    public void setMaintenanceLevel(int tempMaintenanceLevel) {
        maintenanceLevel = tempMaintenanceLevel;
    }
    
    /**
	 * Increases farm's need for maintenance by 1.
	 */
    public void increaseMaintenanceLevel() {
    	maintenanceLevel++;
    	if (maintenanceLevel > maxMaintenanceLevel) { maintenanceLevel = maxMaintenanceLevel; }
    }
    
    /**
	 * Getter for farm's maximum animal capacity.
	 */
    public int getMaxAnimalCount() {
    	return maxAnimalCount;
    }
    
    /**
	 * Getter for farm's maximum crop capacity.
	 */
    public int getMaxCropCount() {
    	return maxCropCount;
    }
    
    


}
