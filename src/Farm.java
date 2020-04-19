import java.util.ArrayList;

public class Farm {

    private String name;
    public String type;
    private Farmer farmer;
    private int days;
    private double moneyAvailable = 20;
    private ArrayList<Crop> crops;
    private ArrayList<Animal> animals;

    public Farm(String tempName, Farmer tempFarmer) {
        name = tempName;
        farmer = tempFarmer;
        crops = new ArrayList<Crop>();
        animals = new ArrayList<Animal>();
    }

    public void setName(String tempName) {
        name = tempName;
    }

    public String getName() {
        return name;
    }

    public void setType(String tempType) {
        type = tempType;
    }

    public void setDays(int tempDays) {
        days = tempDays;
    }

    public int getDays() {
        return days;
    }

    public void addCrop(Crop crop) {
        crops.add(crop);
    }


    public void addAnimal(Animal animal) {
        animals.add(animal);
    }


    public static void main(String[] args) {
        Farmer andrew = new Farmer("Andrew", "Corn grower", 25);
        Farm myFarm = new Farm("My Farm", andrew);
        myFarm.addCrop(new Corn());
        System.out.println(myFarm.crops.get(0));

    }
}
