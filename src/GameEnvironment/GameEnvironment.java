package GameEnvironment;

import java.util.Scanner;

import Action.FarmAction.NextDay;
import Action.FarmAction.PlantCrop;
import Action.FarmAction.Shop;
import Action.FarmerAction.*;
import Farm.CityFarm;
import Farm.Farm;
import Farm.Farmer;
import Farm.HardcoreFarm;
import Farm.NormalFarm;
import Farm.TropicalFarm;
import Action.StatusAction.AnimalStatus;
import Action.StatusAction.FarmStatus;
import Action.StatusAction.FarmerStatus;
import Action.StatusAction.CropStatus;
import Animal.Animal;


public class GameEnvironment {
	
	private GameState state;
	private Farmer farmer;
	private Farm farm;
	private int totalDays = 0;
	private Scanner s;
	
	public String farmTitle = "|=|=|=| WELCOME TO FARMIZA |=|=|=|";
	public String farmImage = "                             +&-\r\n" + 
							  "                           _.-^-._    .--.\r\n" + 
							  "                        .-'   _   '-. |__|\r\n" + 
							  "                       /     |_|     \\|  |\r\n" + 
							  "                      /               \\  |\r\n" + 
							  "                     /|     _____     |\\ |\r\n" + 
							  "                      |    |==|==|    |  |\r\n" + 
							  "  |---|---|---|---|---|    |--|--|    |  |\r\n" + 
							  "  |---|---|---|---|---|    |==|==|    |  |\r\n" + 
							  " ^jgs^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^";
	public String fenceImage = "   ,   #                                                     _\r\n" + 
							   "  (\\\\_(^>                            _.                    >(')__,\r\n" + 
							   "  (_(__)           ||          _.||~~ {^--^}.-._._.---.__.-;(_~_/\r\n" + 
							   "     ||   (^..^)   ||  (\\(__)/)  ||   {6 6 }.')' (. )' ).-`  ||\r\n" + 
							   "   __||____(oo)____||___`(QQ)'___||___( v  )._('.) ( .' )____||__\r\n" + 
							   "   --||----\"- \"----||----)  (----||----`-.''(.' .( ' ) .)----||--\r\n" + 
							   "   __||__@(    )___||___(o  o)___||______#`(.'( . ( (',)_____||__\r\n" + 
							   "   --||----\"--\"----||----`--'----||-------'\\_.).(_.). )------||--\r\n" + 
							   "     ||            ||       `||~|||~~|\"\"||  `W W    W W      ||\r\n" + 
							   "   ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^";
	public String mainOptions = "|---------------------------|\r\n" +
								"|     ~ MAIN OPTIONS ~      |\r\n" +
							    "| 1. Shop                   |\r\n" +
							    "| 2. View Farm              |\r\n" +
							    "| 3. Check Status           |\r\n" +
							    "| 4. Advance to Next Day    |\r\n" +
							    "|---------------------------|";
	public String farmOptions = "|---------------------------|\r\n" +
								"|     ~ FARM OPTIONS ~      |\r\n" +
								"| 1. Tend To Farm Land      |\r\n" +
								"|     ~ CROP OPTIONS ~      |\r\n" +
		    					"| 2. Plant Crop             |\r\n" +
		    					"| 3. Tend To Crops          |\r\n" +
		    					"| 4. Harvest Crops          |\r\n" +
		    					"|    ~ ANIMAL OPTIONS ~     |\r\n" +
		    					"| 5. Feed Animals           |\r\n" +
		    					"| 6. Play With Animals      |\r\n" +
		    					"|---------------------------|\r\n";
	public String statusOptions = "|---------------------------|\r\n" +
								  "|    ~ STATUS OPTIONS ~     |\r\n" +
								  "| 1. Farmer Status          |\r\n" +
								  "| 2. Farm Status            |\r\n" +
								  "| 3. Crops Status           |\r\n" +
								  "| 4. Animals Status         |\r\n" +
								  "|---------------------------|";
	public String farmTypes = "|----------------------------------------------------------------|\r\n" +
	   		   				  "| Please enter a number of the type of farm you want to play on. |\r\n" +
	   		   				  "| 1. City Farm                                                   |\r\n" +
	   		   				  "| 2. Tropical Farm                                               |\r\n" +
	   		   				  "| 3. Normal Farm                                                 |\r\n" +
	   		   				  "| 4. Hard Core Farm                                              |\r\n" +
	   		   				  "|----------------------------------------------------------------|";
	
