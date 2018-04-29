// **********************************************************
//   Count.java
//
//   This program reads in strings (phrases) and counts the
//   number of blank characters and certain other letters
//   in the phrase.
// **********************************************************

import java.util.Scanner;

public class Count
{
  public static void main (String[] args)
  {
      String phrase;    // a string of characters
      int countBlank = 0, countA = 0, countE = 0, countS = 0, countT = 0;   // the number of blanks (spaces) in the phrase
      int length;       // the length of the phrase
      char ch;          // an individual character in the string
      boolean done = false;

	    Scanner scan = new Scanner(System.in);

      // Print a program header
      System.out.println ("Character Counter");

      while (!done) {
        // Read in a string and find its length
        System.out.print ("Enter a sentence or phrase: ");
        phrase = scan.nextLine();
        length = phrase.length();

        if (phrase.equalsIgnoreCase("quit"))  {
          done = true;
          System.out.println("Goodbye");
        } // end of if
        else  {
          // Initialize counts
          countBlank = 0;

          // a for loop to go through the string character by character
          // and count the blank spaces

          for (int i = 0; i < length; i++) {
            ch = phrase.charAt(i);
            switch (ch) {
              case ' ': countBlank ++;
                        break;
              case 'a':
              case 'A': countA ++;
                        break;
              case 'e':
              case 'E': countE ++;
                        break;
              case 's':
              case 'S': countS ++;
                        break;
              case 't':
              case 'T': countT ++;
                        break;
            } // end of switch
          }; // end of for

          // Print the results
          System.out.println ();
          System.out.println ("Number of blank spaces: " + countBlank);
          System.out.println ("Number of A/a: " + countA);
          System.out.println ("Number of E/e: " + countE);
          System.out.println ("Number of S/s: " + countS);
          System.out.println ("Number of T/t: " + countT);
          System.out.println ();
        } // end of else
      } // end of while
    } // end of main
} // end of class
