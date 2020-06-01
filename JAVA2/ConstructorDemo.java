/*********************************************
*		This program demonstrates the concept of constructor
*	1. constructor is a named block which is used to initialize an object of of a class
*		immediately after created.
*	2. constructor do not have return type
*	3. constructor iN java is same as constructor is C++
*	4. only the difference is java is that it doesn't have copy constructor.

**********************************************/

class Demo{
	
	public Demo()
	{
			System.out.println("Inside Default Constructor...");
	}
	
	public void Demo()		// this is method because it has a return type
	{
		System.out.println("Inside Method of a Class Demo...");

	}
	public Demo(int x)
	{
		if(x<10)
			return;		//you can use return statement in a constructor
						// to end the call to a construcotr	if the input value is less than the  value given int the if condition
		System.out.println("one parameter constructor with interger as a parameter  gets called...");
	}
	
	public Demo(String s)
	{
			System.out.println("one parameter constructor with String as a parameter  gets called..");
	}

}

class ConstructorDemo{

	public static void main(String args[])
	{
		Demo d1 = new Demo();	// default constructor gets called
		Demo d2 = new Demo(10);	// one parameter constructor with interger as a parameter  gets called
		Demo d3 = new Demo(7);	// call to a constructor with value less than 10 ends but the object is created.
		d3.Demo();				// this method gets called
		Demo d4 = new Demo("hello");// one parameter constructor with string as a parameter  gets called
		d1.Demo();

		}

}
