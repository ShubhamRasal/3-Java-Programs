/********************************************************
*
*	>This program demonstrates the concept of "throws" keyword.
*	>This keyword is used when your method can throw an
*		excception 	
*	> you should only throw checked Exception from a method as 
* 		a good programming practice. 
*
*	note : In c++, a function may throw any exception if
*			no throw specification is given, 
*	 	 In java,a method without a throws specifier
*		may not throw any checked Exception				
********************************************************/


import java.lang.*;

//When we run this application it generates exception
class Demo
{
	// This function indicates that it may throw an checked excception
	void fun() throws Exception
	{
		int arr[] = {10,20};
		System.out.println("Inside fun"+arr[5]);
	}
	
}

class Exception_Demo6
{

	public static void main(String args[])
	{
		Demo d = new Demo();
		// We can catch the exception which is generated from function
		try
		{
			d.fun();
		}
		catch(Exception e)
		{
			System.out.println("Inside catch : ");

			e.printStackTrace();	
			
			// This method is used to print all the details 				//of the Exception
			// eg..what is the type of exception,
			// where the exception has occured
			
			 
		}
	}
}