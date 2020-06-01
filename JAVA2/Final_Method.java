
/********************************************************
*
*	1.This program demonstrates the concept of final method
*	2. final method is such a method which we cannot
*		override
********************************************************/

import java.lang.*;

class Base
{
	int i;
	int j;
	Base()
	{
		i = 10;
		j = 10;
	}

	final void fun()
	{
		System.out.println("Inside final method");
	}
}

class Derived extends Base
{
	//We can not override final method
/*
	void fun()
	{
		System.out.println("Inside final method");
	}
*/
}

class Final_Method
{
	public static void main(String args[])
	{
		Base b = new Base();
		b.fun();
	}
}