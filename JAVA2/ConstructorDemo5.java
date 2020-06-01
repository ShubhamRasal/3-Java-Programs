/********************************************************
*
*	This program demonstrate the concept of constructor
	1. As in c++ we provide definations for all constructor
		if we provide even a single constructor
	2. We have to do he same in java
********************************************************/
class Demo{

//	Demo()
//	{
//		System.out.println("default construcotr....");
//	}
	Demo(int x)
	{
		System.out.println("one parameter constructor...");
	}
	Demo(String s)
	{
		System.out.println("one parameter constructor with parameter as a string...");
	}
}
class ConstructorDemo5{
	public static void main(String args[])
	{
	//	Demo d1 = new Demo();	// error
		Demo d2 = new Demo(10);
	}



}