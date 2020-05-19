package action.farmAction;

import java.util.Random;

import gameEnvironment.GameState;
import gameEnvironment.randomEvent.BrokenFence;
import gameEnvironment.randomEvent.CountyFair;
import gameEnvironment.randomEvent.Drought;
import action.Action;
import animal.Animal;
import crop.Crop;

public class NextDay extends Action {
	
	/**
	 * Performs the next day action.
	 * Increases day count, resets farmer action count, crops grow and become more thirsty,
	 * money is gained from animals, animal health and happiness decreases.
	 * @param state  the current GameState
	 */
	public void perform(GameState state) {
		state.currentDay += 1;
		state.farmer.setActionCount();
		
		for (Crop crop: state.crops) {
			if (crop.planted) {
				if (crop.getThirstLevel() != 10 && state.farm.getMaintenanceLevel() != state.farm.getMaxMaintenanceLevel()) {
					crop.increaseGrowthLevel(1);
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
			animal.decreaseHealth();
		}
		
//		randomEvent(state); // add back in for command lines
	}
	
	
	/**
	 * Handles random events.
	 * @param state  the current GameState
	 */
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
