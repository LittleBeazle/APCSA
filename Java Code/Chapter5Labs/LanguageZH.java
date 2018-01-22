import java.util.*;
// Google Translate consulted for vocabulary, personal knowledge used for grammar

public class LanguageZH implements UserPrompts {

    public static Scanner invalue = new Scanner(System.in);


    public int menu() {
        int selection = 1;

        System.out.println("\n\u7b2c\u4e94\u8bfe\u7684\u6f14\u793a\u4ee3\u7801"); // Chapter 5 demo program
        System.out.println("\u884c\u52a8                   \u9009\u9879");
        System.out.println("\u4ea4\u6362\u4e24\u4e2a\u53f7\u7801:           1"); // Swap two numbers
        System.out.println("\u5728\u77e9\u9635\u4ea4\u6362\u4e24\u4e2a\u53f7\u7801:     2"); // Swap two numbers in an array
        System.out.println("\u66f4\u6539\u8bed\u008a:                 3"); // Change Language
        System.out.println("\u751f\u6210\u65b0\u7684\u77e9\u9635:           4"); // Reload Array
        System.out.println("\u6253\u5370\u77e9\u9635:               5"); // Print Array
        System.out.println("\u653e\u5f03:                   0"); // Quit
        System.out.print("\u952e\u5165\u9009\u9879:  "); // Enter Option:
        selection = invalue.nextInt();
        if ((selection < 0) || (selection > 5)) {
            System.out.println("\u65e0\u6548\u7684\u9009\u578b\uff0c\u9009\u9879\u9ed8\u8ba4\u4e00");
            selection = 1;
        }
        return selection;
    }

    public int langMenu() {
         int langSel = 1;
         System.out.println("\n\u66f4\u6539\u8bed\u008a");
         System.out.println("English    1");
         System.out.println("\u4e2d\u6587       2");
         System.out.println("Deutsch    3");
         System.out.println("\u952e\u5165\u9009\u9879: ");
         langSel = invalue.nextInt();
         if ((langSel < 1) || (langSel > 3)) {
             System.out.println("\u65e0\u6548\u7684\u9009\u578b\uff0c\u9ed8\u8ba4\u662f\u82f1\u6587");
             langSel = 1;
         }
         return langSel;
    }
    //	@Override
    public int idSwapNrs(int[] intlist) {
        int itemindex = 0;
        System.out.print("\n  \u8f93\u5165\u8981\u4ea4\u6362\u7684\u53f7\u7801\u7684\u7d22\u5f15: ");
        itemindex = invalue.nextInt();
        if ((itemindex < 0) || (itemindex > 19)) {
            System.out.println("\u65e0\u6548\u7684\u8f93\u5165,\u9ed8\u8ba4\u7d22\u5f15\u4e09");
            itemindex = 3;
        }
        return itemindex;
    }

    public String printHeader() {
        String headstring = new String("\u77e9\u9635");
        // TODO Auto-generated method stub
        return headstring;
    } // end of header string

    public String beforeSwap() {
        String localstring = "\n ...\u4ee5\u524d\u4ea4\u6362...";
        return localstring;
    } // end of beforeSwap

    public String afterSwap() {
        String localstring = "\n ...\u4ee5\u540e\u4ea4\u6362...";
        return localstring;
    } // end of afterSwap



}
