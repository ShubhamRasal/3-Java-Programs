////////////////////////////////////////////////////////
//
/** This program demonstrate that the static block
*	is executed even before constructor,
*	 when we create object of *	the class;	
*
*
*///////////////////////////////////////////////////////////////


import java.lang.*;
class Demo
{
	// If static block is written then it gets executed before main
	static
	{
		System.out.println("Inside static");
	}
	Demo()
	{
		System.out.println("Inside constructor");
	}
}

class Block_Static2
{
	public static void main(String args[])
	{
		Demo d = new Demo();
		System.out.println("Inside main");
	}
}


/************************************************* 
*	output:
*		Inside static
*		Inside constructor
*		Inside main
*
*****************************************************/