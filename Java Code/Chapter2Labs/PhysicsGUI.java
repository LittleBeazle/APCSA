import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.text.DecimalFormat;
import java.awt.Color;
import java.awt.Font;
import java.lang.Math;

public class PhysicsGUI extends JFrame
{
  //************************************************
  //** Dev: Zach Bostic
  //** L&N STEM Academy
  //** Calculator for parameters of object in motion
  //************************************************

  public JLabel angle, initVel, maxAlt, maxRange;
  public JTextField angleBox, initVelBox, altBox, rangeBox;
  public JButton CalculateButton;
  public final double ACCEL = 9.8;
  public final double RAD_CONV = (Math.PI / 180);

  public PhysicsGUI()
  {
    setLayout(new FlowLayout(FlowLayout.LEFT, 25, 20));

    //initialization of input and output text boxes
    angle = new JLabel("Launch Angle");
    add(angle);
    angleBox = new JTextField(8);
    add(angleBox);

    initVel = new JLabel("Initial Velocity");
    add(initVel);
    initVelBox = new JTextField(8);
    add(initVelBox);

    maxAlt = new JLabel("Maximum Altitude");
    add(maxAlt);
    altBox = new JTextField(8);
    add(altBox);
    altBox.setEnabled(false);

    maxRange = new JLabel("Maximum Range");
    add(maxRange);
    rangeBox = new JTextField(8);
    add(rangeBox);
    rangeBox.setEnabled(false);

    setEnabled(true);
    setVisible(true);

    //initialization of CalculateButton
    CalculateButton = new JButton("Calculate");
    add(CalculateButton);
    CalculateButton.addActionListener(new ActionListener()
    {

      public void actionPerformed(ActionEvent event)
      {
        DecimalFormat fmt = new DecimalFormat("####.##");
        String errorTitle = new String("Error");
        String errorText = new String("Error: One or more of the input fields has not been filled out or an invalid character has been inserted into an input field. Please return to the GUI and input both values as numerical vales.");
        String angleString = angleBox.getText();
        String initVelString = initVelBox.getText();

        //Popup boxes and outputs
        try {
          Double angleValue = Double.valueOf(angleString);
          Double initVelValue = Double.valueOf(initVelString);
          Double radians = angleValue * RAD_CONV;
          Double initX = initVelValue * Math.cos(radians);
          Double initY = initVelValue * Math.sin(radians);

          //Calculating peak and total time according to equation
          Double peakTime = (initY / ACCEL);
          Double totalTime = 2 * peakTime;

          //Calculating max Altitude and range
          Double maxHeight = (initY * peakTime) - (4.9 * Math.pow(peakTime, 2));
          Double range = initX * totalTime;

          //Pop up box and output
          String popTitle = new String ("Vector Information");
          String popMessage = new String ("The initial horizontal velocity is " + fmt.format(initX) + " m/s. \nThe initial vertical velocity is " + fmt.format(initY) + " m/s. \nThe time to reach the maximum altitude is " + fmt.format(peakTime) + " seconds.");
          String outAlt = fmt.format(maxHeight);
          String outRange = fmt.format(range);
          altBox.setText(outAlt);
          rangeBox.setText(outRange);
          if (true) JOptionPane.showMessageDialog(null, popMessage, popTitle, JOptionPane.PLAIN_MESSAGE);
        }
        //if non-numerical or both inputs not filled
        catch (NumberFormatException s) {
          if (true) JOptionPane.showMessageDialog(null, errorText, errorTitle, JOptionPane.ERROR_MESSAGE);
        } // end of try catch

        //stupid annoying substring
        String tedious = new String("vertical horizontal velocity changes does not change because of zero accleration direction an object constant");
        String vertical = tedious.substring(tedious.indexOf("vertical"), tedious.indexOf(" horizontal velocity changes does not change because of zero accleration direction an object constant"));
        String horizontal = tedious.substring(tedious.indexOf("horizontal"), tedious.indexOf(" changes does not change because of zero accleration direction an object constant"));
        String velocity = tedious.substring(tedious.indexOf("velocity"), tedious.indexOf(" changes does not change because of zero accleration direction an object constant"));
        String changes = tedious.substring(tedious.indexOf("changes"), tedious.indexOf(" does not change because of zero accleration direction an object constant"));
        String doesNotChange = tedious.substring(tedious.indexOf("does"), tedious.indexOf(" because of zero accleration direction an object constant"));
        String becauseOf = tedious.substring(tedious.indexOf("because"), tedious.indexOf(" zero accleration direction an object constant"));
        String zero = tedious.substring(tedious.indexOf("zero"), tedious.indexOf(" direction an object constant"));
        String accleration = tedious.substring(tedious.indexOf("accleration"), tedious.indexOf(" direction an object constant"));
        String verticalString = new String(vertical + " " + velocity + " " + changes + " " + becauseOf + " " + accleration + ".");
        String horizontalString = new String(horizontal + " " + doesNotChange + " " + becauseOf + " " + zero + ".");
        System.out.println(verticalString);
        System.out.println(horizontalString);

      } // end of actionPerformed

    }); // end of ActionListener

  } // end of PhysicsGUI constructor

  public static void main(String[] args)
    {
      PhysicsGUI frame = new PhysicsGUI();
      frame.setTitle("Projectile Motion Calculator");
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(600, 200);
      frame.setBackground(Color.lightGray);
      frame.getContentPane().setBackground(Color.lightGray);
      frame.setVisible(true);
    }; // end of main

} // end of class
