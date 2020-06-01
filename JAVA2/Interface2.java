
/********************************************************
*	1. Interface contains only abstract methods and 
*		 final data members.
*	2. All the data members of an interface must be initialised
*
********************************************************/


import java.lang.*;


interface DemoInterface
{
	// Data members from interface are always public static final

	int i = 10;	// data members must be initialized
	void fun();	// must be defined in the implemented class
}


class BaseClass implements DemoInterface
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
		System.out.println("Inside implemented method");
	}
}

class Interface2
{
	public static void main(String args[])
	{
		BaseClass b = new BaseClass();
		b.fun();

		// We can not create object of interface
		// but we can create its reference
		
		System.out.println("\nreference of interface  pointing to object of class BaseClass\n");
		
		DemoInterface bobj = new BaseClass();
		bobj.fun();

		// As interface member is considered as an static 
		// member
		
		// we can access it by using interface name
		
		System.out.println("Value of the variable is "+DemoInterface.i);
	}
}