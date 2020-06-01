import java.lang.*;

// This program is used to demonsrate how to display contents on screen
class Inner
{
	void Add(int no1, int no2)
	{
		
		System.out.println("Addition is "+ no1+no2);
	}
}

class Printing
{
	public static void main(String args[])
	{
		Inner obj = new Inner();
		obj.Add();
	}
}