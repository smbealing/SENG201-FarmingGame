package action.farmerAction;


import gameEnvironment.GameState;

import java.util.ArrayList;

import action.Action;
import crop.Crop;


public class HarvestCrop extends Action {
	
	/**
	 * Performs the harvest crop action.
	 * Takes the current GameState as a parameter.
	 */
    public void perform(GameState state) {
        if (checkFarmerAction(state)) {
            state.farmer.reduceActionCount();
            harvestCrops(state);
            System.out.println();

        }

//        returnBack(state); // add back in for command lines
    }
    
    /**
	 * Loops through all crops and increases player's money for each crop ready to harvest. 
	 * Harvested crops are then removed from the GameState's crop list.
	 * Takes the current GameState as a parameter.
	 */
    public void harvestCrops(GameState state) {
    	ArrayList<Crop> harvestedCrops = new ArrayList<Crop>();
        for (Crop crop : state.crops) {
            if (crop.getCurrentGrowthLevel() == crop.getDaysUntilHarvest()) {
                state.totalMoney += crop.getSellingPrice();
                harvestedCrops.add(crop);
            }
        }
        
        for (Crop crop : harvestedCrops) {
            state.crops.remove(crop);
        }
    }
}
