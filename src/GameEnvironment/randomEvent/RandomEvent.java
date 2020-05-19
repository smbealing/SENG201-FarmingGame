package gameEnvironment.randomEvent;

import java.util.Random;

public abstract class RandomEvent {
	
	/**
	 * Declare a random number generator.
	 */
	protected Random randomGenerator;
	
	/**
	 * Initialise a random number generator.
	 */
	public RandomEvent() {
		randomGenerator = new Random();
	}
}
