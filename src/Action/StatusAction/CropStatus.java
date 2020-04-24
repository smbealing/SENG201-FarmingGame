package Action.StatusAction;

import java.util.Scanner;

import Action.Action;
import GameEnvironment.GameState;

public class CropStatus {
    protected Scanner s;

    public void perform(GameState state) {

        selectCrop(state);

        returnBack(state);
    }

    public void selectCrop(GameState state) {
        s = new Scanner(System.in);
        int selection = 0;
        String cropOptions = "";

        for (int i = 1; i <= state.crops.size(); i ++) {
            cropOptions = cropOptions.concat(i + ". " + state.crops.get(i-1).getName() + "\n");
        }

        System.out.println("Select a crop:");

        do {
            System.out.println(cropOptions);
            selection = s.nextInt();
            showCropStatus(selection, state);

        } while(selection < 1 || selection > state.crops.size());
    }

    public void showCropStatus(int selection, GameState state) {
        System.out.println("You have selected: " + state.crops.get(selection).getName());
        if (state.crops.get(selection).getPlanted()) {
            System.out.println("This crop has grown for " + state.crops.get(selection).getCurrentGrowthLevel() + " day(s).");
            System.out.println("Day(s) left until harvest " + state.crops.get(selection).getDaysUntilHarvest());
        } else {
            System.out.println("This crop has not been planted yet.");
        }

    }

    private void returnBack(GameState state) {
//        super.perform(state);
    }
}
