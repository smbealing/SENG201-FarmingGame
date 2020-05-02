package Action.StatusAction;

import java.util.Scanner;

import Action.Action;
import GameEnvironment.GameState;

public class CropStatus extends Action {
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
