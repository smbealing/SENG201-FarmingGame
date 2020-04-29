package Farm;


public abstract class Farm {

    private String name;
    private String type;
    private Farmer farmer;
    private int maintenanceLevel = 1;

    private final int maxCropCount;
    private final int maxAnimalCount;


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

    public void setMaintenanceLevel(int tempMaintenanceLevel) {
        maintenanceLevel = tempMaintenanceLevel;
    }
    
    public int getMaxAnimalCount() {
    	return maxAnimalCount;
    }
    
    
    public int getMaxCropCount() {
    	return maxCropCount;
    }
    
    


}
