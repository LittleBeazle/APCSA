//***********************************************************
// TestAccounts1
// A simple program to test the numAccts method of the
// Account class.
//***********************************************************
import java.util.*;

public class TestAccounts1
{
    public static void main(String[] args)
    {
          Random rng = new Random();

     	Accounts testAcct;

     	Scanner scan = new Scanner(System.in);

     	System.out.println("How many accounts would you like to create?");
     	int num = scan.nextInt();

     	for (int i = 1; i <= num; i++)
	    {
     		testAcct = new Accounts(100, "Name" + i, rng.nextInt(100000));
               testAcct.close();
     		System.out.println("\nCreated account " + testAcct);
     		System.out.println("Now there are " + Accounts.getNumAccounts() +
     				   " accounts");
	     }

     }
}

