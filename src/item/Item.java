package item;
public abstract class Item {
	
	
	/**
	 * The item's name.
	 */
	private String name;
	
	/**
	 * The item's purchasing price.
	 */
	private double purchasingPrice;
	
	/**
	 * The general boost provided by the item.
	 */
	private int generalBoost;
	
	
	/**
	 * The constructor method for Item.
	 * @param name  the item's name (String)
	 * @param purchasingPrice  the item's purchasing price (double)
	 * @param generalBoost  the general boost provided by the item (integer)
	 */
	public Item(String tempName, double tempPurchasingPrice, int tempGeneralBoost) {
		name = tempName;
		purchasingPrice = tempPurchasingPrice;
		generalBoost = tempGeneralBoost;
	}
	
	
	/**
	 * Getter for item's name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Getter for item's purchasing price.
	 */
	public double getPurchasingPrice() {
		return purchasingPrice;
	}
	
	
	/**
	 * Getter for item's general boost.
	 */
	public int getGeneralBoost() {
		return generalBoost;
	}

}
