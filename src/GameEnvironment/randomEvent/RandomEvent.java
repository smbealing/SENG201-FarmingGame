package gameEnvironment.randomEvent;

import java.util.Random;

import gameEnvironment.GameState;

public abstract class RandomEvent {
	
	protected Random randomGenerator;
	
	public RandomEvent() {
		randomGenerator = new Random();
	}
}
