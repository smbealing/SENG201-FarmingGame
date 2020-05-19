package farm;
public class Farmer {

	/**
	 * The name of the farmer.
	 */
    private String name;
    
    /**
	 * The age of the farmer.
	 */
    private int age;
    
    /**
	 * The amount of actions the farmer has left for the day.
	 */
    private int actionCount = 2;

    /**
	 * Setter for farmer's name.
	 * Takes name (String) as a parameter.
	 */
    public void setName(String tempName) {
        name = tempName;
    }

    /**
	 * Setter for farmer's age.
	 * Takes age (integer) as a parameter.
	 */
    public void setAge(int tempAge) {
        age = tempAge;
    }

    /**
	 * Getter for farmer's name.
	 */
    public String getName() {
        return name;
    }

    /**
	 * Getter for farmer's age.
	 */
    public int getAge() {
        return age;
    }

    /**
	 * Getter for amount of actions the farmer has left for the day.
	 */
    public int getActionCount() {
        return actionCount;
    }
    
    /**
	 * Resets the amount of actions the farmer has left for the day.
	 */
    public void setActionCount() {
    	actionCount = 2;
    }

    /**
	 * Reduces the amount of actions the farmer has left for the day by 1.
	 */
    public void reduceActionCount() {
        actionCount -= 1;
        
        if (actionCount < 0) {
        	actionCount = 0;
        }
    }
}
