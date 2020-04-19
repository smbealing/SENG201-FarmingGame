public class TropicalFarm extends Farm {

    public TropicalFarm(String tempName, Farmer tempFarmer) {
        super(tempName, tempFarmer);
        type = "Tropical Farm";

        addCrop(new Banana());
        addCrop(new DragonFruit());

    }
}
