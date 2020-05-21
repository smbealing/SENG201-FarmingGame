package item;
public class CropItem extends Item {
	
	/**
	 * The boost in crop growth level provided by the crop item.
	 */
	private int growthBoost;
	
	
	/**
	 * The constructor method for CropItem.
	 * @param name  the item's name (String)
	 * @param purchasingPrice  the item's purchasing price (double)
	 * @param generalBoost  the general boost provided by the item (integer)
	 * @param tempGrowthBoost  the growth boost provided by the item (integer)
	 */
	public CropItem(String name, double purchasingPrice, int generalBoost, int tempGrowthBoost) {
		super(name, purchasingPrice, generalBoost);
		
		growthBoost = tempGrowthBoost;
	}
	
	
	/**
	 * @return the crop item's growth boost.
	 */
	public int getGrowthBoost() {
		return growthBoost;
	}

}
