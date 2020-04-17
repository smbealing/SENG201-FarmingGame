public class Farmer {

    private String name;
    private String speciality;
    private int age;
    private int actionCount = 2;

    public Farmer(String tempName, String tempSpeciality, int tempAge) {
        name = tempName;
        speciality = tempSpeciality;
        age = tempAge;
    }

    public void setName(String tempName) {
        name = tempName;
    }

    public void setSpeciality(String tempSpeciality) {
        speciality = tempSpeciality;
    }

    public void setAge(int tempAge) {
        age = tempAge;
    }

    public String getName() {
        return name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Farmer adam = new Farmer("Adam", "Plant Whisperer", 21);
        System.out.println("Farmer: " + adam.getName() + ". Age: " + adam.getAge());
    }


}
