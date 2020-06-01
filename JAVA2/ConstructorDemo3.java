/********************************************************
*
*	This program demonstrate the use of private constructor and singleton class
*
********************************************************/


class Demo{
	
			// static member of class which creates the object for the class
			// only single object is created because of this member
	private static Demo instance = new Demo();
	
			// private access specifier
	private Demo()
	{
		System.out.println("this is singleton class... ");
		System.out.println("you can create only one object... ");
	}

		// method used to return the object of the class which is created by a static member of a class
	public static Demo getInstance()
	{
			return Demo.instance;
	}

}

class ConstructorDemo3{

	public static void main(String args[])
	{
	//	Demo d1 = new Demo();	// private constructor is not called
		Demo d2 = Demo.getInstance();
	}

}