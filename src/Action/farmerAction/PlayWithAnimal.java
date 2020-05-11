package action.farmerAction;

import java.util.Scanner;

import gameEnvironment.GameState;
import item.Speech;
import item.Warmth;
import action.Action;

public class PlayWithAnimal extends Action {
    protected Scanner s;

    public void perform(GameState state) {
        if (checkFarmerAction(state)) {
            state.farmer.reduceActionCount();
            selectAnimal(state);

        }

//        returnBack(state); // add back in for command lines
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
	        
	        showAnimalSelected(selection, state);
        }
    }

    public void showAnimalSelected(int selection, GameState state) {
        System.out.println("| You have selected: " + state.animals.get(selection - 1).getName());
        selectPlayOption(selection, state);
        System.out.println("| Your animal now has happiness: " + state.animals.get(selection - 1).getHappiness());


    }

    public void selectPlayOption(int selection, GameState state) {
        String animalPlayOptions = "|-------------------------------|\r\n" +
                                   "|    ~ ANIMAL PLAY OPTIONS ~    |\r\n" +
                                   "| 1. Speak to Animal            |\r\n" +
                                   "| 2. Give Animal Warmth  $20.00 |\r\n" +
                                   "|-------------------------------|";

        switch (state.getOption(2, animalPlayOptions)) {
            case 1:
                state.animals.get(selection - 1).increaseHappiness(new Speech().getGeneralBoost());
                break;
            case 2:
                useHeating(state, new Warmth(), selection-1);
                break;
        }
    }
    
    private void useHeating(GameState state, Warmth item, int selection) {
    	if ((state.totalMoney - item.getPurchasingPrice()) > 0.00) {
    		
			state.totalMoney -= item.getPurchasingPrice();
			state.animals.get(selection).increaseHappiness(new Warmth().getGeneralBoost());
			
		} else {
			System.out.println("|-----------------------------------------------------------|\r\n" +
			   		   		   "| Oh no! You aren't able to afford heating for the animals! |\r\n" +
			   		   		   "|-----------------------------------------------------------|");
		}
    }

}
