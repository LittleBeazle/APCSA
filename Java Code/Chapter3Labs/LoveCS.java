import java.util.Scanner;

// ****************************************************************
//   LoveCS.java
//
//   Use a while loop to print many messages declaring your
//   passion for computer science
// ****************************************************************

public class LoveCS
{
    public static void main(String[] args)
    {

      int limit;
    	int count = 1;
      int total = 0;
      int n;
      Scanner input = new Scanner(System.in);

      System.out.println("How many times would you like the statement to print?");
      limit = input.nextInt();

    	while (count <= limit){
          System.out.println(count + ". I love Computer Science!!");
    	    count++;
          total += count;
        } // end of while

       System.out.println("Printed this message " + (count - 1) + " times. The sum of the numbers from 1 to " + limit + " is " + total + ".");

    } // end of main

} // end of class
