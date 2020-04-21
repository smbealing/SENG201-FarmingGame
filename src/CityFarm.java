public class CityFarm extends Farm {

    public CityFarm(String tempName, Farmer tempFarmer) {
        super(tempName, tempFarmer, "City Farm");

        addCrop(new Tomato());
        addCrop(new Potato());
        addAnimal(new Sheep());
    }
}
