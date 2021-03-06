package action.statusAction;

import java.util.Scanner;

import gameEnvironment.GameState;
import action.Action;

public class CropStatus extends Action {
	/**
	 * Declare scanner for player input.
	 */
    protected Scanner s;

    /**
	 * Performs the crop status action. 
	 * Calls method for player to select a crop.
	 * @param state  the current GameState
	 */
    public void perform(GameState state) {

        selectCrop(state);

//        returnBack(state); // add back in for command lines
    }

    /**
	 * Prompts user to select a crop.
	 * Prints warning if player has no crops.
	 * @param state  the current GameState
	 */
    public void selectCrop(GameState state) {
        s = new Scanner(System.in);
        int selection = 0;
        String cropOptions = "";

        for (int i = 1; i <= state.crops.size(); i ++) {
            cropOptions = cropOptions.concat("| " + i + ". " + state.crops.get(i-1).getName() + "\n");
        }
        
        if (cropOptions.length() == 0) {
        	System.out.println("|--------------------|\r\n" +
         		   			   "| You have no crops! |\r\n" +
         		   			   "|--------------------|");
        } else {

	        System.out.println("|----------------|\r\n" +
	                           "| Select a crop. |\r\n" +
	                           "|----------------|");
	
	        do {
	            System.out.println(cropOptions);
	            selection = s.nextInt();
	            
	
	        } while(selection < 1 || selection > state.crops.size());
	        
	        showCropStatus(selection, state);
	        
        }
    }

    /**
	 * Displays status information about selected crop.
	 * @param selection  the crop selection (integer)
	 * @param state  the current GameState
	 */
    public void showCropStatus(int selection, GameState state) {
        System.out.println("| You have selected: " + state.crops.get(selection - 1).getName());
        if (state.crops.get(selection - 1).getPlanted()) {
        	System.out.println("| This crop has thirst level: " + state.crops.get(selection - 1).getThirstLevel() + "/" + state.crops.get(selection - 1).getMaxThirstLevel());
            System.out.println("| It has grown for " + state.crops.get(selection - 1).getCurrentGrowthLevel() + " day(s).");
            int days_left = state.crops.get(selection - 1).getDaysUntilHarvest() - state.crops.get(selection - 1).getCurrentGrowthLevel();
            System.out.println("| Day(s) left until harvest: " + days_left);
        } else {
            System.out.println("| This crop has not been planted yet.");
        }

    }
}
