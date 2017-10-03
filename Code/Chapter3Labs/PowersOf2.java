// ****************************************************************
//   PowersOf2.java
//
//   Print out as many powers of 2 as the user requests
//
// ****************************************************************
import java.util.Scanner;

public class PowersOf2
{
    public static void main(String[] args)
    {
        int numPowers;        //How many powers of 2 to compute
        int nextPower = 1;    //Current power of  2
        int exponent = 1;            //Exponent for current power of 2 -- this
                        	   //also serves as a counter for the loop
        Scanner scan = new Scanner(System.in);

        System.out.println("How many powers of 2 would you like printed?");
        numPowers = scan.nextInt();

        //print a message saying how many powers of 2 will be printed
        System.out.println("Here are the first " + numPowers + " powers of 2: ");

        //initialize exponent -- the first thing printed is 2 to the what?
        System.out.println("2^0 = 1");


	  while (exponent != numPowers)
        {
          nextPower *= 2;

          System.out.println("2^" + exponent + " = " + nextPower);

          //increment exponent
          exponent += 1;
        } // end of while

    } // end of main
} // end of class
