package action.farmAction;

import gameEnvironment.GameState;
import item.AnimalFood;
import item.Carrot;
import item.CropItem;
import item.Fertiliser;
import item.Grain;
import item.HighQualityGrain;
import item.Pesticide;
import action.Action;
import animal.Animal;
import animal.Cow;
import animal.Horse;
import animal.Sheep;
import crop.Banana;
import crop.Corn;
import crop.Crop;
import crop.DragonFruit;
import crop.Potato;
import crop.Tomato;
import crop.Wheat;

public class Shop extends Action {
	
	private Crop crop;
	private Animal animal;
	private CropItem item;
	private AnimalFood animalFood;
	
	private String mainShopOptions = "|---------------------------|\r\n" +
									 "|     ~ SHOP OPTIONS ~      |\r\n" +
									 "| 1. Crops + Crop Items     |\r\n" +
									 "| 2. Animals + Animal Food  |\r\n" +
									 "|---------------------------|";
	private String cropShopOptions = "|---------------------------|\r\n" +
			 						 "|     ~ CROP OPTIONS ~      |\r\n" +
			 						 "| 1. Banana          $1.00  |\r\n" +
			 						 "| 2. Corn            $0.50  |\r\n" +
			 						 "| 3. Dragon Fruit    $2.00  |\r\n" +
			 						 "| 4. Potato          $0.50  |\r\n" +
			 						 "| 5. Tomato          $0.50  |\r\n" +
			 						 "| 6. Wheat           $0.20  |\r\n" +
			 						 "|   ~ CROP ITEM OPTIONS ~   |\r\n" +
			 						 "| 7. Fertiliser      $31.60 |\r\n" +
			 						 "| 8. Pesticide       $20.00 |\r\n" +
			 						 "|---------------------------|";
	private String animalShopOptions = "|------------------------------|\r\n" +
			 						   "|      ~ ANIMAL OPTIONS ~      |\r\n" +
			 						   "| 1. Cow           $40.00      |\r\n" +
			 						   "| 2. Horse         $89.99      |\r\n" +
			 						   "| 3. Sheep         $20.00      |\r\n" +
			 						   "|    ~ ANIMAL FOOD OPTIONS ~   |\r\n" +
			 						   "| 4. Carrot        $5.00       |\r\n" +
			 						   "| 5. Grain         $24.99      |\r\n" +
			 						   "| 6. High Quality Grain $49.99 |\r\n" +
			 						   "|------------------------------|";
	
	public void perform(GameState state) {
		
		switch (state.getOption(2, mainShopOptions)) {
		case 1 : 
			switch (state.getOption(8, cropShopOptions)) {
			case 1 : 
				crop = new Banana();
				purchasingCrop(state, crop);
				break;
			case 2 :
				crop = new Corn();
				purchasingCrop(state, crop);
				break;
			case 3 :
				crop = new DragonFruit();
				purchasingCrop(state, crop);
				break;
			case 4 :
				crop = new Potato();
				purchasingCrop(state, crop);
				break;
			case 5 :
				crop = new Tomato();
				purchasingCrop(state, crop);
				break;
			case 6 :
				crop = new Wheat();
				purchasingCrop(state, crop);
				break;
			case 7 :
				item = new Fertiliser();
				purchasingCropItem(state, item);
				break;
			case 8 :
				item = new Pesticide();
				purchasingCropItem(state, item);
				break;
			}
			break;
		case 2 :
			switch (state.getOption(6, animalShopOptions)) {
			case 1 : 
				animal = new Cow();
				purchasingAnimal(state, animal);
				break;
			case 2 :
				animal = new Horse();
				purchasingAnimal(state, animal);
				break;
			case 3 :
				animal = new Sheep();
				purchasingAnimal(state, animal);
				break;
			case 4 :
				animalFood = new Carrot();
				purchasingAnimalFood(state, animalFood);
				break;
			case 5 :
				animalFood = new Grain();
				purchasingAnimalFood(state, animalFood);
				break;
			case 6 :
				animalFood = new HighQualityGrain();
				purchasingAnimalFood(state, animalFood);
				break;
			}
			break;
		}
	}
	
	private boolean affordable(double totalMoney, double cost) {
		if ((totalMoney - cost) < 0.00) {
			System.out.println("|-------------------------------------------------|\r\n" +
					   		   "| Oh no! You aren't able to afford this purchase! |\r\n" +
					   		   "|-------------------------------------------------|");
			return false;
		}
		
		System.out.println("|------------------------------|\r\n" +
		   		   		   "| Thank you for your purchase! |\r\n" +
		   		   		   "|------------------------------|");
		return true;
	}
	
	private void purchasingCrop(GameState state, Crop crop) {
		if (affordable(state.totalMoney, crop.getPurchasingPrice())) {
			state.totalMoney -= crop.getPurchasingPrice();
			state.crops.add(crop);
		}
	}
	
	private void purchasingAnimal(GameState state, Animal animal) {
		boolean enoughSpace = true;
		if (state.animals.size() == state.farm.getMaxAnimalCount()) {
			enoughSpace = false;
			
			System.out.println("|---------------------------------------------------------------|\r\n" +
			   		   		   "| Oh no! Your farm does not have enough space for more animals! |\r\n" +
			   		           "|---------------------------------------------------------------|");
		}
			
		if (affordable(state.totalMoney, animal.getPurchasingPrice()) && enoughSpace) {
			state.totalMoney -= animal.getPurchasingPrice();
			state.animals.add(animal);
		}
	}
	
	private void purchasingCropItem(GameState state, CropItem item) {
		if (affordable(state.totalMoney, item.getPurchasingPrice())) {
			state.totalMoney -= item.getPurchasingPrice();
			state.cropItems.add(item);
		}
	}
	
	private void purchasingAnimalFood(GameState state, AnimalFood animalFood) {
		if (affordable(state.totalMoney, animalFood.getPurchasingPrice())) {
			state.totalMoney -= animalFood.getPurchasingPrice();
			state.animalFood.add(animalFood);
		}
	}
	
}
