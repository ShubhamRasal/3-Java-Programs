/********************************************************
*
*	1. This program demonstrate the concept of method 
*		Abstraction
*	2. If method is declared as Private then we cant 
*		access the method from outside the class which is 
*		called as 	method abstraction.
*	3. Methods which helps in method abstraction can be *			called as "helper methods" 
*
*	NOTE : abstract and abstraction are two different 
*		 concepts
*
********************************************************/


import java.lang.*;

class Demo
{
	

	// Behaviour
	private void Function()// Method Abstraction
	{
		System.out.println("Inside private method");
	}

	public void gun()
	{
		System.out.println("Inside public method");
		// We can call private method from class
		Function();
	}
	
}

class Method_Abstraction
{
	public static void main(String args[])
	{
		Demo obj = new Demo();

		// We can not call private method
		// obj.Function();	// not allowed
		obj.gun();	
	}
}

/**************************************************************
*
*	OUTPUT :
*		Inside public method
*		Inside private method
*
*************************************************************/
