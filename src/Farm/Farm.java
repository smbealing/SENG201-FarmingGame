package Farm;
import java.util.ArrayList;

import Animal.Animal;
import Crop.Crop;

public abstract class Farm {

    private String name;
    private String type;
    private Farmer farmer;
    private double moneyAvailable;
    private ArrayList<Crop> crops;
    private ArrayList<Animal> animals;

    public Farm(String tempName, Farmer tempFarmer, String tempType) {
        name = tempName;
        farmer = tempFarmer;
        type = tempType;
        crops = new ArrayList<Crop>();
        animals = new ArrayList<Animal>();
    }

    public void setName(String tempName) {
        name = tempName;
    }

    public String getName() {
        return name;
    }
    
    public String getType() {
    	return type;
    }
    
    public Farmer getFarmer() {
    	return farmer;
    }
    
    public double getMoneyAvailable() {
    	return moneyAvailable;
    }

    public void addCrop(Crop crop) {
        crops.add(crop);
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }


}
