/************************************************
 *  File:		Ch4Demo
 *  Author:		J.Foy
 *  Created:		7/14/2015
 *  Demos several Chapter 4 concepts
 *  Revision History
 *  	Rev 0:		Initial Release
 *      1:		Changed for school year 2016
 *
 */

// Explorations:
// Number 1: Write a line of code that reads the color of
//           a specific Car object int string "color".  Instance
//           variable "Color" is defined in accompanying file Car.java.
// Number 2: Assign a color string value (i.e. "white") to string
//			 		 color, then change the Color instance value for one of
// 			 		 the Car objects
// Number 3: Write a line of code that attempts to read the Value of a
//           Car object.  What happens?  When it does not work, call
//           Car class method getValue instead.
// Number 4: Create two more Car objects.  This will require you to
//           change the value of constant NRCARS, and also to include
//           constructors for both inside the for loop that creates
//           the objects
// Number 5: Using two of the Car objects in the car array, call Car
//           method "fault" to see who is at fault in a collision. Use
//           the pattern provided with the Hawkins Foy collision code to
//           see how to refer to the two cars in a single line of code.
//           NOTE: if you hit a car from behind, you are almost always
//           found to be at fault.
// Number 6: Create a for loop that prints out all of the car objects
//           in array car_array.  Example "println" statements in the bottom of
//           Listing 4.4 on page 194 are an example.
// Number 7: After reading about method "adjustValue" in class Car,
//           write a line of code that adjusts the value of a specific
//           car object.  The "acct3.withdraw(800.0, 0)" line of code in
//           Listing 4.4 on page 194 is an example.
// Number 8: Note that exploration number 7, and Car class method
//           "adjustValue" could cause a car's value to be a negative
//           number.  Write an "if" statement in method "adjustvalue"
//           that recognizes this, and instead sets the value to 0.
//
//   EXPLORATIONS 9, 10, AND 11 ARE AFTER A CLASSROOM EXPLANATION
// Number 9:  Add a method to the Car class that reads the value of
//			 		  instance variable Vin.  Then add code in this program
//            that reads instance values of Make, Model, and Vin and
//            then writes these to the Console with appropriate text.
// Number 10: Write two new methods in class Car; one gets the value
//            of Car object instance variable Mileage, the second changes
//            the value of that instance variable to a number provided
//            by the method call in this program.
// Number 11: Two cars are in a collision.  Decide on a damage amount for
//            each, and adjust each's value.  To do this, you will need
//            to call "getValue" for each, and then call "adjustValue" with
//            each. Finally, use Car class method bothTotaled to see
//            if both are totaled or not.

import java.util.*;

public class Ch4Demo
{

	public static void main(String[] args)
	{
		Car c1, c2, c3, c4;
		String faultdriver;
		String color = new String("white");
		final int NRCARS = 5;
		int i, randdriver;
		Car[] car_array = new Car[NRCARS];

		// previous declaration is for an array, described in chapter 6
		// next for loop loads 3 vehicles into the array, passing their
		// constructor the necessary information
		//
		for (i = 0; i < NRCARS; i++)
		{
		 car_array[0] = new Car("Foy","Rav4", "Toyota", 150000, 32, 2003, 2000, 555444);
		 car_array[1] = new Car("Crattie", "Model T", "Ford", 590000, 4, 1908, 13,1);
		 car_array[2] = new Car("Hawkins", "Jeep", "Chrysler", 300, 26, 2014, 9000,123432);
		 car_array[3] = new Car("Arnold", "Van?", "Ford", 190000, 28, 2010, 8000, 191919);
		 car_array[4] = new Car("Blevins", "SUV", "Lamborghini", 10, 100, 2030, 9999999, 010101);
		} // end of for

		// Following code is an example for Exploration 5
		// method fault determines whose fault it is if car1 strikes car2
		c1 = car_array[0];
		c2 = car_array[2];
		faultdriver = c1.fault(c2);
		System.out.print("When " + (c1.Owner) + " strikes " + (c2.Owner));
	 	System.out.println(" from behind, "+ faultdriver + " is at fault");

		// exploration 1
		System.out.println(c1.Color);

		// exploration 2
		c1.Color = color;

		// exploration 3
		System.out.println(c1.getValue());

		// exploration 5
		c3 = car_array[1];
		c4 = car_array[3];
		faultdriver = c3.fault(c4);
		System.out.println("When " + (c3.Owner) + " strikes " + (c4.Owner) + " from behind, " + faultdriver + " is at fault.");

		// exploration 6
		for (i = 0; i < 5; i++) {
			System.out.println(car_array[i]);
		}

		// exploration 7
		c1.adjustValue(1000);

		// exploration 11
		System.out.println("The pre-wreck value of car one is " + c1.getValue() + " and the pre-wreck value of car two is " + c2.getValue() + ".");
		c1.adjustValue(-10000);
		c2.adjustValue(-10000);
		System.out.println("Are the two cars totaled? \n" + c1.bothTotaled(c2));

	} // end of main

}  // end of class
