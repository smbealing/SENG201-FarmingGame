package item;

public abstract class GenericItem extends Item {
	
	
	/**
	 * The constructor method for GenericItem.
	 * @param name  the item's name (String)
	 * @param purchasingPrice  the item's purchasing price (double)
	 * @param generalBoost  the general boost provided by the item (integer)
	 */
	public GenericItem(String name, double purchasingPrice, int generalBoost) {
		super(name, purchasingPrice, generalBoost);
	}

}
