/********************************************************
*
*  1.This program demonstrate that every class in java is
*	directly or indirectly inherited from Object class	
*
*  2.Object class is super class of all classess
*
********************************************************/



import java.lang.*;

// Object class is super class of all classes
class Demo1
{
	public void fun()
	{
		System.out.println("In Demo1 fun");
	}
}

class Object_Class
{
	public static void main(String args[])
	{
		
		

		Demo1 obj1 = new Demo1();
		obj1.fun();

		Demo1 obj2 = new Demo1();

		// getClass() method is used to get the class name
		// for the object

		System.out.println("Class Name is " +obj1.getClass());

		Demo1 obj3 = obj2;

		// equals() is the method of class Object
		// this method is used to check the hashCode()
		// of two objects.

		if(obj3.equals(obj2))
		{
			System.out.println("Both objects are same");
		}
		else
		{
			System.out.println("Both objects are diffrent");
		}
	
	}
}

/**************************************************************
*
*	OUTPUT :
*		In Demo1 fun
*		Class Name is class Demo1
*		Both objects are same
**************************************************************/
