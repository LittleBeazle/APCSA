import java.util.*;
import java.text.DecimalFormat;
import java.lang.Math;

public class Design {
  public static void main(String[] args) {

    boolean done = false;
    Integer[] list = new Integer[1000];
    int uLimit, search, count, lowLim, highLim, minVal, maxVal;
    double sum, root;
    String cont;

    Scanner scan = new Scanner(System.in);
    DecimalFormat fmt = new DecimalFormat("#.###");
    Random rgen = new Random();

    while (!done) {
      count = 0;
      sum = 0;
      System.out.println();
      System.out.print("Input an upper limit value: ");
      uLimit = scan.nextInt();
      System.out.println();

      for (int i = 0; i < 1000; i++)  { // loads the array
        list[i] = rgen.nextInt(uLimit);

        if (i == 999) { // prints the array, 10 to a line
          for (int x = 0; x <= i; x++)  {
            if ((x + 1) % 10 == 0)
              System.out.println(list[x]);
            else
              System.out.print(list[x] + " ");
          } // end of for
        } // end of if
      } // end of for

      /*
      System.out.println();
      System.out.print("What number would you like to search for in the array?: ");
      search = scan.nextInt();
      System.out.println();

      for (int i = 0; i < 1000; i++)  { // searches for the requested number
        if (list[i] == search)
          count++;
      } // end of for

      System.out.println("The requested number was found " + count + " times.");
      */

      System.out.println();
      System.out.print("Input a number between 1 and 500: ");
      lowLim = scan.nextInt();
      System.out.println();
      System.out.print("Input a number between 501 and 1000: ");
      highLim = scan.nextInt();
      System.out.println();

      System.out.println("Array index and corresponding values between given inputs: ");
      System.out.println();
      System.out.println("\tIndex\tValue\tSquare Root");
      for (int i = lowLim; i < highLim; i++)  {
        root = Math.sqrt(list[i]);
        System.out.println("\t" + i + "\t" + list[i] + "\t" + fmt.format(root));
        sum += root;
      }
      System.out.println();
      System.out.println("The sum of the square roots of the numbers is " + fmt.format(sum) + ".");

      minVal = uLimit;
      maxVal = 0;
      for (int i = 0; i < 1000; i++)  {
        if (list[i] > maxVal)
          maxVal = list[i];
        else if (list[i] < minVal)
          minVal = list[i];
      }
      System.out.println();
      System.out.println("The index of the maximum value in the list is " + Arrays.asList(list).indexOf(maxVal));
      System.out.println();
      System.out.println("The index of the minimum value in the list is " + Arrays.asList(list).indexOf(minVal));

      System.out.println();
      System.out.print("Would you like to continue (Yes/No)? ");
      cont = scan.next();
      System.out.println();

      if (cont.equalsIgnoreCase("no"))  {
        done = true;
        System.out.println("Goodbye");
        System.out.println();
      } // end of if

      else if (cont.equalsIgnoreCase("yes"))  {
        System.out.println();
        System.out.println("Continuing...");
        System.out.println();
      } // end of else if

      else  {
        System.out.println();
        System.out.print("Oops! I don't recognize that answer. Since you can't follow basic instructions, I assume you're too dimwitted to ");
        System.out.println("continue running this program. Goodbye.");
        System.out.println();
        done = true;
      } // end of else
    } // end of while

  } // end of main
} // end of class
