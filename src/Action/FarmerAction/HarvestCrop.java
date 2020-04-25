package Action.FarmerAction;


import Action.Action;
import GameEnvironment.GameState;
import Crop.Crop;


public class HarvestCrop  {

    public void perform(GameState state) {
        if (state.farmer.getActionCount() > 0) {
            state.farmer.reduceActionCount();
            harvestCrops(state);
            System.out.println();

        } else System.out.println("| You have no more actions left today!");

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

    private void returnBack(GameState state) {
//        super.perform(state);
    }
}
