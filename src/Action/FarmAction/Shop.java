package Action.FarmAction;

import Action.Action;
import GameEnvironment.GameState;

public class Shop extends Action {
	
	private String mainShopOptions = "|---------------------------|\r\n" +
									 "|     ~ SHOP OPTIONS ~      |\r\n" +
									 "| 1. Crops and Crop Items   |\r\n" +
									 "| 2. Animals + Animal Food  |\r\n" +
									 "| 3. Generic Items          |\r\n" +
									 "|---------------------------|";
	private String cropShopOptions = "|---------------------------|\r\n" +
			 						 "|     ~ CROP OPTIONS ~      |\r\n" +
			 						 "| 1. Banna                  |\r\n" +
			 						 "| 2. Corn                   |\r\n" +
			 						 "| 3. Dragon Fruit           |\r\n" +
			 						 "| 4. Potato                 |\r\n" +
			 						 "| 5. Tomato                 |\r\n" +
			 						 "| 6. Wheat                  |\r\n" +
			 						 "|   ~ CROP ITEM OPTIONS ~   |\r\n" +
			 						 "| 7. Fertiliser             |\r\n" +
			 						 "| 8. Pesticide              |\r\n" +
			 						 "|---------------------------|";
	private String animalShopOptions = "|---------------------------|\r\n" +
			 						   "|    ~ ANIMAL OPTIONS ~     |\r\n" +
			 						   "| 1. Cow                    |\r\n" +
			 						   "| 2. Horse                  |\r\n" +
			 						   "| 3. Sheep                  |\r\n" +
			 						   "|  ~ ANIMAL FOOD OPTIONS ~  |\r\n" +
			 						   "| 4. Carrot                 |\r\n" +
			 						   "| 5. Grain                  |\r\n" +
			 						   "| 6. High Quality Grain     |\r\n" +
			 						   "|---------------------------|";
	private String genericShopOptions = "|---------------------------|\r\n" +
									 	"| ~ GENERIC ITEM OPTIONS ~  |\r\n" +
									 	"| 1. Water                  |\r\n" +
									 	"| 2. Heating                |\r\n" +
									 	"| 3. Steal Fence            |\r\n" +
									 	"|---------------------------|";
	
	public void perform(GameState state) {
		
		switch (state.getOption(4, mainShopOptions)) {
			case 1 : 
				switch (state.getOption(4, cropShopOptions)) {
					case 1 : 
						
						break;
					case 2 :
						
						break;
					case 3 :
						
						break;
				}
				break;
			case 2 :
				switch (state.getOption(4, animalShopOptions)) {
					case 1 : 
						
						break;
					case 2 :
						
						break;
					case 3 :
						
						break;
				}
			break;
			case 3 :
				switch (state.getOption(4, genericShopOptions)) {
					case 1 : 
						
						break;
					case 2 :
						
						break;
					case 3 :
						
						break;
				}
				break;
		}
	}
}
