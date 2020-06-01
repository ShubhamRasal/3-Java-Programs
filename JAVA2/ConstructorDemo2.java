/********************************************************
*
*	This program demonstrate the Access level modifiers for a constructor
	There are 4 access level modifiers in java
	1.	public :	can be used in any part of a program 
	2.	protected :	can be used in any part of a program,
					in the same package in which its class is declared,
					inside any descendent class in any package.
	3. private :
				only in the same class in which it is declared.
				hold on your doubts for privare access specifier for constructor,
				it will be cleared within next demo program(ConstructorDemo3.java) .
	
	4. default : this is also called as package level access
					in the same package in which its class is declared.
	
		
		the effect of access specifier to constructor is exactly same as the effect of access specifier to method
*
********************************************************/
class Demo{

			// default access specifier
			// package level access
	Demo()
	{
			System.out.println("Defalut constructor of a class is invoked...");
	}
	
			// public access specifier
			// public access level 
	public Demo(int x)
	{
		this(10,20);		// private access specifier constructor gets called here
		System.out.println("Public constructor of a class is invoked...");

		
	}
	
			// protected access specifier
			// package level access
	protected Demo(String s)
	{
			System.out.println("Protected constructor of a class is invoked..");
	}
			// pivate access level
			
	private Demo(int x,int y)
	{
		System.out.println("Private constructor of a class is invoked.....");
	}


}

class ConstructorDemo2{

	public static void main(String args[])
	{
		Demo d1 = new Demo();	// default constructor gets called
		Demo d2 = new Demo(10);
		Demo d3 = new Demo("hello");
//		Demo d4 = new Demo(10,20);
	}
}	