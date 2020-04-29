package GameEnvironment.RandomEvent;

import Crop.Crop;
import GameEnvironment.GameState;
import GameEnvironment.RandomEvent.RandomEvent;

public class Drought extends RandomEvent {
	
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
