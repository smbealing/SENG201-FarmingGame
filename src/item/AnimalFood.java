package item;

public class AnimalFood extends Item {
	
	/**
	 * The boost in animal health provided by the animal food.
	 */
	private int healthBoost;
	
	
	/**
	 * The constructor method for AnimalFood.
	 * @param name  the food's name (String)
	 * @param purchasingPrice  the food's purchasing price (double)
	 * @param generalBoost  the happiness boost provided by the food (integer)
	 * @param tempHealthBoost  the health boost provided by the food (integer)
	 */
	public AnimalFood(String name, double purchasingPrice, int generalBoost, int tempHealthBoost) {
		super(name, purchasingPrice, generalBoost);
		
		healthBoost = tempHealthBoost;
	}
	
	
	/**
	 * Getter for animal food's health boost.
	 */
	public int getHealthBoost() {
		return healthBoost;
	}
	
}
