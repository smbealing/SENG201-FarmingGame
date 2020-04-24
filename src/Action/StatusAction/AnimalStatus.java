package Action.StatusAction;

import java.util.Scanner;

import Action.Action;
import GameEnvironment.GameState;
import Animal.Animal;

public class AnimalStatus {
    protected Scanner s;

    public void perform(GameState state) {

        selectAnimal(state);

        returnBack(state);
    }

    public void selectAnimal(GameState state) {
        s = new Scanner(System.in);
        int selection = 0;
        String animalOptions = "";

        for (int i = 1; i <= state.animals.size(); i ++) {
            animalOptions = animalOptions.concat(i + ". " + state.animals.get(i-1).getName() + "\n");
        }

        System.out.println("Select an animal:");

        do {
            System.out.println(animalOptions);
            selection = s.nextInt();
            showAnimalStatus(selection, state);

        } while(selection < 1 || selection > state.animals.size());
    }

    public void showAnimalStatus(int selection, GameState state) {
        System.out.println("You have selected: " + state.animals.get(selection).getName());
        System.out.println("Health: " + state.animals.get(selection).getHealth());
        System.out.println("Happiness: " + state.animals.get(selection).getHappiness());
    }

    private void returnBack(GameState state) {
//        super.perform(state);
    }
}
