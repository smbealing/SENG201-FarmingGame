package GameEnvironment.RandomEvent;

import GameEnvironment.GameState;
import GameEnvironment.RandomEvent.RandomEvent;

public class CountyFair extends RandomEvent {
	
	private double moneyWon;
	
	public void apply(GameState state) {
		
		System.out.println("|--------------------------------------------------------------|\r\n" +
	  	   		   		   "|                         Congratulations!                     |\r\n" +
	  	   		   		   "| Your farm has won the top award at the annual Country Fair!  |\r\n" +
	  	   		   		   "|--------------------------------------------------------------|");
		moneyWon = state.animals.size() * 50.00 + state.crops.size() * 10.00;
		state.totalMoney += moneyWon;		
	}

}
