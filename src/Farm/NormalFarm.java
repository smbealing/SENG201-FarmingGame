package Farm;
import Animal.Cow;
import Animal.Sheep;
import Crop.Wheat;

public class NormalFarm extends Farm {

    public NormalFarm(String tempName, Farmer tempFarmer) {
        super(tempName, tempFarmer, "Normal Farm");

        addCrop(new Wheat());
        addAnimal(new Cow());
        addAnimal(new Sheep());

    }
}
