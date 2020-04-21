public abstract class Crop {

    private double purchasingPrice;
    private double sellingPrice;
    private int daysUntilHarvest;
    private int thirstLevel;
    private String name;

    public Crop(double tempPurchasingPrice, double tempSellingPrice, int tempDaysUntilHarvest) {
        purchasingPrice = tempPurchasingPrice;
        sellingPrice = tempSellingPrice;
        daysUntilHarvest = tempDaysUntilHarvest;
    }

    public void harvest() {
        //TO DO: implement me
    }
}
