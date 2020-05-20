package gameEnvironment.randomEvent;

import gameEnvironment.GameState;
import gameEnvironment.randomEvent.RandomEvent;
import animal.Animal;

public class BrokenFence extends RandomEvent {
	
	/**
	 * Number of animals lost in broken fence event.
	 */
	private int animalsLost;
	
	/**
	 * Performs the broken fence random event.
	 * @param state  the current GameState
	 */
	public void apply(GameState state) {
		
		System.out.println("|--------------------------------|\r\n" +
						   "|    Oh no! Your fence broke!    |\r\n" +
						   "| Some of your animals escaped!  |\r\n" +
						   "|--------------------------------|");
		
		if (state.animals.size() > 0) { state.animals.remove(0); }
		
		if (state.animals.size() > 0) {
			
			animalsLost = randomGenerator.nextInt(state.animals.size());
			
			for (Animal animal: state.animals) {
				animal.decreaseHappiness();
				animal.decreaseHappiness();
				
				if (animalsLost > 0) {
					switch(randomGenerator.nextInt(1)) {
					case 0:
						break;
					case 1:
						state.animals.remove(animal);
						break;
					}
					animalsLost--;
				} 
			}
		}
	}
}
