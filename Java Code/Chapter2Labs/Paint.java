//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class Paint
{
    public static
     void main(String[] args)
    {
        final int COVERAGE = 350;  //paint covers 350 sq ft/gal
        final double DOOR_SIZE = 20.0; //doors are 20 sq ft
        final double WINDOW_SIZE = 15.0; //windows are 15 sq ft

        //declare integers length, width, and height; also windows and doors
        int length, width, height, windows, doors, bucketsNeeded;

        //declare double totalSqFt;
        double rawSqFt, totalSqFt, paintNeeded, unusedSpace;

	      //declare and initialize objects
        Scanner input = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("##.##");


        //Prompt for and read in the length of the room
        System.out.println("Please input the length of the room: ");
        length = input.nextInt();

        //Prompt for and read in the width of the room
        System.out.println("Please input the width of the room: ");
        width = input.nextInt();

        //Prompt for and read in the height of the room
        System.out.println("Please input the height of the room: ");
        height = input.nextInt();

        //Prompt for and read in the number of windows in the room
        System.out.println("Please input the number of windows in the room: ");
        windows = input.nextInt();

        //Prompt for and read in the number of doors in the room
        System.out.println("Please input the number of doors in the room: ");
        doors = input.nextInt();

        //Compute the total square feet to be painted--think
        //about the dimensions of each wall
        rawSqFt = 2 * ((height * length) + (width * height));

        //calculates unneeded amount
        unusedSpace = ((windows * WINDOW_SIZE) + (doors * DOOR_SIZE));

        //subtracts the unneeded amount from raw
        totalSqFt = (rawSqFt - unusedSpace);

        //Compute the amount of paint/buckets needed
        paintNeeded = (totalSqFt / COVERAGE);
        bucketsNeeded = (int) Math.ceil(paintNeeded);


        //Print the length, width, and height of the room and the
        //number of gallons/buckets of paint needed.
        System.out.println("The length of the room is " + length);
        System.out.println("The width of the room is " + width);
        System.out.println("The height of the room is " + height);
        System.out.println("The total number of gallons of paint needed is " + fmt.format(paintNeeded));
        System.out.println("The total number of paint buckets needed is " + bucketsNeeded + " buckets.");

    } //end of main
} // end of class
