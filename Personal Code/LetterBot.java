import java.util.Timer;
import java.util.TimerTask;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.AWTException;

public class LetterBot   {
     public static void main(String[] args) throws AWTException {
          Timer t;
          long period = 7000;
          t = new Timer();
          Robot beepBoop = new Robot();

          while (true)   {
               t.schedule(new TimerTask()  {
                              public void run()   {
                                   beepBoop.keyPress(KeyEvent.VK_A);
                                   beepBoop.keyRelease(KeyEvent.VK_A);
                                   beepBoop.keyPress(KeyEvent.VK_ENTER);
                                   beepBoop.keyRelease(KeyEvent.VK_ENTER);
                              } // end of run
                    }, period);
          } // end of while
     } // end of main

} // end of class
