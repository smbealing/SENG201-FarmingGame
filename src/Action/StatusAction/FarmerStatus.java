package Action.StatusAction;

import Action.Action;
import GameEnvironment.GameState;

public class FarmerStatus extends Action {


    public void perform(GameState state) {
    	System.out.println("| Farmer: " +  state.farmer.getName());
    	System.out.println("| Age: " +  state.farmer.getAge());
        System.out.println("| Your farmer has " + state.farmer.getActionCount() + " action(s) left today.");

        returnBack(state);
    }

    private void returnBack(GameState state) {
//        super.perform(state);
    }
}
