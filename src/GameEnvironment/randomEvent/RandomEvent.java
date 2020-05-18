package gameEnvironment.randomEvent;

import java.util.Random;

public abstract class RandomEvent {
	
	protected Random randomGenerator;
	
	public RandomEvent() {
		randomGenerator = new Random();
	}
}
