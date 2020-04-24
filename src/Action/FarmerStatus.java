package Action;

import GameEnvironment.GameState;

public class FarmerStatus {


    public void perform(GameState state) {
        System.out.println("Your farmer has " + state.farmer.getActionCount() + " action(s) left today");

        returnBack(state);
    }

    private void returnBack(GameState state) {
//        super.perform(state);
    }
}
