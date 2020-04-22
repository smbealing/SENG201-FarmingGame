public abstract class Animal {
	
	private String name;
	private double purchasingPrice;
	private int health;
	private int happiness;
	
	public Animal(String tempName, double tempPurchasingPrice, int tempHealth, int tempHappiness) {
		name = tempName;
		purchasingPrice = tempPurchasingPrice;
		health = tempHealth;
		happiness = tempHappiness;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPurchasingPrice() {
		return purchasingPrice;
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getHappiness() {
		return happiness;
	}
	
}
