/********************************************************
*
*	This program demonstrates the use of throw keyword
*	If we want to throw another Exception from an Exception
*	we can use throw keyword.
*
*
********************************************************/

import java.lang.*;

//When we run this application it generates exception
class Exception_Demo4
{

	public static void main(String args[])
	{
		try
		{
			System.out.println("Inside try block");
			// We can explicitely throw an exception
			// using throw keyword

			ArrayIndexOutOfBoundsException obj;
			obj = new ArrayIndexOutOfBoundsException("New exception");
			throw obj;	
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Inside second catch block");
			System.out.println(e);	
		}
	}
}


/**************************************************************
*
*	OUTPUT :
*		Inside try block
*		Inside second catch block
*		java.lang.ArrayIndexOutOfBoundsException: New 
*		exception
*
*
*
**************************************************************/