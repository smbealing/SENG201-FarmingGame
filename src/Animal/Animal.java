package Animal;
public abstract class Animal {
	
	private String name;
	private double purchasingPrice;
	private double income;
	private int health;
	private int happiness;
	
	public Animal(String tempName, double tempPurchasingPrice, double tempIncome, int tempHealth, int tempHappiness) {
		name = tempName;
		purchasingPrice = tempPurchasingPrice;
		income = tempIncome;
		health = tempHealth;
		happiness = tempHappiness;
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
	
	public int getHappiness() {
		return happiness;
	}

	public void increaseHappiness(int amount) {
		happiness += amount;
	}
	
}
