package Action.FarmerAction;


import GameEnvironment.GameState;
import Action.Action;
import Crop.Crop;


public class HarvestCrop extends Action {

    public void perform(GameState state) {
        if (checkFarmerAction(state)) {
            state.farmer.reduceActionCount();
            harvestCrops(state);
            System.out.println();

        }

        returnBack(state);
    }

    public void harvestCrops(GameState state) {
        for (Crop crop : state.crops) {
            if (crop.getDaysUntilHarvest() == 0) {
                state.totalMoney += crop.getSellingPrice();
                state.crops.remove(crop);
            }
        }
    }
}
