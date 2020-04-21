public abstract class Crop {

    private String name;
    private double purchasingPrice;
    private double sellingPrice;
    private int daysUntilHarvest;
    private int thirstLevel;


    public Crop(String tempName, double tempPurchasingPrice, double tempSellingPrice, int tempDaysUntilHarvest, int tempThirstLevel) {
        name = tempName;
        purchasingPrice = tempPurchasingPrice;
        sellingPrice = tempSellingPrice;
        daysUntilHarvest = tempDaysUntilHarvest;
        thirstLevel = tempThirstLevel;
    }

    public void harvest() {
        //TO DO: implement me
    }
}
