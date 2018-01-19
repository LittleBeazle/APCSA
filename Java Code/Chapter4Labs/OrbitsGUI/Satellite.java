public class Satellite {
     private double orbitPd, orbitVel; // period and velocity of orbit (seconds and m/s, respectively)
     private int orbitType = 1; // object the satellite orbits (0 = Solar, 1 = Earth, 2 = Mars)
     private String powType; // what type of power (battery, solar, nuclear)
     public double orbitDist; // altitude of orbit(m)
     public String satName, orbitName; // satellite name and name of orbit (geostationary, low earth orbit, solar orbit, etc.)

     static final double E_RAD = 6.638e6; // Radius of Earth
     static final double E_MASS = 5.98e24; // Mass of Earth
     static final double G = 6.673e-11; // Gravitational constant
     static final double SOL_RAD = 6.96e8; // Radius of the sun
     static final double SOL_MASS = 1.99e30; // Mass of the sun
     static final double M_RAD = 3.386e6; // Radius of Mars
     static final double M_MASS = 6.4171e23; // Mass of Mars

     public Satellite(String sname, String oname, double dist) {
          satName = sname;
          orbitName = oname;
          orbitDist = dist;
     } // end of constructor

     public double getPeriod() {
          return orbitPd;
     }

     public void updatePeriod(double newPd) {
          orbitPd = newPd;
     }

     public double getVel() {
          return orbitVel;
     }

     public void updateVel(double newVel) {
          orbitVel = newVel;
     }

     public int getOrbitType() {
          return orbitType;
     }

     public void updateOrbitType(int newOT) {
          orbitType = newOT;
     }

     public String getPowType() {
          return powType;
     }

     public void updatePower(String newPow) {
          powType = newPow;
     }

     public String toString() {
          return ("Name: " + satName + "; Orbit Name: " + orbitName + "; Altitude: " + orbitDist);
     }
}
