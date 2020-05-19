package gameEnvironment.randomEvent;

import gameEnvironment.GameState;
import gameEnvironment.randomEvent.RandomEvent;

public class CountyFair extends RandomEvent {
	
	/**
	 * Amount of money gained in county fair event.
	 */
	private double moneyWon;
	
	/**
	 * Performs the county fair random event.
	 * @param state  the current GameState
	 */
	public void apply(GameState state) {
		
		System.out.println("|--------------------------------------------------------------|\r\n" +
	  	   		   		   "|                         Congratulations!                     |\r\n" +
	  	   		   		   "| Your farm has won the top award at the annual Country Fair!  |\r\n" +
	  	   		   		   "|--------------------------------------------------------------|");
		moneyWon = state.animals.size() * 50.00 + state.crops.size() * 10.00;
		state.totalMoney += moneyWon;		
	}

}
