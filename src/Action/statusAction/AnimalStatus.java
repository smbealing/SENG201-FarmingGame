package action.statusAction;

import java.util.Scanner;

import gameEnvironment.GameState;
import action.Action;

public class AnimalStatus extends Action {
	/**
	 * Declare scanner for player input.
	 */
    protected Scanner s;

    
    /**
	 * Performs the animal status action. 
	 * Calls method for player to select an animal.
	 * Takes the current GameState as a parameter.
	 */
    public void perform(GameState state) {

        selectAnimal(state);

//        returnBack(state); // add back in for command lines
    }

    /**
	 * Prompts player to select an animal.
	 * Prints a warning if player has no animals.
	 * Takes the current GameState as a parameter.
	 */
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

    /**
	 * Displays status information about selected animal.
	 * Takes the animal selection (integer) and the current GameState as parameters.
	 */
    public void showAnimalStatus(int selection, GameState state) {
        System.out.println("| You have selected: " + state.animals.get(selection - 1).getName());
        System.out.println("| Health: " + state.animals.get(selection - 1).getHealth() + "/" + state.animals.get(selection - 1).getMaxHealth());
        System.out.println("| Happiness: " + state.animals.get(selection - 1).getHappiness() + "/" + state.animals.get(selection - 1).getMaxHappiness());
    }
}
