import java.util.*;

public class Language implements UserPrompts {

    public static Scanner invalue = new Scanner(System.in);


    public int menu() {
        int selection = 1;

        System.out.println("\nChapter 5 Demo Program");
        System.out.println("Action                   Option");
        System.out.println("Swap two numbers:           1");
        System.out.println("Swap two numbers in array:  2");
        System.out.println("Change Language:            3");
        System.out.println("Reload array:               4");
        System.out.println("Print array:                5");
        System.out.println("Quit:                       0");
        System.out.print("Enter Option:  ");
        selection = invalue.nextInt();
        if ((selection < 0) || (selection > 5)) {
            System.out.println("Invalid choice, defaulting to Swap Two Numbers");
            selection = 1;
        }
        return selection;
    }
    public int langMenu() {
         int langSel = 1;
         System.out.println("\nChange Language");
         System.out.println("English    1");
         System.out.println("\u4e2d\u6587       2");
         System.out.println("Deutsch    3");
         System.out.println("Enter Option: ");
         langSel = invalue.nextInt();
         if ((langSel < 1) || (langSel > 3)) {
             System.out.println("Invalid selection, defaulting to English");
             langSel = 1;
         }
         return langSel;
    }

    //	@Override
    public int idSwapNrs(int[] intlist) {
        int itemindex = 0;
        System.out.print("\n  Enter index of number to be swapped: ");
        itemindex = invalue.nextInt();
        if ((itemindex < 0) || (itemindex > 19)) {
            System.out.println("Invalid entry, defaulting to index 3");
            itemindex = 3;
        }
        return itemindex;
    }

    public String printHeader() {
        String headstring = new String("Array");
        // TODO Auto-generated method stub
        return headstring;
    } // end of header string

    public String beforeSwap() {
        String localstring = "\n ...Before Swap...";
        return localstring;
    } // end of beforeSwap

    public String afterSwap() {
        String localstring = "\n ...After Swap...";
        return localstring;
    } // end of afterSwap



}
