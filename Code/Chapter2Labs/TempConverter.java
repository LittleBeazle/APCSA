import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) 
	{
		final int BASE = 32;
		final double CONVERSION_FACTOR = 9.0 / 5.0;
		
		int celsiusTemp = 24, fTemp; 
		double fahrenheitTemp;
		
		Scanner invalue = new Scanner(System.in);
		System.out.print("Enter a Celsius number as an integer: ");
		celsiusTemp = invalue.nextInt();
		
		fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE;
		fTemp = (int) (celsiusTemp * CONVERSION_FACTOR + BASE);
		
		System.out.println("Celsius Temperature: " + celsiusTemp);
		System.out.println("Fahrenheit Equivalent: " + fahrenheitTemp);
		System.out.println("fTemp: " + fTemp);
		
	} // end of main

} // end of class
