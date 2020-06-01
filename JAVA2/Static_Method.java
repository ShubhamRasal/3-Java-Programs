
/********************************************************
*
* 1.	This program demonstrates the use of static method
* 	
* 2. static method is such a method which can be called without
*	 creating the object of a class
********************************************************/

import java.lang.*;

class Demo
{
	static int i;
	int j;
	Demo()
	{
		System.out.println("INside Demo() constructor...");
		i = 10;
		j = 10;
	}
	static void fun()
	{
		System.out.println("Inside static method");
		System.out.println("Value of i : " +i );

		// Static function can access only static members
		//System.out.println("Value of j : " +j );
	} 
	void gun()
	{
		System.out.println("Inside non static method");
		System.out.println("Value of i : " +i );

		System.out.println("Value of j : " +j );
	} 
}

class Static_Method
{
	public static void main(String args[])
	{
		Demo d1 = new Demo();
		d1.fun();
		// We can call static method using class name
		Demo.fun();

		d1.gun();

}
}