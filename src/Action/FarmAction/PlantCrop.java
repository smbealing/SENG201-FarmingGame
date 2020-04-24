package Action.FarmAction;

import Action.Action;
import GameEnvironment.GameState;


import java.util.Scanner;

public class PlantCrop extends Action {
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
            //Only prints out crops if they haven't been planted, maybe just print all?
            if (state.crops.get(i-1).getPlanted() == false) {
                cropOptions = cropOptions.concat(i + ". " + state.crops.get(i-1).getName() + "\n");
            }
        }

        System.out.println("Select a crop:");

        do {
            System.out.println(cropOptions);
            selection = s.nextInt();
            plantCrop(selection, state);

        } while(selection < 1 || selection > state.crops.size());
    }

    public void plantCrop(int selection, GameState state) {
        state.crops.get(selection).setPlanted();
        System.out.println("Your " + state.crops.get(selection).getName() + " has been planted.");
    }

    private void returnBack(GameState state) {
//        super.perform(state);
        }
}
