import java.util.Random;

public class MinMax {
  public static void main(String[] args) {

    int min = 1000, max = 0;
    int[] list = new int[24];
    Random rand = new Random();

    for (int i = 0; i < 24; i++)  {
      list[i] = rand.nextInt(100);
    } // end of for

    for (int i = 0; i < 24; i++)  {
      if (list[i] > max)
        max = list[i];
      else if (list[i] < min)
        min = list[i];
    } // end of for
    System.out.println("The maximum value is " + max + " and the minimum value is " + min + ".");
  } // end of main
} // end of class
