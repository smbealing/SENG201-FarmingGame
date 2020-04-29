package Action.FarmerAction;

import Action.Action;
import Animal.Animal;
import GameEnvironment.GameState;
import Item.AnimalFood;
import Item.GenericItem;

public class FeedAnimal extends Action {
	
	private String foodItemOptions = "|---------------------------|\r\n" +
			 						 "|   ~ FOOD ITEM OPTIONS ~   |\r\n" +
			 						 "| 1. Use Carrot             |\r\n" +
			 						 "| 2. Use Grain              |\r\n" +
			 						 "| 3. Use High Quality Grain |\r\n" +
			 						 "| 4. Use Heating  $20.00    |\r\n" +
			 						 "|---------------------------|";

    public void perform(GameState state) {
        if (state.checkFarmerAction()) {
        	switch(state.getOption(6, foodItemOptions)) {
	        	case 1:
	        		useFoodItem(state, "Carrot");
	        		break;
	        	case 2:
	        		useFoodItem(state, "Grain");
	        		break;
	        	case 3:
	        		useFoodItem(state, "High Quality Grain");
	        		break;
	        	case 4:
	        		useHeating(state, state.items.get(0));
	        		break;
        	}
        }
//        returnBack(state);
    }
    
    private void useFoodItem(GameState state, String itemName) {
    	boolean found = false;
    	
    	for (AnimalFood item: state.animalFood) {
    		if (item.getName() == itemName) {
    			found = true;
    			
    			useItem(state, item.getHealthBoost(), item.getGeneralBoost());
    			
    			break;
    		}
    	}
    	
    	if (!found) {
    		System.out.println("|--------------------------------------------------|\r\n" +
    						   "| Oh no you don't have any more of that food item. |\r\n" +
 		   		   	  		   "|--------------------------------------------------|");
    	}
    }
    
    private void useHeating(GameState state, GenericItem item) {
    	if ((state.totalMoney - item.getPurchasingPrice()) > 0.00) {
    		
			state.totalMoney -= item.getPurchasingPrice();
			useItem(state, 0 ,item.getGeneralBoost());
			
		} else {
			System.out.println("|-----------------------------------------------------------|\r\n" +
			   		   		   "| Oh no! You aren't able to afford heating for the animals! |\r\n" +
			   		   		   "|-----------------------------------------------------------|");
		}
    }
    
    private void useItem(GameState state, int healthBoost, int boost) {
    	state.farmer.reduceActionCount();
    	for (Animal animal: state.animals) {
    		animal.increaseHappiness(boost);
    		animal.increaseHealth(healthBoost);
    	}
    }

//    private void returnBack(GameState state) {
//        super.perform(state);
//    }
}
