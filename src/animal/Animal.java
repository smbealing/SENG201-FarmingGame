package animal;
public class Animal {
	
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
	 * @param tempName  animal name (String)
	 * @param tempPurchasingPrice  animal's purchasing price (double)
	 * @param tempIncome  animal's daily income (double)
	 * @param tempHealth  animal's health level (integer)
	 * @param tempHappiness  animal's happiness level (integer)
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
	 * @return the animal's name.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return the animal's purchasing price.
	 */
	public double getPurchasingPrice() {
		return purchasingPrice;
	}
	
	/**
	 * @return the daily income gained from having the animal.
	 */
	public double getIncome() {
		return income;
	}
	
	/**
	 * @return the animal's current health level.
	 */
	public int getHealth() {
		return health;
	}
	
	/**
	 * @return the animal's maximum health level.
	 */
	public int getMaxHealth() {
		return maxHealth;
	}
	
	/**
	 * @return the animal's current happiness level.
	 */
	public int getHappiness() {
		return happiness;
	}
	
	/**
	 * @return the animal's maximum happiness level.
	 */
	public int getMaxHappiness() {
		return maxHappiness;
	}
	
	/**
	 * Increase animal's current happiness level.
	 * @param amount  an amount to increase happiness by (integer)
	 */
	public void increaseHappiness(int amount) {
		happiness += amount;
		happiness += 30;
		
		if (happiness > maxHappiness) {happiness = maxHappiness; }
	}
	
	/**
	 * Increase animal's current health level.
	 * @param amount  an amount to increase health by (integer)
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
