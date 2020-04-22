package Farm;
import Crop.Banana;
import Crop.DragonFruit;

public class TropicalFarm extends Farm {

    public TropicalFarm(String tempName, Farmer tempFarmer) {
        super(tempName, tempFarmer, "Tropical Farm");

        addCrop(new Banana());
        addCrop(new DragonFruit());

    }
}
