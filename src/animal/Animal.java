package animal;
public abstract class Animal {
	
	private String name;
	private double purchasingPrice;
	private double income;
	private int health;
	private int happiness;
	private final int maxHappiness;
	private final int maxHealth;
	
	public Animal(String tempName, double tempPurchasingPrice, double tempIncome, int tempHealth, int tempHappiness) {
		name = tempName;
		purchasingPrice = tempPurchasingPrice;
		income = tempIncome;
		health = tempHealth;
		happiness = tempHappiness;
		
		maxHappiness = tempHappiness;
		maxHealth = tempHealth;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPurchasingPrice() {
		return purchasingPrice;
	}
	
	public double getIncome() {
		return income;
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getMaxHealth() {
		return maxHealth;
	}
	
	public int getHappiness() {
		return happiness;
	}
	
	public int getMaxHappiness() {
		return maxHappiness;
	}

	public void increaseHappiness(int amount) {
		happiness += amount;
		happiness += 30;
		
		if (happiness > maxHappiness) {happiness = maxHappiness; }
	}
	
	public void increaseHealth(int amount) {
		health += amount;
		
		if (health > maxHealth) { health = maxHealth; }
	}
	
	public void decreaseHappiness() {
		happiness -= 20;
		
		if (happiness < 0) { happiness = 0; }
	}
	
	public void decreaseHealth() {
		health -= 20;
		
		if (health < 0) {
			decreaseHappiness();
			decreaseHappiness();
			
			health = 0;
		}
	}
	
}
