/*****************************************************
*
* 1. This program demonstrate the concept of encaplsulation
* 2.	Binding characteristics(data types) and Behaviours(Methods)
*	 together is called as encapsulation
*
*********************************************************/

import java.lang.*;

class Demo
{
	// Characteristics
	int i = 10;

	// Behaviour
	void Function()
	{
		System.out.println("Inside function");
	}
	
}

class Encapsulation
{
	public static void main(String args[])
	{
		Demo obj = new Demo();
		obj.Function();
		System.out.println("Value of i is : " + obj.i);
	}
}