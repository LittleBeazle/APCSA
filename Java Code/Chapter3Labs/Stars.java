import java.lang.Math;
import java.util.Scanner;

public class Stars {
  public static void main(String[] args) {

    int count = 1;  //counter for while
    double fact = 1;  //product value
    double e = 0;
    double accuracy;
    boolean done = false;

    Scanner readIn = new Scanner(System.in);

    System.out.println("Input a specified degree of accuracy (in # of digits): ");
    accuracy = readIn.nextDouble();

    for (int i = 0; i != accuracy; i++) {
      while (count <= i) {
        fact *= count;
        count += 1;
      } // end of while
      e += (1 / fact);
    } // end of for
    System.out.println("Calculated value: " + e);
    System.out.println("Accuracy value: " + accuracy);
    System.out.println("Actual e value: " + Math.E);
}
}
