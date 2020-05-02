package Action.StatusAction;

import java.util.Scanner;

import Action.Action;
import GameEnvironment.GameState;

public class AnimalStatus extends Action {
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
            animalOptions = animalOptions.concat("| " + i + ". " + state.animals.get(i-1).getName() + "\n");
        }
        
        if (animalOptions.length() == 0) {
        	System.out.println("|----------------------|\r\n" +
         		   			   "| You have no animals! |\r\n" +
         		   			   "|----------------------|");
        } else {

	        System.out.println("|-------------------|\r\n" +
	                           "| Select an animal. |\r\n" +
	                           "|-------------------|");
	
	        do {
	            System.out.println(animalOptions);
	            selection = s.nextInt();
	            
	
	        } while(selection < 1 || selection > state.animals.size());
	        
	        showAnimalStatus(selection, state);
	        
        }
    }

    public void showAnimalStatus(int selection, GameState state) {
        System.out.println("| You have selected: " + state.animals.get(selection - 1).getName());
        System.out.println("| Health: " + state.animals.get(selection - 1).getHealth() + "/" + state.animals.get(selection - 1).getMaxHealth());
        System.out.println("| Happiness: " + state.animals.get(selection - 1).getHappiness() + "/" + state.animals.get(selection - 1).getMaxHappiness());
    }
}
