package Action;

import java.util.Scanner;

public class FarmerAction {
    protected Scanner s;
    private String farmerActions = 	"1. Tend to Crops\n" +
            "2. Feed Animals\n" +
            "3. Play With Animals\n" +
            "4. Harvest Crops\n" +
            "5. Tend To Farm Land";

    public void perform(GameState state) {
        selectFarmerAction(state);

    }

    private void selectFarmerAction(GameState state) {
        s = new Scanner(System.in);
        int selection = 0;

        do {
            System.out.println(farmerActions);
            selection = s.nextInt();
            selectAction(selection, state);

        } while(selection < 1 || selection > 5);


    }

    private void selectAction(int selection, GameState state) {
        switch (selection) {
            case 1:
                new TendToCrop().perform(state);
                break;
            case 2:
                new FeedAnimal().perform(state);
                break;
            case 3:
                new PlayWithAnimal().perform(state);
                break;
            case 4:
                new HarvestCrop().perform(state);
                break;
            case 5:
                new TendToFarmLand().perform(state);
                break;
        }
    }


}
