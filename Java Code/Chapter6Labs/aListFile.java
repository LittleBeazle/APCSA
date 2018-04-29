import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.lang.Integer;

public class aListFile {
     public static ArrayList<Integer> intlist = new ArrayList<Integer>(0);

     public static Random rng = new Random();
     public static Scanner inval = new Scanner(System.in);

     public static int menu() {
          System.out.println("____________________________");
          System.out.println("       Array List Lab       ");
          System.out.println("____________________________");
          System.out.println("Method                Option");
          System.out.println("____________________________");
          System.out.println("Load and Sort Array      1 " );
          System.out.println("Insert Integer           2 " );
          System.out.println("Remove Integer           3 " );
          System.out.println("Sum Array                4 " );
          System.out.println("Bigger Than              5 " );
          System.out.println("Print Array              6 " );
          System.out.println("Exit                     0 " );
          System.out.println("____________________________");

          return inval.nextInt();
     } // end of menu

     public static void loadSort() {
          int i, next = 0;
          System.out.println("Input desired array size: ");
          int length = inval.nextInt();
          intlist.clear();

          for(int j = 0 ; j < length; j ++) {
               next = rng.nextInt(1001);
               for(i = j; i > 0 && next < intlist.get(i - 1); i--);
                    intlist.add(i,next);
          }
     } // end of loadSort

     public static int insert() {
          System.out.println("Input the integer you'd like to insert: ");
          Integer x = new Integer(inval.nextInt());

          for (int i = 0; i < intlist.size(); i++) {
               if (i < intlist.size() - 1) {
                    if (x < intlist.get(0)) {
                         intlist.add(0, x);
                         return 0;
                    } else if (x < intlist.get(i + 1) && x > intlist.get(i)) {
                         intlist.add(i + 1, x);
                         System.out.println("Added at index " + (i + 1));
                         return 0;
                    }
               }
          }

          intlist.add(x);
          return 0;
     }

     public static void remove() {
          System.out.println("Input the index of the integer you'd like to remove: ");
          int ind = inval.nextInt();

          if (ind < intlist.size()) {
               intlist.remove(ind);
               System.out.println("Array now contains " + intlist.size() + " objects.");
          } else {
               System.out.println("That index doesn't exist!");
          }
     }

     public static Integer sumArray() {
          Integer total = new Integer(0);

          for (int i = 0; i < intlist.size(); i++)
               total += intlist.get(i);

          return total;
     }

     public static int biggerThan() {
          System.out.print("Input the number you'd like to compare: ");
          int comp = inval.nextInt();
          int count = 0;

          for (int i = 0; i < intlist.size(); i++) {
               if (intlist.get(i) >= comp)
                    count++;
          }

          return count;
     }

     public static void printList() {
          for (int i = 0; i < intlist.size(); i++)   {
               if (i % 10 == 9)   {
                    System.out.println("" + intlist.get(i));
               }
               else   {
                    System.out.print(intlist.get(i) + " ");
               }
          }
          System.out.println();
     }

     public static void main(String[] args) {
          boolean done = false;

          while (!done) {
               switch (menu()) {
                    case 0:
                         System.out.println("Goodbye");
                         done = true;
                         break;
                    case 1:
                         loadSort();
                         break;
                    case 2:
                         insert();
                         break;
                    case 3:
                         remove();
                         break;
                    case 4:
                         System.out.println("The sum of all integers in the array is " + sumArray());
                         break;
                    case 5:
                         System.out.println("There are " + biggerThan() + " integers in this array which are larger than your input.");
                         break;
                    case 6:
                         printList();
                         break;
                    default:
                         System.out.println("Invalid input, try again.");
                         break;

               } // end of switch case
          } // end of while
     } // end of main
} // end of class
