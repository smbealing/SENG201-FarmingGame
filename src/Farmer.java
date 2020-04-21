public class Farmer {

    private String name;
    private int age;
    private int actionCount = 2;

    public Farmer(String tempName, int tempAge) {
        name = tempName;
        age = tempAge;
    }

    public void setName(String tempName) {
        name = tempName;
    }


    public void setAge(int tempAge) {
        age = tempAge;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Farmer adam = new Farmer("Adam",  21);
        System.out.println("Farmer: " + adam.getName() + ". Age: " + adam.getAge());
    }


}
