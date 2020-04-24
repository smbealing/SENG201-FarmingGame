package Action;

import GameEnvironment.GameState;

public class FarmStatus extends ViewStatus {

    public void perform(GameState state) {
        System.out.println("Your farm has " + state.totalMoney + " available");

        returnBack(state);
    }

    private void returnBack(GameState state) {
        super.perform(state);
    }
}
