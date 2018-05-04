// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.//
// ****************************************************************
public class DogTest{
     public static void main(String[] args)    {
          Labrador dog = new Labrador("Spike", "chocolate");
          System.out.println(dog.getName() + " says " + dog.speak());

          Labrador lab = new Labrador("Lab", "yellow");
          Yorkshire york = new Yorkshire("Yorkie");

          System.out.println("Yorkie\n\tName: " + york.getName() + "; Weight: null");
          System.out.println("Labrador\n\tName: " + lab.getName() + "; Weight: " + lab.avgBreedWeight());

          System.out.println("Yorkie average weight: " + york.avgBreedWeight() + " lbs");
          System.out.println("Labrador average weight: " + lab.avgBreedWeight() + " lbs");
     }
}
