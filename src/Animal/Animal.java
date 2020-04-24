package Animal;
public abstract class Animal {
	
	private String name;
	private double purchasingPrice;
	private double income;
	private int health;
	private int happiness;
	
	public int maxHappiness;
	
	public Animal(String tempName, double tempPurchasingPrice, double tempIncome, int tempHealth, int tempHappiness) {
		name = tempName;
		purchasingPrice = tempPurchasingPrice;
		income = tempIncome;
		health = tempHealth;
		happiness = tempHappiness;
		
		maxHappiness = tempHappiness;
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
	
	public void decreaseHappiness() {
		happiness -= 20;
		
		if (happiness < 0) {happiness = 0;}
	}
	
	public void decreaseHeath() {
		health -= 20;
		
		if (health < 0) {
			decreaseHappiness();
			decreaseHappiness();
			
			happiness = 0;
		}
	}
	
}
