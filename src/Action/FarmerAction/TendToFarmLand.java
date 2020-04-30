package Action.FarmerAction;

//import Action.Action;
import GameEnvironment.GameState;

public class TendToFarmLand  {

    public void perform(GameState state) {
        if (state.checkFarmerAction()) {
            state.farm.setMaintenanceLevel(0);
            state.farmer.reduceActionCount();


        } 

        returnBack(state);
    }

    private void returnBack(GameState state) {
//        super.perform(state);
    }
}
