

/********************************************************
*
*	Over-riding using private :
*
*	This program demonstrates that  If method is declared as 
*	Private in base class then we cant  override that method
*    from derived class.

********************************************************/


import java.lang.*;

 

class Base
{	
	private void fun()
	{
		System.out.println("Inside private method");
	}
	
	// We can overload the private method
	public void fun(int i)
	{
		System.out.println("Inside private method2");
	}
	
}

// If that private method is defined in derived class then both the copies from base and derived class are considered as diffrent copy.

class Derived extends Base
{
	private void fun()
	{
		System.out.println("Inside private method");
	}
}
class Overriding_private
{
	public static void main(String args[])
	{
		Derived dobj = new Derived();
		dobj.fun(10);

	}
}