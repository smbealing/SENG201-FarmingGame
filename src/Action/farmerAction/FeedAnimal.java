package action.farmerAction;

import gameEnvironment.GameState;
import item.AnimalFood;
import action.Action;
import animal.Animal;

public class FeedAnimal extends Action {
	
	private String foodItemOptions = "|---------------------------|\r\n" +
			 						 "|   ~ FOOD ITEM OPTIONS ~   |\r\n" +
			 						 "| 1. Use Carrot             |\r\n" +
			 						 "| 2. Use Grain              |\r\n" +
			 						 "| 3. Use High Quality Grain |\r\n" +
			 						 "|---------------------------|";

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
    
    private void useItem(GameState state, int healthBoost, int boost) {
    	state.farmer.reduceActionCount();
    	for (Animal animal: state.animals) {
    		animal.increaseHappiness(boost);
    		animal.increaseHealth(healthBoost);
    		System.out.println("| Your " + animal.getName() + " has been fed.");
    	}
    }
}
