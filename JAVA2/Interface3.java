/********************************************************
*
*	1.This program demonstrate that a class can be implemented
*	  from multiple interfaces
*
*
********************************************************/


import java.lang.*;

// Interface contains only abstract methods and 
// final data members


interface DemoInterface1
{
	void fun();
}

interface DemoInterface2
{
	void gun();
}

// One class can implement multiple interfaces
class BaseClass implements DemoInterface1,DemoInterface2
{
	int i;
	int j;

	BaseClass()
	{
		i = 10;
		j = 10;
	}
	
	// Implemented method from demoInterface1
	
	public void fun()
	{
		System.out.println("Inside implemented method fun");
	}

	// Implemented method from demoInterface2
	
	public void gun()
	{
		System.out.println("Inside implemented method gun");
	}

}

class Interface3
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
*		Inside implemented method fun
*		Inside implemented method gun
*
**************************************************************/
