// *******************************************************************
//   PlusTest.java
// 
//   Demonstrate the different behaviors of the + operator
// *******************************************************************

public class PlusTest
{
    // -------------------------------------------------
    // main prints some expressions using the + operator
    // -------------------------------------------------
    public static void main (String[] args)
    {
	System.out.println ("This is a long string that is the " +
			        "concatenation of two shorter strings.");

	System.out.println ("The first computer was invented about " + 55 +
			        " years ago.");

	System.out.println ("8 plus 5 is " + 8 + 5); // interprets 8 and 5 as individual strings when concatenating

	System.out.println ("8 plus 5 is " + (8 + 5)); // interprets (8 + 5) as a string but does the math before concatenating

	System.out.println (8 + 5 + " equals 8 plus 5."); // interprets 8 + 5 as integers and then concatenates
	
	System.out.println ("Ten robins plus " + 13 + " canaries is " + (10 + 13) + " birds."); // bird statement
	
    } // end of main
} // end of class
