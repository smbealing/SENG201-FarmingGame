package action.statusAction;

import gameEnvironment.GameState;
import action.Action;

public class FarmerStatus extends Action {


	/**
	 * Displays status information about farmer.
	 * @param state  the current GameState
	 */
    public void perform(GameState state) {
    	System.out.println("| Farmer: " +  state.farmer.getName());
    	System.out.println("| Age: " +  state.farmer.getAge());
        System.out.println("| Your farmer has " + state.farmer.getActionCount() + " action(s) left today.");

//        returnBack(state); // add back in for command lines
    }
}
