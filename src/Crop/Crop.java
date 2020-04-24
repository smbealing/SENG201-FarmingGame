package Crop;

public abstract class Crop {

    private String name;
    private double purchasingPrice;
    private double sellingPrice;
    private int daysUntilHarvest;
    private int thirstLevel;
    private int maxThirstLevel = 10;
    
    public boolean planted = false;
    public int currentGrowthLevel = 0;


    public Crop(String tempName, double tempPurchasingPrice, double tempSellingPrice, int tempDaysUntilHarvest, int tempThirstLevel) {
        name = tempName;
        purchasingPrice = tempPurchasingPrice;
        sellingPrice = tempSellingPrice;
        daysUntilHarvest = tempDaysUntilHarvest;
        thirstLevel = tempThirstLevel;
    }
    
    public String getName() {
    	return name;
    }
    
    public double getPurchasingPrice() {
    	return purchasingPrice;
    }
    
    public double getSellingPrice() {
    	return sellingPrice;
    }
    
    public int getDaysUntilHarvest() {
    	return daysUntilHarvest;
    }
    
    public int getThirstLevel() {
    	return thirstLevel;
    }

    public int getMaxThirstLevel() {
        return maxThirstLevel;
    }

    public int getCurrentGrowthLevel() {
        return currentGrowthLevel;
    }

    public boolean getPlanted() {
        return planted;
    }

    public void setPlanted() {
        planted = true;
    }
    
    public void increaseThirstLevel() {   	
    	if (thirstLevel != 10) { thirstLevel += 1;}
    }
    
    public void decreaseThirstLevel() {
    	thirstLevel = 0;
    }

}
