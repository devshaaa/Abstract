package AbstractPet;

public class Main {

    public static void main(String[] args) {
        // Creating instances of Dog and Cat
        Fish myFish = new Fish();
        Tiger myTiger = new Tiger();

        // Displaying the colors of the pets
        System.out.println("Fish color: " + myFish.color());
        System.out.println("Tiger color: " + myTiger.color());
    }
}
