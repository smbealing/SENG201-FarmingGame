public abstract class Item {
	
	private String name;
	private double purchasingPrice;
	private int generalBoost;
	
	public Item(String tempName, double tempPurchasingPrice, int tempGeneralBoost) {
		name = tempName;
		purchasingPrice = tempPurchasingPrice;
		generalBoost = tempGeneralBoost;
	}
	
	public String getName() {
		return name;
	}

	public double getPurchasingPrice() {
		return purchasingPrice;
	}
	
	public int getGeneralBoost() {
		return generalBoost;
	}

}
