package Action.StatusAction;

import Action.Action;
import GameEnvironment.GameState;

public class FarmStatus extends Action {

    public void perform(GameState state) {
        System.out.println("| Your farm has $" + state.totalMoney + " available");
        System.out.println("| Total crops: " + state.crops.size() + "/" + state.farm.getMaxCropCount());
        System.out.println("| Total animals: " + state.animals.size() + "/" + state.farm.getMaxAnimalCount());
        System.out.println("| Need for maintenance: " +  state.farm.getMaintenanceLevel());

        returnBack(state);
    }
}
