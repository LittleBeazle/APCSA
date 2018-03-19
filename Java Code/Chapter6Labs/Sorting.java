import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Sorting   {

     public static Scanner inval = new Scanner(System.in);
     public static Random rng = new Random();
     public static final int ARRAYSIZE = 2000;
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
          System.out.println("Selection sort process took " + totTime + " seconds");
     }

     public static void LinearSearch(int[] arr, int x)   {
          int count1 = 0;
          int count2 = 0;
          int monoIndex = 0;

          for (int i = 0; i < arr.length; i++) {
               if (arr[i] == x) {
                    count1++;
                    monoIndex = i;
               }
          }

          if (count1 > 1) {
               int[] indLis = new int[count1];
               for (int n = 0; n < intlist.length; n++) {
                    if (intlist[n] == x) {
                         indLis[count2] = n;
                         count2++;
                    }
               }
               System.out.print("Search term was found at indexes ");
               for (int y = 0; y < indLis.length - 1; y++) {
                    System.out.print(indLis[y] + " ");
               }
               System.out.println("and " + indLis[count1 - 1]);
          }
          else if (count1 == 1) {
               System.out.println("Search term found at index " + monoIndex);
          }

          else System.out.println("Search term was not generated.");
     }

     public static int BinarySearch(int[] arr, int x)   {
          int min = 0;
          int max = arr.length - 1;

          while (min <= max) {
               int mid = (min + max) / 2;
               if (intlist[mid] == x)
                    return mid;
               if (intlist[mid] > x) // x less than mid
                    max = mid - 1;
               else if (intlist[mid] < x)// x greater than mid
                    min = mid + 1;
          }
          return -1;
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
                         LinearSearch(intlist, selLin);
                         break;
                    case 4:
                         System.out.println("Enter the number you'd like to search for: ");
                         int selBin = inval.nextInt();
                         int binVal = BinarySearch(intlist, selBin);
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
