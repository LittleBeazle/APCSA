import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Sorting   {

     public static Scanner inval = new Scanner(System.in);
     public static Random rng = new Random();
     public static final int ARRAYSIZE = 500000;
     public static int[] intlist = new int[ARRAYSIZE];

     public static void SelectionSort(int[] arr)   {
          //Arrays.sort(arr);
          int minIndex, temp;
          long sTime = System.currentTimeMillis();
          for (int i = 0; i < arr.length; i++) {
               minIndex = i;
               for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[minIndex])
                         minIndex = j;
               }
               if (arr[i] != arr[minIndex]) {
                    temp = arr[minIndex];
                    arr[minIndex] = arr[i];
                    arr[i] = temp;
               }
          }
          long totTime = (System.currentTimeMillis() - sTime) / 1000;
          System.out.println("Process took " + totTime + " seconds");
     }

     public static int LinearSearch(int[] arr, int x)   {
          for (int i = 0; i < arr.length; i++) {
               if (arr[i] == x) return i;
          }
          return -1;
     }

     public static int BinarySearch(int[] arr, int x, int min, int max)   {
          int mid = ((min + (max - 1)) / 2);
          if (max >= 1) {
               if (intlist[mid] == x)
                    return mid;
               if (intlist[mid] > x) // x left of mid
                    return BinarySearch(arr, x, min, (mid - 1));
               else if (intlist[mid] < x)// x right of mid
                    return BinarySearch(arr, x, (mid + 1), max);
               }
          return (-1);
     }

     public static int menu()   {
          System.out.println("*******************\nSorting Arrays\n*******************");
          System.out.println("Load Array        1");
          System.out.println("Selection Sort    2");
          System.out.println("Linear Search     3");
          System.out.println("Binary Search     4");
          System.out.println("Print Array       5");
          System.out.println("Exit              0");

          System.out.println("Choose an option: ");
          return inval.nextInt();
     } // end of menu

     public static void main(String[] args) {
          boolean done = false;

          while (!done)   {
               switch (menu()) {
                    case 1:
                         for (int i = 0; i < intlist.length; i++) intlist[i] = rng.nextInt(50001);
                         System.out.println("Array loaded with " + ARRAYSIZE + " integers.");
                         break;
                    case 2:
                         SelectionSort(intlist);
                         System.out.println("Array sorted.");
                         break;
                    case 3:
                         System.out.println("Enter the number you'd like to search for: ");
                         int selLin = inval.nextInt();
                         int linVal = LinearSearch(intlist, selLin);
                         if (linVal == -1) System.out.println("Input was not generated.");
                         else System.out.println("Input was found at index " + linVal + " after ");
                         break;
                    case 4:
                         System.out.println("Enter the number you'd like to search for: ");
                         int selBin = inval.nextInt();
                         int binVal = BinarySearch(intlist, selBin, 0, intlist.length - 1);
                         if (binVal == -1) System.out.println("Input was not generated.");
                         else System.out.println("Input was found at index " + binVal);
                         break;
                    case 5:
                         for (int i = 0; i < intlist.length; i++)   {
                              if (i % 10 == 9)   {
                                   System.out.println("" + intlist[i]);
                              }
                              else   {
                                   System.out.print(intlist[i] + " ");
                              }
                         }
                         break;
                    case 0:
                         System.out.println("Goodbye!");
                         done = true;
                         break;
                    default:
                         System.out.println("Invalid selection, try again.");
                         break;
               } // end of switch-case
          } // end of while
     } // end of main
} // end of class
