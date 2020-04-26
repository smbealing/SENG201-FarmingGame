package Farm;


public abstract class Farm {

    private String name;
    private String type;
    private Farmer farmer;
    private int maintenanceLevel = 1;

    public int cropCapacity;
    public int animalCapacity;


    public Farm(String tempName, Farmer tempFarmer, String tempType, int tempCropCapacity, int tempAnimalCapacity) {
        name = tempName;
        farmer = tempFarmer;
        type = tempType;
        cropCapacity = tempCropCapacity;
        animalCapacity = tempAnimalCapacity;

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


}
