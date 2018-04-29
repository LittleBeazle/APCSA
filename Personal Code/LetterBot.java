import javax.swing.*;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.AWTException;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class LetterBot extends JFrame {
     private static final long serialVersionUID = 42l;
     public JButton startB, stopB;
     public boolean done;
     public long period = 1000;
     public long delay = 5000;
     public final Object lock = new Object();

     public LetterBot() throws AWTException {
          Robot beepBoop = new Robot();
          setLayout(new FlowLayout(FlowLayout.CENTER));

          startB = new JButton("Start");
          add(startB);
          startB.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent event) {
                    while (!done)   {
                         beepBoop.keyPress(KeyEvent.VK_A);
                         beepBoop.keyRelease(KeyEvent.VK_A);
                         beepBoop.keyPress(KeyEvent.VK_ENTER);
                         beepBoop.keyRelease(KeyEvent.VK_ENTER);
                         try  {
                              synchronized (lock) {
                                   lock.wait(period);
                              }
                         }
                         catch (InterruptedException e)  {
                              e.printStackTrace();
                         }
                    } // end of while
               } // end of actionPerformed
          }); // end of ActionListener

          stopB = new JButton("Stop");
          add(stopB);
          stopB.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent event) {
                    done = true;
               } // end of actionPerformed
          }); // end of ActionListener
     } // end of LetterBot

     public static void main(String[] args) throws AWTException {
          LetterBot frame = new LetterBot();
          frame.setTitle("Letter Bot");
          frame.setLocationRelativeTo(null);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setSize(200, 100);
          frame.setBackground(Color.CYAN);
          frame.getContentPane().setBackground(Color.lightGray);
          frame.setVisible(true);
     } // end of main
} // end of class
