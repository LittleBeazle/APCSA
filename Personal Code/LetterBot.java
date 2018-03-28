import java.util.Timer;
import java.util.TimerTask;
import java.awt.Robot;

public class LetterBot   {
     public Timer t;
     public Robot beepBoop = new Robot();
     public LetterBot()  {
          t = new Timer();
          t.schedule(Spam(), 0.7);
     }

     class Spam extends TimerTask  {
          public void run()   {
               beepBoop.keyPress(VK_A);
               beepBoop.keyRelease(VK_A);
               t.cancel();
          }
     }

     public static void main(String[] args) {
          while (True)   {
               LetterBot();
          }
     }

}
