package crop;

public abstract class Crop {

	/**
	 * The name of the crop.
	 */
    private String name;
    
    /**
	 * The purchasing price of the crop.
	 */
    private double purchasingPrice;
    
    /**
	 * The selling price of the crop.
	 */
    private double sellingPrice;
    
    /**
	 * The amount of days a new crop needs to grow before it can be harvested.
	 */
    private final int daysUntilHarvest;
    
    /**
	 * The current thirst level the crop.
	 */
    private int thirstLevel;
    
    /**
	 * The maximum thirst level the crop.
	 */
    private final int maxThirstLevel = 10;
    
    /**
	 * True if the crop has been planted. False otherwise.
	 */
    public boolean planted = false;
    
    /**
	 * Number of days the crop has grown for.
	 */
    public int currentGrowthLevel = 0;


    /**
	 * The constructor method for a Crop.
	 * Takes crop name (String), purchasing price (double), selling price (double), 
	 * days until harvest (integer) and thirst level (integer) as parameters.
	 */
    public Crop(String tempName, double tempPurchasingPrice, double tempSellingPrice, int tempDaysUntilHarvest, int tempThirstLevel) {
        name = tempName;
        purchasingPrice = tempPurchasingPrice;
        sellingPrice = tempSellingPrice;
        daysUntilHarvest = tempDaysUntilHarvest;
        thirstLevel = tempThirstLevel;
    }
    
    /**
	 * Getter for crop's name.
	 */
    public String getName() {
    	return name;
    }
    
    /**
	 * Getter for crop's purchasing price.
	 */
    public double getPurchasingPrice() {
    	return purchasingPrice;
    }
    
    /**
	 * Getter for crop's selling price.
	 */
    public double getSellingPrice() {
    	return sellingPrice;
    }
    
    /**
   	 * Getter for amount of days a new crop needs to grow before it can be harvested.
   	 */
    public int getDaysUntilHarvest() {
    	return daysUntilHarvest;
    }
    
    /**
	 * Getter for crop's current thirst level.
	 */
    public int getThirstLevel() {
    	return thirstLevel;
    }

    /**
	 * Getter for crop's maximum thirst level.
	 */
    public int getMaxThirstLevel() {
        return maxThirstLevel;
    }

    /**
   	 * Getter for number of days the crop has grown for.
   	 */
    public int getCurrentGrowthLevel() {
        return currentGrowthLevel;
    }

    /**
   	 * Getter for whether crop is planted.
   	 */
    public boolean getPlanted() {
        return planted;
    }

    /**
   	 * Sets crop as planted.
   	 */
    public void setPlanted() {
        planted = true;
    }
    
    /**
   	 * Sets crop's thirst level.
   	 * Takes a thirst level (integer) as a parameter.
   	 */
    public void setThirstLevel(int tempThirstLevel) {
    	thirstLevel = tempThirstLevel;
    }

    /**
   	 * Increases the crop's thirst level by 1.
   	 */
    public void increaseThirstLevel() {   	
    	if (thirstLevel != maxThirstLevel) { thirstLevel += 1; }
    }
    
    /**
   	 * Decreases the crop's thirst level to 0.
   	 */
    public void decreaseThirstLevel() {
    	thirstLevel = 0;
    }
    
    /**
   	 * Increases the crop's growth level by a boost.
   	 * Takes a boost (integer) as a parameter.
   	 */
    public void increaseGrowthLevel(int boost) {   	
    	currentGrowthLevel += boost;
    	
    	if (currentGrowthLevel > daysUntilHarvest) { currentGrowthLevel = daysUntilHarvest; }
    }

}
