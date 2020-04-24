package Action.FarmAction;

import Action.Action;
import Animal.Animal;
import Crop.Crop;
import GameEnvironment.GameState;

public class NextDay extends Action {
	
	public void perform(GameState state) {
		state.currentDay += 1;
		
		for (Crop crop: state.crops) {
			if (crop.planted) {
				if (crop.getThirstLevel() != 10) {
					crop.currentGrowthLevel += 1;
				}
				
				crop.increaseThirstLevel();
			}			
		}
		
		for (Animal animal: state.animals) {
			int requiredHappiness = animal.maxHappiness / 2;
			
			if (animal.getHappiness() >= requiredHappiness) {
				state.totalMoney += animal.getIncome();
			}
			
			animal.decreaseHappiness();
			animal.decreaseHeath();
		}
		
//		RandomEventHandler.newDayEvent(state);
	}
	
}
