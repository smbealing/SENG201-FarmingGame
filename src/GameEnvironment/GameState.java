package gameEnvironment;

import java.util.ArrayList;
import java.util.Scanner;

import item.AnimalFood;
import item.CropItem;
import item.GenericItem;
import item.Speech;
import item.Warmth;
import item.Water;
import animal.Animal;
import crop.Crop;
import farm.Farm;
import farm.Farmer;

public class GameState {
	
	/**
	 * The game's farm.
	 */
	public Farm farm;
	
	/**
	 * The game's farmer.
	 */
	public Farmer farmer;
	
	/**
	 * The game's GameEnvironment.
	 */
	public GameEnvironment main;
	
	/**
	 * The list of crops the player has.
	 */
	public ArrayList<Crop> crops;
	
	/**
	 * The list of animals the player has.
	 */
	public ArrayList<Animal> animals;
	
	/**
	 * The list of crop items the player has.
	 */
	public ArrayList<CropItem> cropItems;
	
	/**
	 * The list of animal food items the player has.
	 */
	public ArrayList<AnimalFood> animalFood;
	
	/**
	 * The list of generic items the player has.
	 */
	public ArrayList<GenericItem> items;
	
	/**
	 * TODO: What's this?
	 */
	public boolean nextDay = false; 

	/**
	 * The game's duration.
	 */
	public int totalDays;
	
	/**
	 * The game's current day.
	 */
	public int currentDay = 1;
	
	
	/**
	 * The amount of money the player has available.
	 */
	public double totalMoney = 50.00;

	/**
	 * Declare scanner for player input.
	 */
	private Scanner s;
	
	
	/**
	 * The constructor method for a GameState.
	 * @param tempTotalDays  game duration (integer)
	 * @param tempFarm  the game's farm (Farm)
	 */
	public GameState(int tempTotalDays, Farm tempFarm) { // add GameEnvironment tempMain for command lines
		totalDays = tempTotalDays;
		currentDay = 1;
		
		farm = tempFarm;
//		main = tempMain; // add back in for command lines
		farmer = farm.getFarmer();
		crops = new ArrayList<Crop>();
		animals = new ArrayList<Animal>();
		cropItems = new ArrayList<CropItem>();
		animalFood = new ArrayList<AnimalFood>();
		items = new ArrayList<GenericItem>();
		items.add(new Water());
		items.add(new Warmth());
		items.add(new Speech());
	}
	
	
	/**
	 * Uses Scanner to handle a player's selection.
	 * @param num  the selection number (integer)
	 * @param options  the options being selected from (String)
	 */
	public int getOption(int num, String options) {
		s = new Scanner(System.in);
		int selection = 0;
		
		do {
			System.out.println(options);
			selection = s.nextInt();
		} while (selection < 1 || selection > num);
		
		return selection;
	}
	
}
