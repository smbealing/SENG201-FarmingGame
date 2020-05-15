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
	
	public Farm farm;
	public Farmer farmer;
	public GameEnvironment main;
	public ArrayList<Crop> crops;
	public ArrayList<Animal> animals;
	public ArrayList<CropItem> cropItems;
	public ArrayList<AnimalFood> animalFood;
	public ArrayList<GenericItem> items;

	public int totalDays;
	public int currentDay = 1;
	
	public double totalMoney = 50.00;

	
	private Scanner s;
	
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
