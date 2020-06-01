
/********************************************************
*
*	This program demonstrate concept of Access specifier in java related to methods
*	1. public    :can be Accessed in any part of the program
*	2. private   :can be accessed only within the class
					these type of methods are also called as helper methods
*	3. protected : can be accessed in any part of the program
					and within the package
*	4. default   : can be used inside the same package in which its class is declared.

********************************************************/

class Demo{

	Demo()
	{
		System.out.println("Default constructor...\n");
	}
		// public access specifier, can be accessed any where in any part of the program
	public void pub()
	{
		System.out.println("This is the public method and can be accessed in any part of a program...\n");
	}
	// private access specifier,can be accessed only within the class
	private void pri()
	{
		System.out.println("this is private method and can be accessed only wihtin the class...");
	}
		//protected access specifier,can be accessed within the package
	protected void pro()
	{
		System.out.println("this is protected and can be accessed within its package...\n");
	}
	void def()
	{
		System.out.println("this is default and can be accessed in the same package....\n");
	}

	// static method
	public static void method()
	{
		System.out.println("This is static method and can be called without creating object..\n");
	}
	public void main()
	{
		System.out.println("This indicates that there can be multiple main in a program...\n");
	}
}

class MethodDemo2{

	public static void main(String args[])
	{
		Demo.method();
		Demo dobj = new Demo();
		dobj.pub();	// allowed
	//	dobj.pri();	// not allowed
		dobj.pro();	// allowed
		dobj.def();	// allowed
		dobj.main();
	}


}