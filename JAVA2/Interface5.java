
/********************************************************
*
*	This program demonstrate that one interface can extend 
*	another interface.
*
*	note : we can "implements" the interface not "extend"	
*
********************************************************/


import java.lang.*;

// Interface contains only abstract methods and 
// final data members

interface DemoInterface1
{
	void fun();
}

// One interface can extends another interface
interface DemoInterface2 extends DemoInterface1 
{
	void gun();
}

class BaseClass implements DemoInterface2
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
}

class Interface5
{
	public static void main(String args[])
	{
		BaseClass b = new BaseClass();
		b.fun();

		b.gun();
	}
}


/**************************************************************
*
*	OUTPUT :
*			Inside implemented method fun
*			Inside implemented method gun
*
*
**************************************************************/
