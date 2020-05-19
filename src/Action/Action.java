package action;

import gameEnvironment.GameState;

public abstract class Action {
	
	
	/**
	 * An abstract method to perform an action. 
	 * @param state  the current GameState
	 */
	public abstract void perform(GameState state);
	
	
	/**
	 * Checks whether the farmer has actions left in the day.
	 * Returns true if farmer has actions left, false otherwise.
	 * @param state  the current GameState
	 * @return true if the farmer has actions left in the day, false otherwise
	 */
	public boolean checkFarmerAction(GameState state) {
    	if (state.farmer.getActionCount() == 0) {
    		System.out.println("| Oh no! " + state.farmer.getName() + " does not have any energy left for today!");
    		return false;
    	} else {

			return true;
		}
}
	
//	public void returnBack(GameState state) { add back in for command lines
//		state.main.gameLoop();
//	}
	
}
