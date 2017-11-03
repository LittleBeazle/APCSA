// ****************************************************************
//   Guess.java
//
//   Play a game where the user guesses a number from 1 to 10
//
// ****************************************************************
import java.util.Scanner;
import java.util.Random;

public class Guess
{
    public static void main(String[] args)
    {
      int numToGuess;       //Number the user tries to guess
      int guess;            //The user's guess
      int guessCount = 1, highCount = 0, lowCount = 0;

    	Scanner scan = new Scanner(System.in);
    	Random generator = new Random();

    	//randomly generate the  number to guess
      numToGuess = generator.nextInt(10) + 1;

    	//print message asking user to enter a guess
      System.out.println("Please guess a number from 1 to 10:");
      guess = scan.nextInt();

    	while (guess != numToGuess)  //keep going as long as the guess is wrong
            {
              guessCount++;
              System.out.println("Incorrect! Please try again.");
              guess = scan.nextInt();

              if (guess < numToGuess)
                lowCount++;
              else if (guess > numToGuess)
                highCount++;
            } // end of while

    	//print message saying guess is right
      System.out.println("That's correct!");
      System.out.println("It took you " + guessCount + " guesses.");
      System.out.println("You had " + lowCount + " low guesses and " + highCount + " high guesses.");
    } // end of main
} // end of class
