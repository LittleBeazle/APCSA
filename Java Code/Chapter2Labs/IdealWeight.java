import java.util.Scanner;
import java.text.DecimalFormat;

public class IdealWeight {

	public static void main(String[] args)
	{
		//constants
		final int MALE_BASE = 106;
		final int FEMALE_BASE = 100;
		final int MALE_MULT = 6;
		final int FEMALE_MULT = 5;

		//variables
		int feet, inches;
		double maleWeight, femaleWeight;

		//methods
		Scanner input = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("###.##");

		//prompts for height in feet and inches
		System.out.println("This program takes your height in feet and inches and displays an ideal male and female weight for that height.");

		System.out.println("Please enter your height in feet and inches with a space between the two values: ");	//prompts for feet and inches
		feet = input.nextInt();
		inches = input.nextInt();

		//prints ideal weight at or below 5 ft tall
		if ((feet < 5) || ((inches == 0) && (feet == 5))) {
			System.out.print("The ideal male weight is " + MALE_BASE + " lbs and the ideal female weight is " + FEMALE_BASE + " lbs.");
			System.out.println("The ideal male weight range is from " + fmt.format(MALE_BASE * 0.85) + " lbs to " + fmt.format(MALE_BASE * 1.15) + " lbs.");
			System.out.println("The ideal female weight range is from " + fmt.format(FEMALE_BASE * 0.85) + " lbs to " + fmt.format(FEMALE_BASE * 1.15) + " lbs.");
		}

		//for heights above 5'11"
		else if (feet >= 6)	{
			maleWeight = (((((feet - 5) * 12) + inches) * MALE_MULT) + MALE_BASE);
			femaleWeight = (((((feet - 5) * 12) + inches) * FEMALE_MULT) + FEMALE_BASE);
			System.out.println("The ideal male weight is " + maleWeight + " lbs and the ideal female weight is " + femaleWeight + " lbs.");
			System.out.println("The ideal male weight range is from " + fmt.format(maleWeight * 0.85) + " lbs to " + fmt.format(maleWeight * 1.15) + " lbs.");
			System.out.println("The ideal female weight range is from " + fmt.format(femaleWeight * 0.85) + " lbs to " + fmt.format(femaleWeight * 1.15) + " lbs.");

		}

		//for heights from 5'1" to 5'11"
		else if ((feet == 5) && ((inches <= 11) && (inches != 0))) {
			maleWeight = ((inches * MALE_MULT) + MALE_BASE);
			femaleWeight = ((inches * FEMALE_MULT) + FEMALE_BASE);
			System.out.println("The ideal male weight is " + maleWeight + " lbs and the ideal female weight is " + femaleWeight + " lbs.");
			System.out.println("The ideal male weight range is from " + fmt.format(maleWeight * 0.85) + " lbs to " + fmt.format(maleWeight * 1.15) + " lbs.");
			System.out.println("The ideal female weight range is from " + fmt.format(femaleWeight * 0.85) + " lbs to " + fmt.format(femaleWeight * 1.15) + " lbs.");

		}

	} // end of main

} // end of class
