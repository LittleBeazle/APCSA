import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OrbitsGUI extends JFrame
{
     //*************************
     //** Dev: Zach Bostic
     //** L&N STEM Academy
     //** Orbits GUI
     //*************************

     public JButton main1, main2, main3, main4, main5;

     private static final long serialVersionUID = 42l;

     public static JButton[] powOptions = new JButton[3];
     public static JButton[] selOptions = new JButton[5];
     public static JButton[] orbOptions = new JButton[3];

     public static Satellite sat1;
     public static Satellite[] satArray = new Satellite[5];

     static DecimalFormat fmt = new DecimalFormat("##.###");

     public OrbitsGUI() {
          setLayout(new FlowLayout(FlowLayout.LEFT, 25, 20));

          //main menu
          main1 = new JButton("Print Satellites");
          add(main1);
          main1.addActionListener(new ActionListener()
          {
               public void actionPerformed(ActionEvent event)
               {
                    String printMessage = new String("1. " + satArray[0] + "\n2. " + satArray[1] + "\n3. " + satArray[2] + "\n4. " + satArray[3] + "\n5. " + satArray[4]);
                    JOptionPane.showMessageDialog(null, printMessage, "Satellites", JOptionPane.PLAIN_MESSAGE);
               } // end of actionPerformed
          }); // end of addActionListener


          main2 = new JButton("Select a Satellite");
          add(main2);
          main2.addActionListener(new ActionListener()
          {
               public void actionPerformed(ActionEvent event)
               {
                     JOptionPane.showOptionDialog(null, "Select a Satellite: ", "Satellites", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, selOptions, null);
               } // end of actionPerformed
          }); // end of addActionListener

          main3 = new JButton("Calculate Velocity and Period");
          add(main3);
          main3.addActionListener(new ActionListener()
          {
               public void actionPerformed(ActionEvent event)
               {
                    String vpdMessage = new String("Orbit Velocity: " + fmt.format(sat1.getVel()) + " m/s\nOrbit Period: " + fmt.format(sat1.getPeriod()) + " s");
                    JOptionPane.showMessageDialog(null, vpdMessage, "Orbit Velocity and Period", JOptionPane.PLAIN_MESSAGE);
               } // end of actionPerformed
          }); // end of addActionListener

          main4 = new JButton("Change Orbit");
          add(main4);
          main4.addActionListener(new ActionListener()
          {
               public void actionPerformed(ActionEvent event)
               {
                    String orbMessage = new String("Select a new orbit: ");
                    JOptionPane.showOptionDialog(null, orbMessage, "Orbit Selection", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, orbOptions, null);
               } // end of actionPerformed
          }); // end of addActionListener

          main5 = new JButton("Change Power");
          add(main5);
          main5.addActionListener(new ActionListener()
          {
               public void actionPerformed(ActionEvent event)
               {
                    /*PowMenu powFrame = new PowMenu();
                    powFrame.setVisible(true);
                    powFrame.setSize(600, 200);*/
                    JOptionPane.showOptionDialog(null, "Select a power type:", "Power Selection", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, powOptions, null);

               } // end of actionPerformed
          }); // end of addActionListener

     } // end of constructor

     public static void main(String[] args)
       {
          satArray[0] = new Satellite("ISS", "Low Earth Orbit", 408773);
          satArray[1] = new Satellite("Halley's Comet", "Solar Orbit", 5.24789e12);
          satArray[2] = new Satellite("Hubble Space Telescope", "Low Earth Orbit", 568000);
          satArray[3] = new Satellite("James Webb Space Telescope", "Solar Orbit", 1500000000);
          satArray[4] = new Satellite("Mars Reconnaissance Orbiter", "Mars Orbit", 450000);

          powOptions[0] = new JButton("Nuclear");
          powOptions[1] = new JButton("Solar");
          powOptions[2] = new JButton("Battery");

          sat1 = satArray[0];

          selOptions[0] = new JButton(satArray[0].satName);
          selOptions[0].addActionListener(new ActionListener()
          {
               public void actionPerformed(ActionEvent event)
               {
                    sat1 = satArray[0];
               } // end of actionPerformed
          }); // end of addActionListener
          selOptions[0].setEnabled(true);

          selOptions[1] = new JButton(satArray[1].satName);
          selOptions[1].addActionListener(new ActionListener()
          {
               public void actionPerformed(ActionEvent event)
               {
                    sat1 = satArray[1];
               } // end of actionPerformed
          }); // end of addActionListener
          selOptions[1].setEnabled(true);

          selOptions[2] = new JButton(satArray[2].satName);
          selOptions[2].addActionListener(new ActionListener()
          {
               public void actionPerformed(ActionEvent event)
               {
                    sat1 = satArray[2];
               } // end of actionPerformed
          }); // end of addActionListener
          selOptions[2].setEnabled(true);

          selOptions[3] = new JButton(satArray[3].satName);
          selOptions[3].addActionListener(new ActionListener()
          {
               public void actionPerformed(ActionEvent event)
               {
                    sat1 = satArray[3];
               } // end of actionPerformed
          }); // end of addActionListener
          selOptions[3].setEnabled(true);

          selOptions[4] = new JButton(satArray[4].satName);
          selOptions[4].addActionListener(new ActionListener()
          {
               public void actionPerformed(ActionEvent event)
               {
                    sat1 = satArray[4];
               } // end of actionPerformed
          }); // end of addActionListener
          selOptions[4].setEnabled(true);

          orbOptions[0] = new JButton("Solar Orbit");
          orbOptions[0].addActionListener(new ActionListener()
          {
               public void actionPerformed(ActionEvent event)
               {
                    sat1.updateOrbitType(0);
               } // end of actionPerformed
          }); // end of addActionListener

          orbOptions[1] = new JButton("Earth Orbit");
          orbOptions[1].addActionListener(new ActionListener()
          {
               public void actionPerformed(ActionEvent event)
               {
                    sat1.updateOrbitType(1);
               } // end of actionPerformed
          }); // end of addActionListener

          orbOptions[2] = new JButton("Mars Orbit");
          orbOptions[2].addActionListener(new ActionListener()
          {
               public void actionPerformed(ActionEvent event)
               {
                    sat1.updateOrbitType(2);
               } // end of actionPerformed
          }); // end of addActionListener

          if (sat1.getOrbitType() == 1) {
               sat1.updateVel(Math.sqrt((Satellite.G * Satellite.E_MASS) / (sat1.orbitDist + Satellite.E_RAD)));
          }
          else if (sat1.getOrbitType() == 2) {
               sat1.updateVel(Math.sqrt((Satellite.G * Satellite.M_MASS) / (sat1.orbitDist + Satellite.M_RAD)));
          }
          else {
               sat1.updateVel(Math.sqrt((Satellite.G * Satellite.SOL_MASS) / (sat1.orbitDist + Satellite.SOL_RAD)));
          }

          // period calculations based on orbit
          if (sat1.getOrbitType() == 1) {
               sat1.updatePeriod((2 * Math.PI * (sat1.orbitDist + Satellite.E_RAD)) / sat1.getVel());
          }
          else if (sat1.getOrbitType() == 2) {
               sat1.updatePeriod((2 * Math.PI * (sat1.orbitDist + Satellite.M_RAD)) / sat1.getVel());
          }
          else {
               sat1.updatePeriod((2 * Math.PI * (sat1.orbitDist + Satellite.SOL_RAD)) / sat1.getVel());
          }

          OrbitsGUI frame = new OrbitsGUI();
          frame.setTitle("Satellites GUI");
          frame.setLocationRelativeTo(null);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setSize(400, 200);
          frame.setBackground(Color.lightGray);
          frame.getContentPane().setBackground(Color.lightGray);
          frame.setVisible(true);
       } // end of main

} // end of class
