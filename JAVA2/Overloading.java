/********************************************************
*
* 1.	This program demonstrate the concept of overloading
*
* 2. Overloading can be achieved within the class only	
*
* 3. To achieve overloading there should be atleast two 
*	methods with same name but diferent parameters.
* 4. Overloading cannot be achieved by its return value.
* 
********************************************************/


import java.lang.*;

class Demo1
{
	void fun()
	{
		System.out.println("In Demo1 fun");
	}
	void fun(int i)
	{
		System.out.println("In Demo1 fun1");
	}
	void fun(int i, int j)
	{
		System.out.println("In Demo1 fun2");
	}
}

class Overloading
{
	public static void main(String args[])
	{	
		Demo1 obj1 = new Demo1();
		obj1.fun();
		obj1.fun(10);
		obj1.fun(10,20);
	}
}


/**************************************************************
*
*	OUTPUT :
*		In Demo1 fun
*		In Demo1 fun1
*		In Demo1 fun2
*
**************************************************************/
