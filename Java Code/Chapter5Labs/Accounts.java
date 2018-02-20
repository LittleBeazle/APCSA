//*******************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, charge a fee to, and print a summary of the account.
//*******************************************************
import java.util.Random;
public class Accounts
{
     private double balance;
     private String name;
     private int accNum;
     private static int numAccounts;
     public Random rng = new Random();


     //----------------------------------------------
     //Constructor -- initializes balance, owner, and account number
     //----------------------------------------------
     public Accounts(double initBal, String owner, int num)
     {
          balance = initBal;
          name = owner;
          accNum = num;
          numAccounts++;
     } // end of Account

     //----------------------------------------------
     // Checks to see if balance is sufficient for withdrawal.
     // If so, decrements balance by amount; if not, prints message.
     //----------------------------------------------
     public static int getNumAccounts()
     {
          return numAccounts;
     }

     public void close()
     {
          this.name += "–CLOSED";
          this.balance = 0;
          numAccounts--;
     }

     public Accounts consolidate(Accounts x)
     {
          double newBal = this.balance + x.balance;
          Accounts conAcc = this;
          if (this.accNum != x.accNum) {
               conAcc = new Accounts(newBal, this.name, rng.nextInt(100000));
          }
          return conAcc;
     }

     public void withdraw(double amount)
     {
          if (balance >= amount)
          balance -= amount;
          else
          System.out.println("Insufficient funds");
     } // end of withdraw

     //----------------------------------------------
     // Adds deposit amount to balance.
     //----------------------------------------------
     public void deposit(double amount)
     {
          balance += amount;
     } // end of deposit

     //----------------------------------------------
     // Returns balance.
     //----------------------------------------------
     public double getBalance()
     {
          return balance;
     } // end getBalance


     //----------------------------------------------
     // Returns a string containing the name, account number, and balance.
     //----------------------------------------------
     public String toString()
     {
          return ("Name: " + name + "; Balance: " + balance);
     } // end of toString

     //----------------------------------------------
     // Deducts $10 service fee
     //----------------------------------------------
     public double chargeFee()
     {
          balance -= 10;
          return balance;
     } // end of chargeFee

     //----------------------------------------------
     // Changes the name on the account
     //----------------------------------------------
     public void changeName(String newName)
     {
          name = newName;
     } // end of changeName

} // end of class

