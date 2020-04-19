public class HardcoreFarm extends Farm {

    public HardcoreFarm(String tempName, Farmer tempFarmer) {
        super(tempName, tempFarmer);
        type = "Hardcore Farm";

        addCrop(new Corn());

    }
}
