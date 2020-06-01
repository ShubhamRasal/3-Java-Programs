
/********************************************************
*
*	1.This program demonstrates the concept of final 
*		member
*	2. Final member is such a member whose value cannot 
*		be changed	
*	3. const member in c++ is same as final member
*		in java
*
********************************************************/

import java.lang.*;

class Demo
{
	// Characteristics
	// If member is final then it must be initialised otherwise 		 it is error
	final int i=10;		// allowed

	// we can also initialize the final member after is 	
	//  declaration, but that member has to be initialized in
	//	instance initialization block

	final int j;
	{
	 j =30;	// allowed
	}
// but once initialized its value cannot be changed
	// final int z=50;
	//	z=50;		// not allowed
}

class Final_member
{
	public static void main(String args[])
	{
		Demo obj = new Demo();
		int x=10;
		assert x>=9;	
		System.out.println("Value of i is" + obj.i);
		System.out.println("Value of j is" + obj.j);
		
		// We cant change value of final variable	
		//	obj.i++;
		
	}

}