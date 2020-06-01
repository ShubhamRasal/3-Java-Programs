
/********************************************************
*
*  1. This program demonstrate concept of Abstract class
*  2. If we do not want any one to create the object of a 
*	class, we have to use the concept of "abstract class"
*	or "abstract method".
*  3. If a method is abstract then we have to define it
* 	 in the derived class.
*
*
********************************************************/

import java.lang.*;

abstract class Base
{
	public abstract void gun();		// abstract method
 						
	void fun()		// concrete method
	{
		System.out.println("In fun of abstract class::  base");
	}
}

class Demo extends Base
{
	public void gun()
	{
		System.out.println("In gun of Demo class");
	}
}

class Abstract_Class
{
	public static void main(String args[])
	{	
		Demo dobj = new Demo();	
		dobj.fun();	// fun() of base class is called.
		dobj.gun();	//gun() of demo class is called.
	}
}


/**************************************************************
*
*	OUTPUT :
*		In fun of abstract class :: base
*		In gun of Demo class
*
**************************************************************/
