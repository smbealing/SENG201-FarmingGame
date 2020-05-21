package item;
public class Item {
	
	
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
	 * @param tempName  the item's name (String)
	 * @param tempPurchasingPrice  the item's purchasing price (double)
	 * @param tempGeneralBoost  the general boost provided by the item (integer)
	 */
	public Item(String tempName, double tempPurchasingPrice, int tempGeneralBoost) {
		name = tempName;
		purchasingPrice = tempPurchasingPrice;
		generalBoost = tempGeneralBoost;
	}
	
	
	/**
	 * @return the item's name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the item's purchasing price.
	 */
	public double getPurchasingPrice() {
		return purchasingPrice;
	}
	
	
	/**
	 * @return the item's general boost.
	 */
	public int getGeneralBoost() {
		return generalBoost;
	}

}
