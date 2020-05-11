package item;

public abstract class AnimalFood extends Item {
	
	private int healthBoost;
	
	public AnimalFood(String name, double purchasingPrice, int generalBoost, int tempHealthBoost) {
		super(name, purchasingPrice, generalBoost);
		
		healthBoost = tempHealthBoost;
	}
	
	public int getHealthBoost() {
		return healthBoost;
	}
	
}
