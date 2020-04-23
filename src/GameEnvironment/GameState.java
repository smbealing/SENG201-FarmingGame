package GameEnvironment;

import java.util.ArrayList;

import Animal.Animal;
import Crop.Crop;
import Farm.Farm;
import Farm.Farmer;
import Item.AnimalFood;
import Item.CropItem;
import Item.GenericItem;

public class GameState {
	
	public Farm farm;
	public Farmer farmer;
	public ArrayList<Crop> crops;
	public ArrayList<Animal> animals;
	public ArrayList<CropItem> cropItems;
	public ArrayList<AnimalFood> animalFood;
	public ArrayList<GenericItem> items;

	public int totalDays;
	public int currentDay;
	
	public double totalMoney = 50.00;
	
	public GameState(int tempTotalDays, Farmer tempFarmer, Farm tempFarm) {
		totalDays = tempTotalDays;
		currentDay = 1;
		
		farmer = tempFarmer;
		farm = tempFarm;
		crops = new ArrayList<Crop>();
		animals = new ArrayList<Animal>();
		cropItems = new ArrayList<CropItem>();
		animalFood = new ArrayList<AnimalFood>();
		items = new ArrayList<GenericItem>();
	}
	
}
