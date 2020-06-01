/********************************************************
*
*	1.This program demonstrate the concept of Abstract class
*		and interface together
*	2. In Abstract class if the method is concrete then there *	  is no need to provide definition in dervived class. 
*	3. If definition is privided for concrete method,
*		it is called as over-riding.	
********************************************************/


import java.lang.*;

// Interface contains only abstract methods and 
// final data members

abstract class Demo
{
	abstract void fun();
		void mun()
		{
			System.out.println("inside abstract mun");

		}
//   void abstract_fun();	// definition is must for this method
}	

interface DemoInterface2
{
	void gun();
}

// One class can implement interfaces as well as extends the  class
class BaseClass extends Demo implements DemoInterface1 
{
	int i;
	int j;

	BaseClass()
	{
		i = 10;
		j = 10;
	}
	
	// Implemented method from interface
	public void fun()
	{
		System.out.println("Inside implemented method fun");
	}

	// Implemented method from interface
	public void gun()
	{
		System.out.println("Inside implemented method gun");
	}
	void mun()
	{
		System.out.println("Base class mun()");

	}
}

class Interface4
{
	public static void main(String args[])
	{
		BaseClass b = new BaseClass();
		b.fun();
		b.mun();
		b.gun();

		Demo dref = new BaseClass();
		dref.mun();
	}
}




/**************************************************************
*
*	OUTPUT :
*		Inside implemented method fun
*		Base class mun()
*		Inside implemented method gun
*		Base class mun()
*
*
**************************************************************/
