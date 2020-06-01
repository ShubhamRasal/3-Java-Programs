
/********************************************************
*
* 1.	This program demonstrate the concetp of virtual riding.
* 2. In java by default all the methods except static and final
*	are virtual.
* 3. to achieve this concept in c++ we have to use 
*	"virtual" keyword.

* 4. Over-riding concept can be achieved only with the help of 
*	inheritance and upcasting(base class reference pointing
	to derived class object.)
*
********************************************************/

import java.lang.*;

class Base
{
	void fun()
	{
		System.out.println("In Base fun");
	}
}

class Derived extends Base
{
	void fun()
	{
		System.out.println("In Derived fun");
	}
}

class Overriding
{
	public static void main(String args[])
	{	
		Base bobj = new Base();
		bobj.fun();	// fun() of base class
	
		Base bobj1 = new Derived();
		bobj1.fun();	// fun() of derived class

		Derived dobj = new Derived();
		dobj.fun();	// fun() of derived class
	}
}

/**************************************************************
*
*	OUTPUT :
*		In Base fun
*		In Derived fun
*		In Derived fun
**************************************************************/
