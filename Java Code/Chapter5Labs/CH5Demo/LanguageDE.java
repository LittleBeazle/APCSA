import java.util.*;

public class LanguageDE implements UserPrompts {

    public static Scanner invalue = new Scanner(System.in);


    public int menu() {
        int selection = 1;

        System.out.println("\nKapitel 5 Demoprogramm");
        System.out.println("Aktion                   Möglichkeit");
        System.out.println("Vertausche zwei Zahlen:                 1");
        System.out.println("Vertausche zwei Zahlen in einem Array:  2");
        System.out.println("Sprache ändern:                         3");
        System.out.println("Array neu laden:                        4");
        System.out.println("Array drucken:                          5");
        System.out.println("Aufhören:                               0");
        System.out.print("Option eingeben:  ");
        selection = invalue.nextInt();
        if ((selection < 0) || (selection > 5)) {
            System.out.println("Ungültige Auswahl, standardmäßig auf Option eins");
            selection = 1;
        }
        return selection;
    }

    public int langMenu() {
         int langSel = 1;
         System.out.println("\nSprache ändern");
         System.out.println("English    1");
         System.out.println("\u4e2d\u6587       2");
         System.out.println("Deutsch    3");
         System.out.println("Option eingeben: ");
         langSel = invalue.nextInt();
         if ((langSel < 1) || (langSel > 3)) {
             System.out.println("Ungültige Auswahl, standardmäßig auf Englisch");
             langSel = 1;
         }
         return langSel;
    }

    //	@Override
    public int idSwapNrs(int[] intlist) {
        int itemindex = 0;
        System.out.print("\n  Geben Sie den Index der auszutauschenden Nummer ein: ");
        itemindex = invalue.nextInt();
        if ((itemindex < 0) || (itemindex > 19)) {
            System.out.println("Ungültiger Eintrag, standardmäßig auf Index 3 gesetzt");
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
        String localstring = "\n ...Vor dem Tausch...";
        return localstring;
    } // end of beforeSwap

    public String afterSwap() {
        String localstring = "\n ...Nach dem Tausch...";
        return localstring;
    } // end of afterSwap



}
