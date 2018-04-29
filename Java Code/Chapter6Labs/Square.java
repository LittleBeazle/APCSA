import java.util.Scanner;
import java.util.Random;

public class Square {
     public static Scanner inval = new Scanner(System.in);
     public static final int ROWSIZE = 15;
     public static final int COLUMNSIZE = 15;
     public static int[][] intlist = new int[ROWSIZE][COLUMNSIZE];
     public static Random rgen = new Random();

     public static void load() {
          for (int i = 0; i < ROWSIZE; i++) {
               for (int j = 0; j < COLUMNSIZE; j++) {
                    intlist[i][j] = rgen.nextInt(101);
               }
          }
     }

     public static int sumRow()   {
          System.out.println("Which row would you like to sum?");
          int sel = inval.nextInt();
          int total = 0;
          for (int i = 0; i < COLUMNSIZE; i++) {
               total += intlist[sel][i];
          }
          return total;
     }

     public static int sumColumn()     {
          System.out.println("Which column would you like to sum?");
          int sel = inval.nextInt();
          int total = 0;
          for (int i = 0; i < ROWSIZE; i++) {
               total += intlist[i][sel];
          }
          return total;
     }

     public static void findLargest()   {
          int max = 0;
          int counter = 0;
          int colCount = 0, rowCount = 0;
          int maxRow = 0, maxCol = 0;
          for (int i = 0; i < ROWSIZE; i++) {
               for (int j = 0; j < COLUMNSIZE; j++) {
                    if (intlist[i][j] > max) {
                         max = intlist[i][j];
                         maxRow = i;
                         maxCol = j;
                    }
               }
          }

          for (int i = 0; i < ROWSIZE; i++) {
               for (int j = 0; j < COLUMNSIZE; j++) {
                    if (intlist[i][j] == max)
                         counter++;
               }
          }

          int[] rowList = new int[counter];
          int[] colList = new int[counter];
          for (int i = 0; i < ROWSIZE; i++) {
               for (int j = 0; j < COLUMNSIZE; j++) {
                    if (intlist[i][j] == max)     {
                         rowList[rowCount] = i;
                         colList[colCount] = j;
                         colCount++;
                         rowCount++;
                    }
               }
          }

          if (counter > 1) {
               System.out.printf("Max value %d found at indexes ", max);
               for (int y = 0; y < rowList.length - 1; y++)
                    System.out.printf("[%d, %d], ", rowList[y], colList[y]);
               System.out.printf("and [%d, %d]\n", rowList[rowList.length -1], colList[colList.length - 1]);

          }
          else if (counter == 1)
               System.out.printf("Max value %d found at index [%d, %d]\n", max, maxRow, maxCol);
     }

     public static int sumArray() {
          int total = 0;
          for (int i = 0; i < ROWSIZE; i++)  {
               for (int j = 0; j < COLUMNSIZE; j++)
                    total += intlist[i][j];
          }
          return total;
     }

     public static void swapRowColumn() {
          int[] tempRow = new int[ROWSIZE];
          System.out.println("Enter the row you'd like to swap: ");
          int sel = inval.nextInt();
          int[][] tempCol = new int[1][ROWSIZE];

          for (int i = 0; i < ROWSIZE; i++)  {
               tempRow[i] = intlist[sel][i];
               tempCol[0][i] = intlist[i][sel];
          }

          for (int i = 0; i < ROWSIZE; i++)  {
               intlist[sel][i] = tempCol[0][i];
               intlist[i][sel] = tempRow[i];
          }
     }

     public static void printArray() {
          for (int i = 0; i < ROWSIZE; i++)  {
               for (int j = 0; j < COLUMNSIZE; j++)    {
                    System.out.print(intlist[i][j] + " ");
               }
               System.out.println();
          }
     }

     public static int menu() {
          System.out.println("Load Array          1");
          System.out.println("Sum Row             2");
          System.out.println("Sum Column          3");
          System.out.println("Find Largest        4");
          System.out.println("Sum Array           5");
          System.out.println("Swap Row/Column     6");
          System.out.println("Print Array         7");
          System.out.println("Exit                0");
          System.out.println("Choose an option: ");
          return inval.nextInt();
     }

     public static void main(String[] args) {
          boolean done = false;
          while (!done) {
               switch (menu()) {
                    case 1: // load Array
                         load();
                         System.out.println("2D Array loaded");
                         break;
                    case 2: // sum row
                         System.out.println("The total is " + sumRow());
                         break;
                    case 3: // sum column
                         System.out.println("The total is " + sumColumn());
                         break;
                    case 4: // find Largest
                         findLargest();
                         break;
                    case 5: // sum array
                         System.out.println("The total is " + sumArray());
                         break;
                    case 6: // swap method
                         swapRowColumn();
                         break;
                    case 7: // print
                         printArray();
                         break;
                    case 0: // quit
                         done = true;
                         break;
                    default:
                         System.out.println("Invalid choice, try again.");
                         break;
               } // end of switch
          } // end of while
     } // end of main
} // end of class
