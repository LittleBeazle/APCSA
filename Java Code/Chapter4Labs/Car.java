import java.util.Scanner;

/************************************************
 *  File:		Car
 *  Author:		J.Foy
 *  Created:		9/24/2016
 *  Defines a class used in Ch4Demo program
 *  Revision History
 *  	Rev 0:	Initial Release
 *
 */

public class Car
{
	String Owner;  // owner's first name
	String Make;   // Chrysler, Toyota, etc.
	String Model; // 300, RAV4, etc.
	int Mpg_hwy;
	int Year;
	private int Mileage;
	String Color = "pink";
	private int Value;
	private int Vin;
	static int dpayment;


	 // constructor, it initializes instance variables
	 public Car(String cowner, String cmake, String cmodel, int miles,
		int cmpghwy, int cyr, int cvalue, int cvin)
	 {
	  Owner = cowner;
	  Make = cmake;
	  Model = cmodel;
	  Mileage = miles;
	  Mpg_hwy = cmpghwy;
	  Year = cyr;
	  Value = cvalue;
	  Vin = cvin;
	}  // end of constructor


	public int getValue()   // this method returns an integer
	{
	 return Value;
	}

	// following method does not return a value, but it is called with a value
	// exploration 8
	public void adjustValue(int svalue)
	{
	  Value+=svalue;
		if (Value < 0)
			Value = 0;
	}

	// exploration 9
	public void readInfo()
	{
		System.out.println("VIN: " + Vin);
		System.out.println("Make: " + Make);
		System.out.println("Model: " + Model);
	}

	// exploration 10
	public int getMileage()
	{
		return Mpg_hwy;
	}

	public void changeMileage(int dMpgValue)	{
		Mpg_hwy = dMpgValue;
	}
// following method is used to who is at fault when a car strikes
// a second car.  Car c1 is the second car

	public String fault(Car c1)
	{
    String baddriver;

	if ((c1.Owner).equalsIgnoreCase("crattie") ||
		(this.Owner).equalsIgnoreCase("crattie"))
		baddriver = "Crattie";
	else baddriver = this.Owner;
	return baddriver;
	} // end of method fault

	public boolean bothTotaled(Car c1)
	{
	 boolean bothdone;
	 int v1, v2;

	 v1 = c1.Value;
	 v2 = this.Value;
	 bothdone = ((v1 <= 0) && (v2 <= 0));
	 return bothdone;
	}  // end of method wreck

} // end of class
