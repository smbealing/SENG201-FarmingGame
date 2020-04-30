package Action.FarmerAction;

import java.util.Scanner;

import Action.Action;
import Animal.Animal;
import GameEnvironment.GameState;
import Item.Speech;
import Item.Warmth;

public class PlayWithAnimal {
    protected Scanner s;

    public void perform(GameState state) {
        if (state.checkFarmerAction()) {
            state.farmer.reduceActionCount();
            selectAnimal(state);

        }

        returnBack(state);
    }

    public void selectAnimal(GameState state) {
        s = new Scanner(System.in);
        int selection = 0;
        String animalOptions = "";

        for (int i = 1; i <= state.animals.size(); i ++) {
            animalOptions = animalOptions.concat("| " + i + ". " + state.animals.get(i-1).getName() + "\n");
        }

        System.out.println("|-------------------|\r\n" +
                "| Select an animal. |\r\n" +
                "|-------------------|");

        do {
            System.out.println(animalOptions);
            selection = s.nextInt();
            showAnimalSelected(selection, state);

        } while(selection < 1 || selection > state.animals.size());
    }

    public void showAnimalSelected(int selection, GameState state) {
        System.out.println("| You have selected: " + state.animals.get(selection - 1).getName());
        selectPlayOption(selection, state);
        System.out.println("| Your animal now has happiness: " + state.animals.get(selection - 1).getHappiness());


    }

    public void selectPlayOption(int selection, GameState state) {
        String animalPlayOptions = "|-----------------------------|\r\n" +
                                   "|   ~ ANIMAL PLAY OPTIONS ~   |\r\n" +
                                   "| 1. Speak to Animal          |\r\n" +
                                   "| 2. Give Animal Warmth       |\r\n" +
                                   "|-----------------------------|";

        switch (state.getOption(2, animalPlayOptions)) {
            case 1:
                state.animals.get(selection - 1).increaseHappiness(new Speech().getGeneralBoost());
                break;
            case 2:
                state.animals.get(selection - 1).increaseHappiness(new Warmth().getGeneralBoost());
                break;
        }

    }



    private void returnBack(GameState state) {
//        super.perform(state);
    }

}
