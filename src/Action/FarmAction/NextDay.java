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
		
		for (Crop crop: state.crops) {
			if (crop.planted) {
				if (crop.getThirstLevel() != 10) {
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
				break;
			case 2: 
				new BrokenFence().apply(state);
				break;
			case 3:
				break;
			case 4: 
				new CountyFair().apply(state);
				break;
			case 5:
				break;
		}
	}
	
}
