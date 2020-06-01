/*******************************************
*
*	1.	This program Demonstrates Exception handling 	
*		Explicitly	by the Programmer
*
*	2. To catch the Exception we need to write it inside try
*		block	
*	3. If the Exception is implicitly then there is no need of *	a try, catch block.
*
*************************************************/

import java.lang.*;

//When we run this application it generates exception
class Exception_Demo2
{

	public static void main(String args[])
	{
		try
		{
			System.out.println("Inside try block");
			int arr[] = {10,20,30,40};
			System.out.println("Inside main"+arr[6]);
			System.out.println("After getting exception");
		}

		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Inside catch block");
			System.out.println(e);	
		}
		System.out.println("After Catch block");		
	}
}

/****************************************************
*	OUTPUT :
*	
*	Inside try block
*	Inside catch block
*	java.lang.ArrayIndexOutOfBoundsException :6
*	After Catch block
*************************************************/
		