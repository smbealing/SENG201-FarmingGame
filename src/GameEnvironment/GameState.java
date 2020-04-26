package GameEnvironment;

import java.util.ArrayList;
import java.util.Scanner;

import Animal.Animal;
import Crop.Crop;
import Farm.Farm;
import Farm.Farmer;
import Item.AnimalFood;
import Item.CropItem;
import Item.GenericItem;
import Item.Speech;
import Item.Warmth;
import Item.Water;

public class GameState {
	
	public Farm farm;
	public Farmer farmer;
	public ArrayList<Crop> crops;
	public ArrayList<Animal> animals;
	public ArrayList<CropItem> cropItems;
	public ArrayList<AnimalFood> animalFood;
	public ArrayList<GenericItem> items;

	public int totalDays;
	public int currentDay = 1;
	
	public double totalMoney = 50.00;
	
	private Scanner s;
	
	public GameState(int tempTotalDays, Farm tempFarm) {
		totalDays = tempTotalDays;
		currentDay = 1;
		
		farm = tempFarm;
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
	
	public int getOption(int num, String options) {
		s = new Scanner(System.in);
		int selection = 0;
		
		do {
			System.out.println(options);
			selection = s.nextInt();
		} while (selection < 0 || selection > num);
		
		return selection;
	}
	
}
