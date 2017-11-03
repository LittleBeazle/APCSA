import java.util.Random;


public class DiceRoll {

	public static void main(String[] args) 
	{
		//initialization of variables
		int die1, die2, dieSum;
		//double raw1, raw2;
		
		//generation of random method
		Random rand = new Random();
		
		//assigns random ints to dice
		die1 = rand.nextInt(6) + 1;
		die2 = rand.nextInt(6) + 1;
		dieSum = (die1 + die2);
		
		//prints values
		System.out.println("The value of the first die is " + die1 + " and the value of the second die is " + die2 + ".");
		System.out.println("The total dice value (the value of both dice added together) is " + dieSum + ".");

	} // end of main
} // end of class
