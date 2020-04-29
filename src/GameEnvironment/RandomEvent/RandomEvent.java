package GameEnvironment.RandomEvent;

import java.util.Random;

import GameEnvironment.GameState;

public abstract class RandomEvent {
	
	protected Random randomGenerator;
	
	public RandomEvent() {
		randomGenerator = new Random();
	}
	
//	public abstract void apply(GameState state);
}
