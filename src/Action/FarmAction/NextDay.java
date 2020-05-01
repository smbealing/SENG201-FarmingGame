package Action.FarmAction;

import java.util.Random;

import Action.Action;
import Animal.Animal;
import Crop.Crop;
import GameEnvironment.GameState;
import GameEnvironment.RandomEvent.BrokenFence;
import GameEnvironment.RandomEvent.CountyFair;
import GameEnvironment.RandomEvent.Drought;

public class NextDay extends Action {
	
	public void perform(GameState state) {
		state.currentDay += 1;
		state.farmer.setActionCount();
		
		for (Crop crop: state.crops) {
			if (crop.planted) {
				if (crop.getThirstLevel() != 10 && state.farm.getMaintenanceLevel() == state.farm.getMaxMaintenanceLevel()) {
					crop.currentGrowthLevel += 1;
				}
				
				crop.increaseThirstLevel();
			}			
		}
		
		for (Animal animal: state.animals) {
			int requiredHappiness = animal.getMaxHappiness() / 2;
			
			if (animal.getHappiness() >= requiredHappiness) {
				state.totalMoney += animal.getIncome();
			}
			if (state.farm.getMaintenanceLevel() == state.farm.getMaxMaintenanceLevel()) {
				animal.decreaseHappiness();
			}
			
			animal.decreaseHappiness();
			animal.decreaseHeath();
		}
		
		randomEvent(state);
	}
	
	private void randomEvent(GameState state) {
		switch(new Random().nextInt(5)) {
			case 0: 
				new Drought().apply(state);
				break;
			case 1:
				state.farm.increaseMaintenanceLevel();
				break;
			case 2: 
				new BrokenFence().apply(state);
				break;
			case 3:
				state.farm.increaseMaintenanceLevel();
				break;
			case 4: 
				new CountyFair().apply(state);
				break;
			case 5:
				state.farm.increaseMaintenanceLevel();
				break;
		}
	}
	
}
