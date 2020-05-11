package item;
public abstract class CropItem extends Item {
	
	private int growthBoost;
	
	public CropItem(String name, double purchasingPrice, int generalBoost, int tempGrowthBoost) {
		super(name, purchasingPrice, generalBoost);
		
		growthBoost = tempGrowthBoost;
	}
	
	public int getGrowthBoost() {
		return growthBoost;
	}

}
