package action.farmerAction;

import gameEnvironment.GameState;
import item.AnimalFood;
import action.Action;
import animal.Animal;

public class FeedAnimal extends Action {
	
	
	/**
	 * Animal food options shown to player.
	 */
	private String foodItemOptions = "|---------------------------|\r\n" +
			 						 "|   ~ FOOD ITEM OPTIONS ~   |\r\n" +
			 						 "| 1. Use Carrot             |\r\n" +
			 						 "| 2. Use Grain              |\r\n" +
			 						 "| 3. Use High Quality Grain |\r\n" +
			 						 "|---------------------------|";
	
	/**
	 * Performs the feed animal action.
	 * Takes the current GameState as a parameter.
	 */
    public void perform(GameState state) {
        if (checkFarmerAction(state)) {
        	switch(state.getOption(4, foodItemOptions)) {
	        	case 1:
	        		useFoodItem(state, "Carrot");
	        		break;
	        	case 2:
	        		useFoodItem(state, "Grain");
	        		break;
	        	case 3:
	        		useFoodItem(state, "High Quality Grain");
	        		break;
        	}
        }
//        returnBack(state); // add back in for command lines
    }
    
    /**
	 * Uses the selected food item to feed animals.
	 * Prints a warning if the player doesn't have the item available.
	 * Takes the current GameState and selected food item (String) as a parameters.
	 */
    private void useFoodItem(GameState state, String itemName) {
    	boolean found = false;
    	
    	for (AnimalFood item: state.animalFood) {
    		if (item.getName() == itemName) {
    			found = true;
    			
    			useItem(state, item.getHealthBoost(), item.getGeneralBoost());
    			state.animalFood.remove(item);
    			
    			break;
    		}
    	}
    	
    	if (!found) {
    		System.out.println("|---------------------------------------------------|\r\n" +
    						   "| Oh no! You don't have any more of that food item. |\r\n" +
 		   		   	  		   "|---------------------------------------------------|");
    	}
    }
    
    
    /**
	 * Loops through animals in the farm to feed them.
	 * Takes the current GameState as well as the selected item's 
	 * health boost (integer) and happiness boost (integer) as parameters.
	 */
    private void useItem(GameState state, int healthBoost, int boost) {
    	state.farmer.reduceActionCount();
    	for (Animal animal: state.animals) {
    		animal.increaseHappiness(boost);
    		animal.increaseHealth(healthBoost);
    		System.out.println("| Your " + animal.getName() + " has been fed.");
    	}
    }
}
