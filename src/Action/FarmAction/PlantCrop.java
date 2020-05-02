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
                cropOptions = cropOptions.concat("| " + i + ". " + state.crops.get(i-1).getName() + "\n");
            }
        }
        
        if (cropOptions.length() == 0) {
        	System.out.println("|--------------------------------------|\r\n" +
                    		   "| All of your crops have been planted! |\r\n" +
                    		   "|--------------------------------------|");
        } else {

	        System.out.println("|-------------------------|\r\n" +
	                           "| Select a crop to plant. |\r\n" +
	                           "|-------------------------|");
	
	        do {
	            System.out.println(cropOptions);
	            selection = s.nextInt();
	       
	
	        } while(selection < 1 || selection > state.crops.size());
	        
	        plantCrop(selection, state);
	        
        }
    }

    public void plantCrop(int selection, GameState state) {
        state.crops.get(selection - 1).setPlanted();
        System.out.println("| Your " + state.crops.get(selection - 1).getName() + " has been planted.");
    }
}
