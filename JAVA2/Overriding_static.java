
/********************************************************
*
* 1.	This program demonstrate static method overriding
* 2.	 When we override the static method the call gets decided at 
*	compile time because to call static method there is no need *	to create an object.
* 3. Concept of over riding is not applied on static methods.
*	
********************************************************/

import java.lang.*;

 
class Base
{
	static void fun()
	{
		System.out.println("In Base fun");
	}
}

class Derived extends Base
{
	static void fun()
	{
		System.out.println("In Derived fun");
	}
}

class Overriding_static
{
	public static void main(String args[])
	{	
		Base bobj = new Base();
		bobj.fun();	// fun() of base
	
		Base bobj1 = new Derived();
		bobj1.fun();	// fun() of base

		Derived dobj = new Derived();
		dobj.fun();		// fun() of derived.
	}
}

/**************************************************************
*
*	OUTPUT :
*		In Base fun
*		In Base fun
*		In Derived fun
*
**************************************************************/
