package farm;


public class CityFarm extends Farm {

	/**
	 * The constructor method for a CityFarm.
	 * Takes farm name (String) and farmer (Farmer) as parameters.
	 */
    public CityFarm(String tempName, Farmer tempFarmer) {
        super(tempName, tempFarmer, "City Farm", 15, 5);

    }
}
