public class BandBooster  {

  // Instance data
  String name;
  int numBoxes;

  // constructor
  public BandBooster(String boostName)  {
    name = boostName;
    numBoxes = 0;
  } // end of constructor

  public String getName() {
    return name;
  } // end of getName

  public void updateSales(int boxes)  {
    numBoxes += boxes;
  } // end of updateSales

  public String toString()  {
    return (name + ":\t" + numBoxes + " boxes");
  } // end of toString

} // end of class
