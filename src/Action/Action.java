package action;

import gameEnvironment.GameState;

public abstract class Action {
	
	public abstract void perform(GameState state);
	
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
