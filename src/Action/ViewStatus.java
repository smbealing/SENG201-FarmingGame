package Action;

import java.util.Scanner;

import GameEnvironment.GameState;

public class ViewStatus extends Action {
    protected Scanner s;
    private String statusOptions = 	"1. Crop Status\n" +
            "2. Animal Status\n" +
            "3. Farm Status\n" +
            "4. Farmer Status";

    public void perform(GameState state) {
        selectStatusOption(state);

    }

    private void selectStatusOption(GameState state) {
        s = new Scanner(System.in);
        int selection = 0;

        do {
            System.out.println(statusOptions);
            selection = s.nextInt();
            selectStatus(selection, state);

        } while(selection < 1 || selection > 4);


    }

    private void selectStatus(int selection, GameState state) {
        switch (selection) {
            case 1:
                new CropStatus().perform(state);
                break;
            case 2:
                new AnimalStatus().perform(state);
                break;
            case 3:
                new FarmStatus().perform(state);
                break;
            case 4:
                new FarmerStatus().perform(state);
                break;
        }
    }

}
