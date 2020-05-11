package farm;


public abstract class Farm {

    private String name;
    private String type;
    private Farmer farmer;
    private int maintenanceLevel = 0;

    private final int maxCropCount;
    private final int maxAnimalCount;
    private final int maxMaintenanceLevel = 3;

    public Farm(String tempName, Farmer tempFarmer, String tempType, int tempMaxCropCount, int tempMaxAnimalCount) {
        name = tempName;
        farmer = tempFarmer;
        type = tempType;
        maxCropCount = tempMaxCropCount;
        maxAnimalCount = tempMaxAnimalCount;

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

    public int getMaintenanceLevel() {
        return maintenanceLevel;
    }
    
    public int getMaxMaintenanceLevel() {
        return maxMaintenanceLevel;
    }

    public void setMaintenanceLevel(int tempMaintenanceLevel) {
        maintenanceLevel = tempMaintenanceLevel;
    }
    
    public void increaseMaintenanceLevel() {
    	maintenanceLevel++;
    	if (maintenanceLevel > maxMaintenanceLevel) { maintenanceLevel = maxMaintenanceLevel; }
    }
    
    public int getMaxAnimalCount() {
    	return maxAnimalCount;
    }
    
    
    public int getMaxCropCount() {
    	return maxCropCount;
    }
    
    


}
