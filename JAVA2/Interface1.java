

/********************************************************
*
*	This program demonstrate the concept of "interface"
*	
*	1. Interface contains only abstract methods and 
*	  final data members.
*	2. We cannot create object of interface.
	3. All the methods and variables inside interface
*		are by default public.
*	4. All the characteristics of interface are by default 
*			static and final.
*	5. The difference between abstract class and interface,
*		we cannot use multiple inheritance in case of 
*		abstract class which can be acheived by interface
*	ie. A single class can implement multipe interfaces
*
*	6. We have to provide definations for all the methods of 
*	interface in the implemented class.

********************************************************/



import java.lang.*;

	
interface DemoInterface
{
	void fun();
	void gun();
//	void mun();	// if we remove the comment for this 
				// method and do not provide defination
			// in the implemented class it gives error

}

class BaseClass implements DemoInterface
{
	int i;
	int j;

	BaseClass()
	{
		i = 10;
		j = 10;
	}
	
	// Implemented methods from interface
		
	public void fun()
	{
		System.out.println(" fun() is implemented");
	}
	
	// we also have to provide access specifier(public only)
	// to provide defination id implemented function
	
	// void gun()	//	not allowed
	//	{
	//	
	//	}

	public void gun()
	{
		System.out.println("gun() is implemented");

	}
}

class Interface1
{
	public static void main(String args[])
	{
		BaseClass b = new BaseClass();
		b.fun();
		b.gun();
	}
}


/**************************************************************
*
*	OUTPUT :
*	fun() is implemented
*	gun() is implemented
*
*************************************************************/
