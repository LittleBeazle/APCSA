import java.util.Scanner;

public class BandBooster2 {
  public static void main(String[] args) {

    Scanner invalue = new Scanner(System.in);

    System.out.println("Input the name of the first band booster: ");
    BandBooster b1 = new BandBooster(invalue.next());

    System.out.println("Input the number of boxes sold over the past three weeks for " + b1.name + ": ");
    b1.updateSales(invalue.nextInt());

    System.out.println("Input the name of the second band booster: ");
    BandBooster b2 = new BandBooster(invalue.next());

    System.out.println("Input the number of boxes sold over the past three weeks for " + b2.name + ": ");
    b2.updateSales(invalue.nextInt());

    System.out.println();
    System.out.println(b1.name + ":\t" + b1.numBoxes + " boxes");
    System.out.println(b2.name + ":\t" + b2.numBoxes + " boxes");
    System.out.println();

  }
} // end of class
