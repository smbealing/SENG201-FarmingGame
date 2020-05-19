package farm;


public class CityFarm extends Farm {

	/**
	 * The constructor method for a CityFarm.
	 * @param tempName  the farm name (String)
	 * @param tempFarmer  the farmer (Farmer)
	 */
    public CityFarm(String tempName, Farmer tempFarmer) {
        super(tempName, tempFarmer, "City Farm", 15, 5);

    }
}
