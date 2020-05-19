package animal;
public abstract class Animal {
	
	/**
	 * The name of the animal.
	 */
	private String name;
	
	/**
	 * The purchasing price of the animal.
	 */
	private double purchasingPrice;
	
	/**
	 * The daily income gained from having the animal.
	 */
	private double income;
	
	/**
	 * The current health level the animal.
	 */
	private int health;
	
	/**
	 * The current happiness level the animal.
	 */
	private int happiness;
	
	/**
	 * The maximum happiness level the animal.
	 */
	private final int maxHappiness;
	
	/**
	 * The maximum health level the animal.
	 */
	private final int maxHealth;
	
	
	/**
	 * The constructor method for an Animal.
	 * Takes animal name (String), purchasing price (double), daily income (double), 
	 * health level (integer) and happiness level (integer) as parameters.
	 */
	public Animal(String tempName, double tempPurchasingPrice, double tempIncome, int tempHealth, int tempHappiness) {
		name = tempName;
		purchasingPrice = tempPurchasingPrice;
		income = tempIncome;
		health = tempHealth;
		happiness = tempHappiness;
		
		maxHappiness = tempHappiness;
		maxHealth = tempHealth;
	}
	
	/**
	 * Getter for animal's name.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Getter for animal's purchasing price.
	 */
	public double getPurchasingPrice() {
		return purchasingPrice;
	}
	
	/**
	 * Getter for daily income gained from having the animal.
	 */
	public double getIncome() {
		return income;
	}
	
	/**
	 * Getter for animal's current health level.
	 */
	public int getHealth() {
		return health;
	}
	
	/**
	 * Getter for animal's maximum health level.
	 */
	public int getMaxHealth() {
		return maxHealth;
	}
	
	/**
	 * Getter for animal's current happiness level.
	 */
	public int getHappiness() {
		return happiness;
	}
	
	/**
	 * Getter for animal's maximum happiness level.
	 */
	public int getMaxHappiness() {
		return maxHappiness;
	}
	
	/**
	 * Increase animal's current happiness level.
	 * Takes an amount (integer) as a parameter.
	 */
	public void increaseHappiness(int amount) {
		happiness += amount;
		happiness += 30;
		
		if (happiness > maxHappiness) {happiness = maxHappiness; }
	}
	
	/**
	 * Increase animal's current health level.
	 * Takes an amount (integer) as a parameter.
	 */
	public void increaseHealth(int amount) {
		health += amount;
		
		if (health > maxHealth) { health = maxHealth; }
	}
	
	/**
	 * Decreases animal's current happiness level by 20.
	 */
	public void decreaseHappiness() {
		happiness -= 20;
		
		if (happiness < 0) { happiness = 0; }
	}
	
	/**
	 * Decreases animal's current health level by 20.
	 * Also decreases animal's current happiness level if animal is very unhealthy.
	 */
	public void decreaseHealth() {
		health -= 20;
		
		if (health < 0) {
			decreaseHappiness();
			decreaseHappiness();
			
			health = 0;
		}
	}
	
}
