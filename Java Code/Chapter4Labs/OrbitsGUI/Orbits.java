import java.util.Scanner;
import java.lang.Math;

public class Orbits {
     static Scanner scan = new Scanner(System.in);
     static Satellite[] satArray = new Satellite[5];

     public static int mainMenu() {
          System.out.println("\n––––––––––––––––––––––––––––––––––––––––––––");
          System.out.println("|Satellite Orbits Menu                      |");
          System.out.println("|Print all satellites                      1|");
          System.out.println("|Select a satellite                        2|");
          System.out.println("|Calculate satellite velocity and period   3|");
          System.out.println("|Change satellite orbit type               4|");
          System.out.println("|Change satellite power type               5|");
          System.out.println("|Quit                                      0|");
          System.out.println("––––––––––––––––––––––––––––––––––––––––––––\n");

          return scan.nextInt();
     }

     public static int powMenu() {
          System.out.println("\n––––––––––––––––––––––––––––");
          System.out.println("|Please enter a power type  |");
          System.out.println("|Nuclear                   1|");
          System.out.println("|Solar                     2|");
          System.out.println("|Battery                   3|");
          System.out.println("|Back                      0|");
          System.out.println("––––––––––––––––––––––––––––\n");

          return scan.nextInt();
     }

     public static int selSat() {
          int index;
          System.out.println("Enter the array index of a satellite: ");
          index = scan.nextInt();
          return index;
     }

     public static void main(String[] args) {
          int mainOption = 1;
          int powOption;
          boolean done = true;
          Satellite sat1;
          // Satellite sat2, sat3, sat4, sat5;

          satArray[0] = new Satellite("ISS", "Low Earth Orbit", 408773);
          satArray[1] = new Satellite("Halley's Comet", "Solar Orbit", 5.24789e12);
          satArray[2] = new Satellite("Hubble Space Telescope", "Low Earth Orbit", 568000);
          satArray[3] = new Satellite("James Webb Space Telescope", "Solar Orbit", 1.511e11);
          satArray[4] = new Satellite("Mars Reconnaissance Orbiter", "Mars Orbit", 450000);

          sat1 = satArray[0];

          while (mainOption != 0) {
               mainOption = mainMenu();
               switch (mainOption) {
                    case 1:   // prints out the satellites
                         for (int i = 0; i < satArray.length; i++) {
                              System.out.println(satArray[i]);
                         }
                         break;
                    case 2: // selects a new satellite
                         for (int i = 0; i < satArray.length; i++){
                              System.out.println(i + ". " + satArray[i]);
                         }
                         sat1 = satArray[selSat()];
                         System.out.println("You selected " + sat1.satName);
                         break;
                    case 3: // calculates orbit velocity and period
                         // velocity calculations based on orbit
                         if (sat1.getOrbitType() == 1) {
                              sat1.updateVel(Math.sqrt((Satellite.G * Satellite.E_MASS) / (sat1.orbitDist + Satellite.E_RAD)));
                         }
                         else if (sat1.getOrbitType() == 2) {
                              sat1.updateVel(Math.sqrt((Satellite.G * Satellite.M_MASS) / (sat1.orbitDist + Satellite.M_RAD)));
                         }
                         else {
                              sat1.updateVel(Math.sqrt((Satellite.G * Satellite.SOL_MASS) / (sat1.orbitDist + Satellite.SOL_RAD)));
                         }
                         System.out.println(sat1.getVel());

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

                         System.out.println(sat1.getPeriod());
                         break;
                    case 4:
                         int oldType = sat1.getOrbitType(), newType;

                         System.out.println("Current Orbit Type: " + sat1.getOrbitType());
                         System.out.println("Enter new Orbit Type: ");
                         newType = scan.nextInt();

                         sat1.updateOrbitType(newType);
                         if (newType == oldType) {
                              break;
                         }
                         else if (newType == 0) {
                              sat1.updateVel(Math.sqrt((Satellite.G * Satellite.SOL_MASS) / (sat1.orbitDist + Satellite.SOL_RAD)));
                              sat1.updatePeriod((2 * Math.PI * (sat1.orbitDist + Satellite.SOL_RAD)) / sat1.getVel());
                         }
                         else if (newType == 1) {
                              sat1.updateVel(Math.sqrt((Satellite.G * Satellite.E_MASS) / (sat1.orbitDist + Satellite.E_RAD)));
                              sat1.updatePeriod((2 * Math.PI * (sat1.orbitDist + Satellite.E_RAD)) / sat1.getVel());
                         }
                         else if (newType == 2) {
                              sat1.updateVel(Math.sqrt((Satellite.G * Satellite.M_MASS) / (sat1.orbitDist + Satellite.M_RAD)));
                              sat1.updatePeriod((2 * Math.PI * (sat1.orbitDist + Satellite.M_RAD)) / sat1.getVel());
                         }
                         break;
                    case 5:
                         powOption = powMenu();
                         switch (powOption) {
                              case 1:
                                   sat1.updatePower("Nuclear");
                                   break;
                              case 2:
                                   sat1.updatePower("Solar");
                                   break;
                              case 3:
                                   sat1.updatePower("Battery");
                                   break;
                              case 0:
                                   break;
                              default:
                                   System.out.println("Invalid choice");
                                   break;
                         }
                         System.out.println("The power type has been changed to " + sat1.getPowType());
                         break;
                    case 0:
                         System.out.println("Goodbye!");
                         break;
                    default:
                         System.out.println("Invalid choice, try again.");
                         break;
               } // end of switch case
          }
     }
}
