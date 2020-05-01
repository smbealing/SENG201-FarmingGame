package Action.FarmerAction;

import Action.Action;
import GameEnvironment.GameState;

public class TendToFarmLand extends Action {

    public void perform(GameState state) {
        if (checkFarmerAction(state)) {
            state.farm.setMaintenanceLevel(0);
            state.farmer.reduceActionCount();
        }

        returnBack(state);
    }
}
