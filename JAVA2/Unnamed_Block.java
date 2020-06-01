
/********************************************************
*
*	1.This program demonstrate the concept of unnamed block
*	2.Unnamed block is also known as "Instance Initialization *		block".
*	3. This block is executed before the constructor
*	4. even if the unnamed block is written after
*		constructor,that blocked is always executed before
*		constuctor 
*		
*	5. but if we write unnamed block in the class before
*	  main then that block is not executed. 
*
********************************************************/


import java.lang.*;
class Demo
{
	{
		System.out.println("Inside unnamed 1");
	}
	Demo()
	{
		System.out.println("Inside constructor");
	}
	{
		System.out.println("Inside unnamed 2");
	}
}

class Unnamed_Block
{
	// this block will not execute....
	{
		System.out.println("Before main");
	}
	public static void main(String args[])
	{
		Demo d = new Demo();
		System.out.println("Inside main");
	}
}