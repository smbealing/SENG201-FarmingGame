package Farm;
import Crop.Corn;

public class HardcoreFarm extends Farm {

    public HardcoreFarm(String tempName, Farmer tempFarmer) {
        super(tempName, tempFarmer, "Hardcore Farm");

        addCrop(new Corn());

    }
}
