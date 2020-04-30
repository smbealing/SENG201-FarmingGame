package Action.FarmerAction;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import Action.Action;
import Crop.Crop;
import GameEnvironment.GameState;
import Item.CropItem;
import Item.GenericItem;

public class TendToCrop extends Action {
	
	private Set<Crop> plantedCropsSet;
	private Crop selectedCrop;
	
	private String cropOptions = "";
	private String cropItemOptions = "|---------------------------|\r\n" +
									 "|   ~ CROP ITEM OPTIONS ~   |\r\n" +
									 "| 1. Use Fertiliser         |\r\n" +
									 "| 2. Use Pesticide          |\r\n" +
									 "| 3. Use Water              |\r\n" +
									 "| 4. Use Heating  $20.00    |\r\n" +
									 "| 5. Use Speech             |\r\n" +
									 "|---------------------------|";
	
    public void perform(GameState state) {

    	if (state.checkFarmerAction()) {
    		if(getOptions(state)) {
    			
    			ArrayList<Crop> plantedCrops = new ArrayList<Crop>(plantedCropsSet);
    			
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
//        returnBack(state);
    }
    
    private boolean getOptions(GameState state) {
    	int index = 1;
    	String title = "| PLANTED CROPS |\r\n";
    	plantedCropsSet = new HashSet<Crop>();
    	
    	for (Crop crop: state.crops) {
    		if (crop.planted) {
    			plantedCropsSet.add(crop);
    		}
    	}
    	
    	for (Crop crop: plantedCropsSet) {
    		cropOptions = cropOptions + "| " + index + " " + crop.getName() + "\r\n";
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
    						   "| Oh no you don't have any more of the " + itemName + ". |\r\n" +
 		   		   	  		   "|--------------------------------------------------|");
    	}
    }
    
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
    
    private void useItem(GameState state, int boost, int growthBoost) {
    	state.farmer.reduceActionCount();
    	for (Crop crop: state.crops) {
    		if (crop.planted && crop.getName() == selectedCrop.getName()) {
    			crop.increaseGrowthLevel(boost + growthBoost);
    		}
    	}
    }
    
    private void waterCrops(GameState state) {
    	for (Crop crop: state.crops) {
    		if (crop.planted && crop.getName() == selectedCrop.getName()) {
    			crop.decreaseThirstLevel();
    		}
    	}
    }

//    private void returnBack(GameState state) {
//        super.perform(state);
//    }
}
