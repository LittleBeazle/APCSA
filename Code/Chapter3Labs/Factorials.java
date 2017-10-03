import java.util.Scanner;
import java.text.DecimalFormat;

public class Factorials {

  public static void main(String[] args) {

    double count = 1;  //counter for while
    double total = 1;  //product value
    int invalue;  //user input
    boolean done = false;

    Scanner readIn = new Scanner(System.in);
    DecimalFormat fmt = new DecimalFormat("##");

    while (!done) {
      System.out.println("Please input a non-negative integer value (values greater than 170 will return infinity): ");
      invalue = readIn.nextInt();
      if (!(invalue > 0)) {
        System.out.println("That value is either not an integer or is a negative integer value.");
      } // end of if
      else if (invalue == 0) {
        System.out.print("0! = 1");
      }
      else  {
      while (count <= invalue) {
        total *= count;
        count += 1;
      } // end of else
        done = true;
        System.out.println(invalue + "! = " + fmt.format(total));
      } // end of while
    } // end of while

  } // end of main
} // end of class
