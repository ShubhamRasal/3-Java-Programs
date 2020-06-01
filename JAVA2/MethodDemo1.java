/********************************************************
*
*	This program demonstrate the concept of methods in java
*
*	More generally, method declarations have six components, in order:
*	1.Modifiers—such as public, private, and others you will learn about later.
*	2.The return type—the data type of the value returned by the method, or void if the method does not return a value.
*	3.The method name—the rules for field names apply to method names as well, but the convention is a little different.
*	4.The parameter list in parenthesis—a comma-delimited list of input parameters, preceded by their data types, enclosed by parentheses, ().
*		 If there are no parameters, you must use empty parentheses.
*	5.An exception list—to be discussed later.
*	6.The method body, enclosed between braces—the method's code, including the declaration of local variables, goes here.
*
********************************************************/

class Method{

	int x,y;
	int i =10;
	int j =20;
	
	Method()
	{
		System.out.println("Default Constructor...");
	}
	
	public void fun()
	{
		System.out.println("This is the public method...");
				System.out.println("Value of i is : "+i+" j is : "+j);
	}
	// we can also overload the methods
	// overloading means same name, different forms
	
	public void gun()
	{
		System.out.println("This is the non parameterized gun...");
	}
	//Overloaded methods are differentiated by the number and the type of the arguments passed into the method.
	public void gun(int x)
	{
		System.out.println("This is the parameterized gun...");
	}
	
	//Note: Overloaded methods should be used sparingly, as they can make code much less readable.

}

class MethodDemo1{

	public static void main(String args[])
	{
		Method obj = new Method();
		obj.fun();
		obj.gun();
		obj.gun(10);
	}


}