package gameEnvironment.randomEvent;

import gameEnvironment.GameState;
import gameEnvironment.randomEvent.RandomEvent;
import crop.Crop;

public class Drought extends RandomEvent {
	
	/**
	 * Performs the drought random event.
	 * @param state  the current GameState
	 */
	public void apply(GameState state) {
		
		System.out.println("|--------------------------------------------------------------------|\r\n" +
	   				  	   "| Oh no! A drought happened over night and it has effected you farm! |\r\n" +
	   				  	   "|      The wells have dried up, and the crops are thirsty!           |\r\n" +
	   				  	   "|--------------------------------------------------------------------|");
		
		for (Crop crop: state.crops) {
			if (crop.planted) {
				
				crop.setThirstLevel(10);
				
				switch(randomGenerator.nextInt(1)) {
					case 0:
						break;
					case 1:
						state.crops.remove(crop);
						break;
				}
			}
		}
	}
}
