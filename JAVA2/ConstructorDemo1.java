/********************************************************
*
*	This program demonstrates the concept of Calling constructor within a constructor
*	
*
********************************************************/
class Demo{
	
/*
	public Demo()
	{
		Demo(100);	// not allowed.....compile error
	}
*/	
	public Demo()
	{
		// a call to another constructor from the constructor must be immediate.
		//	System.out.println("Inside Default Constructor...");	// error .. call to this must be first statement.	
		this(10);						// we have to use this keyword to call another constructor from a constructor.
	}
		
	public Demo(int x)
	{
			System.out.println("one parameter constructor with interger as a parameter  gets called...");
	}

			// A constructor cannot call itself
/*		Demo(String s)
		{
			this("hello");	// recursion constructor invocation		
		}

*/			
}

class ConstructorDemo1{

	public static void main(String args[])
	{
		Demo d1 = new Demo();	// default constructor gets called
		Demo d2 = new Demo(10);	// one parameter constructor with interger as a parameter  gets called
//		Demo d3 = new Demo("hello");// one parameter constructor with string as a parameter  gets called
	}

}
