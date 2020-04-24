package Action;

import java.util.Scanner;

import GameEnvironment.GameState;

public class TendToFarmLand extends FarmerAction {

    public void perform(GameState state) {
        if (state.farmer.getActionCount() > 0) {
            state.farm.setMaintenanceLevel(1);
            state.farmer.reduceActionCount();


        } else System.out.println("You have no more actions left today!");

        returnBack(state);
    }

    private void returnBack(GameState state) {
        super.perform(state);
    }
}