	public GameEnvironment() {
		System.out.println(farmTitle);
		
		setTotalDays();
		setFarmer();
		setFarm();
		
		state = new GameState(totalDays, farm);
		gameLoop();
	}
	
	public void gameLoop() {
		while (state.currentDay <= totalDays) {
			System.out.println(farmImage);
			
			switch (state.getOption(4, mainOptions)) {
				case 1:
					new Shop().perform(state);
					break;
				case 2:
					switch (state.getOption(6, farmOptions)) {
						case 1:
							System.out.println(fenceImage);
							new TendToFarmLand().perform(state);
							break;
						case 2:
							System.out.println(fenceImage);
							new PlantCrop().perform(state);
							break;
						case 3:
							System.out.println(fenceImage);
							new TendToCrop().perform(state);
							break;
						case 4:
							System.out.println(fenceImage);
							new HarvestCrop().perform(state);
							break;
						case 5:
							System.out.println(fenceImage);
							new FeedAnimal().perform(state);
							break;
						case 6:
							System.out.println(fenceImage);
							new PlayWithAnimal().perform(state);
							break;
					}
					break;
				case 3:
					switch (state.getOption(4, statusOptions)) {
						case 1:
							new FarmerStatus().perform(state);
							break;
						case 2:
							new FarmStatus().perform(state);
							break;
						case 3:
							new CropStatus().perform(state);
							break;
						case 4:
							new AnimalStatus().perform(state);
							break;
					}
					break;
				case 4:
					new NextDay().perform(state);
					break;
			}
		}
		if (state.currentDay > totalDays) {endGame();}
	}
	
	public void endGame() {
		System.out.println("Farmer: " + state.farmer.getName());
		System.out.println("Game duration " + totalDays + " days.");
		double profit = state.totalMoney - 50.00;
		System.out.println("Profit made: $" + profit);
		
		
		
		//Score = game duration + number of crops + (sum of animal statuses) + money earned
		int score = totalDays + state.crops.size() ;
		for (Animal animal : state.animals) {
			score += animal.getHappiness();
			score += animal.getHealth();
		}
		score += state.totalMoney;
		System.out.println("|------------------------------------|\r\n" +
				   		   "| Your final score is: " + score + " |\r\n" +
				   		   "|------------------------------------|");
		if (score < 50) {
			System.out.println("You've done a terrible job of looking after your farm.");
		} else if (score < 100) {
			System.out.println("Next time you should try to do a better job of looking after your farm.");
		} else if (score < 200) {
			System.out.println("Well done! You've looked after your farm well.");
		} else {
			System.out.println("Wow! You're a fantastic farmer");
		}
		
		
		System.out.println("|--------------------------------|\r\n" +
		   		   		   "| Thank you for playing Farmiza. |\r\n" +
		   		   		   "|--------------------------------|");
	}
	
	public void setTotalDays() {
		s = new Scanner(System.in);
		
		while (totalDays < 3 || totalDays > 10) {
			System.out.println("|-------------------------------------------------|\r\n" +
							   "| Please enter a number of days between 5 and 10. |\r\n" +
							   "|-------------------------------------------------|");
			totalDays = s.nextInt();
		}
		
		System.out.println("|-----------------------------------------|\r\n" + 
						   "| You have chosen " + totalDays + " days. |\r\n" +
						   "|-----------------------------------------|");
	}
	
	public void setFarmer() {
		farmer = new Farmer();
		s = new Scanner(System.in);
		
		System.out.println("|--------------------------------------|\r\n" +
				   		   "| Please give your farmer a firstname. |\r\n" +
				   		   "|--------------------------------------|");
		farmer.setName(s.next());
		
		System.out.println("|---------------------------------------------------|\r\n" +
		   		   		   "| How old is your farmer? Please enter his/her age. |\r\n" +
		   		   		   "|---------------------------------------------------|");
		farmer.setAge(s.nextInt());
	}
	
	public void setFarm() {
		s = new Scanner(System.in);
		int selection = 0;
		String name;
		
		System.out.println("|-------------------------------------------|\r\n" +
				   		   "| Please give your farm a name in one word. |\r\n" +
				   		   "|-------------------------------------------|");
		name = s.next();
		
		do {
			System.out.println(farmTypes);
			selection = s.nextInt();
		} while (selection < 1 || selection > 4);
		
		switch (selection) {
		case 1:
			farm = new CityFarm(name, farmer);
			break;
		case 2:
			farm = new TropicalFarm(name, farmer);
			break;
		case 3:
			farm = new NormalFarm(name, farmer);
			break;
		case 4:
			farm = new HardcoreFarm(name, farmer);
			break;
		}
	}

}
