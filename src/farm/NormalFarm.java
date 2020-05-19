package farm;


public class NormalFarm extends Farm {

	/**
	 * The constructor method for a NormalFarm.
	 * Takes farm name (String) and farmer (Farmer) as parameters.
	 */
    public NormalFarm(String tempName, Farmer tempFarmer) {
        super(tempName, tempFarmer, "Normal Farm", 20, 10);


    }
}
