// ****************************************************************
//   Person.java
//
//   A simple class representing a person.
// ***************************************************************
public class Person  {
    private String name;
    private int age;

    // ------------------------------------------------------------
    //  Sets up a Person object with the given name and age.
    // ------------------------------------------------------------
    public Person (String name, int age)  {
     	this.name = name;
     	this.age = age;
     } // end of Person

    // ------------------------------------------------------------
    //   Changes the name of the Person to the parameter newName.
    // ------------------------------------------------------------
    public void changeName(String newName)  {
         name = newName;
     } // end of changeName

    // -----------------------------------------------------------
    //   Changes the age of the Person to the parameter newAge.
    // -----------------------------------------------------------
    public void changeAge (int newAge)  {
         age = newAge;
    }

    // -----------------------------------------------------------
    //   Returns the person's name and age as a string.
    // -----------------------------------------------------------
    public String toString()  {
         return name + " - Age " + age;
    }
}
