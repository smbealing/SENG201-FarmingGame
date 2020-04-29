package Action.FarmerAction;

//import Action.Action;
import GameEnvironment.GameState;

public class TendToFarmLand  {

    public void perform(GameState state) {
        if (state.farmer.getActionCount() > 0) {
            state.farm.setMaintenanceLevel(0);
            state.farmer.reduceActionCount();


        } else System.out.println("| You have no more actions left today!");

        returnBack(state);
    }

    private void returnBack(GameState state) {
//        super.perform(state);
    }
}
