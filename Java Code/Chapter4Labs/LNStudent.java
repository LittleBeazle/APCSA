class LNStudent
{
    String name;
    private String StudentID;
    int classnum;
    int age;
    private double gpa;
    private int phonenum;
    private int nrwriteups;	// number of discipline referrals

  public LNStudent(String sname, String sid, int clas, int phnumber)
  {
     name = sname;
     StudentID = sid;
     classnum = clas;
     phonenum = phnumber;
  }   // end of constructor

// paragraph 3 method code goes below this line
public void recordGPA(double grade)  {
     gpa = grade;
}
// paragraph 5 method code goes below this line
public int addRef(int num)  {
     nrwriteups += num;
     return nrwriteups;
}
// paragraph 8 method code goes below this line
public String toString()  {
     return ("Name: " + name + "\nStudent ID: " + StudentID + "\nClass: " + classnum + "\nPhone: " + phonenum + "\nGPA: " + gpa + "\nReferrals: " + nrwriteups); 
}

}  // end of class
