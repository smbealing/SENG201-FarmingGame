package action.farmerAction;

import gameEnvironment.GameState;
import action.Action;

public class TendToFarmLand extends Action {

    public void perform(GameState state) {
        if (checkFarmerAction(state)) {
            state.farm.setMaintenanceLevel(0);
            state.farmer.reduceActionCount();
        }

//        returnBack(state); // add back in for command lines
    }
}
