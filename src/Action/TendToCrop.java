package Action;

import Farm.Farm;
import Farm.Farmer;

import java.util.Scanner;

public class TendToCrop extends FarmerAction {

    public void perform(GameState state) {
        if (state.farmer.getActionCount() > 0) {
            // Do something
            state.farmer.reduceActionCount();


        } else System.out.println("You have no more actions left today!");

        returnBack(state);
    }

    private void returnBack(GameState state) {
        super.perform(state);
    }
}
