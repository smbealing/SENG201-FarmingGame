package action.farmerAction;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import gameEnvironment.GameState;
import item.CropItem;
import item.GenericItem;
import action.Action;
import crop.Crop;

public class TendToCrop extends Action {
	
	/**
	 * Stores a set of the crops that are planted.
	 */
	private Set<String> plantedCropsSet;
	
	/**
	 * Stores the crop selected by player.
	 */
	private String selectedCrop;
	
	
	/**
	 * Crop options shown to player.
	 */
	private String cropOptions = "";
	
	/**
	 * Crop item options shown to player.
	 */
	private String cropItemOptions = "|---------------------------|\r\n" +
									 "|   ~ CROP ITEM OPTIONS ~   |\r\n" +
									 "| 1. Use Fertiliser         |\r\n" +
									 "| 2. Use Pesticide          |\r\n" +
									 "| 3. Use Water              |\r\n" +
									 "| 4. Use Heating  $20.00    |\r\n" +
									 "| 5. Use Speech             |\r\n" +
									 "|---------------------------|";
	
	/**
	 * Performs the tend to crop action.
	 * Takes the current GameState as a parameter.
	 */
    public void perform(GameState state) {

    	if (checkFarmerAction(state)) {
    		if(getOptions(state)) {
    			
    			ArrayList<String> plantedCrops = new ArrayList<String>(plantedCropsSet);
    			
	    		switch(state.getOption(plantedCropsSet.size()+1, cropOptions)) {
		    		case 1:
		    			selectedCrop = plantedCrops.get(0);
		    			break;
		    		case 2:
		    			selectedCrop = plantedCrops.get(1);
		    			break;
		    		case 3:
		    			selectedCrop = plantedCrops.get(2);
		    			break;
		    		case 4:
		    			selectedCrop = plantedCrops.get(3);
		    			break;
		    		case 5:
		    			selectedCrop = plantedCrops.get(4);
		    			break;
		    		case 6:
		    			selectedCrop = plantedCrops.get(5);
		    			break;
	    		}
	    		
	    		switch(state.getOption(5, cropItemOptions)) {
		    		case 1:
		    			useCropItem(state, "Fertiliser");
		    			break;
		    		case 2:
		    			useCropItem(state, "Pesticide");
		    			break;
		    		case 3:
		    			useGenericItem(state, "Water");
		    			break;
		    		case 4:
		    			useGenericItem(state, "Warmth");
		    			break;
		    		case 5:
		    			useGenericItem(state, "Speech");
		    			break;
	    		}
    		}
    	}
//        returnBack(state); // add back in for command lines
    }
    
    
    /**
	 * Fills the plantedCropsSet with player's planted crops (no repetition of crop types). 
	 * Uses plantedCropsSet to fill cropOptions string.
	 * Takes the current GameState as a parameter.
	 */
    private boolean getOptions(GameState state) {
    	int index = 1;
    	String title = "| PLANTED CROPS |\r\n";
    	plantedCropsSet = new HashSet<String>();
    	
    	for (Crop crop: state.crops) {
    		if (crop.planted) {
    			plantedCropsSet.add(crop.getName());
    		}
    	}
    	
    	for (String crop: plantedCropsSet) {
    		cropOptions = cropOptions + "| " + index + " " + crop + "\r\n";
    		index++;
    	}
    	
    	if (cropOptions == "") {
    		cropOptions = "|------------------------------------------|\r\n" +
	   		   		   	  "| None of the crops have been planted yet. |\r\n" +
	   		   		   	  "|------------------------------------------|";
    		return false;
    	} else {
    		cropOptions = title + cropOptions;
    	}
    	
    	return true;
    }
    
    
    
    /**
	 * Checks whether selected crop item is available.
	 * If item is available, item boosts are applied to crops 
	 * and item is removed from player's cropItems list.
	 * If item is unavailable, a warning message is printed.
	 * Takes the current GameState and selected item (String) as parameters.
	 */
    private void useCropItem(GameState state, String itemName) {
    	boolean found = false;
    	
    	for (CropItem item: state.cropItems) {
    		if (item.getName() == itemName) {
    			found = true;
    			
    			useItem(state, item.getGeneralBoost(), item.getGrowthBoost());
    			state.cropItems.remove(item);
    			
    			break;
    		}
    	}
    	
    	if (!found) {
    		System.out.println("|--------------------------------------------------|\r\n" +
    						   "| Oh no! You don't have any more of the " + itemName + ". |\r\n" +
 		   		   	  		   "|--------------------------------------------------|");
    	}
    }
    
    
    /**
	 * Handles use of selected item if it is a generic item (not sold at Shop).
	 * Takes the current GameState and selected item (String) as parameters.
	 */
    private void useGenericItem(GameState state, String itemName) {    	
    	for (GenericItem item: state.items) {
    		if (item.getName() == itemName) {
    			
    			if (itemName == "Water") {
    				waterCrops(state);
    				useItem(state, item.getGeneralBoost(), 0);
    				
    	    	} else if (itemName == "Warmth") {
    	    		
    	    		if ((state.totalMoney - item.getPurchasingPrice()) > 0.00) {
    	    			state.totalMoney -= item.getPurchasingPrice();
    	    			useItem(state, item.getGeneralBoost(), 0);
    	    		} else {
    	    			System.out.println("|---------------------------------------------------------|\r\n" +
 					   		   			   "| Oh no! You aren't able to afford heating for the crops! |\r\n" +
 					   		   			   "|---------------------------------------------------------|");
    	    		}
    	    		
    	    	} else if (itemName == "Speech") {
    	    		useItem(state, item.getGeneralBoost(), 0);
    	    	}
    			
    			break;
    		}
    	}
    }
    
    /**
	 * Handles use of selected item if it is a crop item.
	 * Takes the current GameState, and selected item's boost values (integers) as parameters.
	 */
    private void useItem(GameState state, int boost, int growthBoost) {
    	state.farmer.reduceActionCount();
    	for (Crop crop: state.crops) {
    		if (crop.planted && crop.getName() == selectedCrop) {
    			crop.increaseGrowthLevel(boost + growthBoost);
    		}
    	}
    }
    
    /**
	 * Handles use of selected item if it is a crop item.
	 * Takes the current GameState as a parameter.
	 */
    private void waterCrops(GameState state) {
    	for (Crop crop: state.crops) {
    		if (crop.planted && crop.getName() == selectedCrop) {
    			crop.decreaseThirstLevel();
    		}
    	}
    }
}
