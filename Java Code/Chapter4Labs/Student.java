// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student’s info.
// ****************************************************************
import java.util.Scanner;
import java.lang.Double;

public class Student
{
    //declare instance data
    private Scanner scan = new Scanner(System.in);
    private double score1, score2;
    private String name;

    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
      name = studentName;
    } // end of constructor

    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
      System.out.println("Enter " + name + "'s score for test 1: ");
      score1 = scan.nextInt();

      System.out.println("Enter " + name + "'s score for test 2: ");
      score2 = scan.nextInt();
    } // end of inputGrades

    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------

    //add header for getAverage
    public double getAverage()
    {
      return ((score1 + score2) / 2);
    } // end of getAverage

    //-----------------------------------------------
    //getName: print the student's name
    //-----------------------------------------------

    //add header for printName
    public String getName()
    {
      return name;
    } // end of getName
} // end of class
