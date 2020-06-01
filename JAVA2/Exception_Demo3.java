/***********************************************
* 	> This program demonstrates the Use of Multiple Catch block
*
*	> This program on compilation gives error because,
*	 as there exception occurs, the exception is caught in
*	 first catch block.
*
*	and the second catch block catches the same exception which *	is already handled by the first catch block
*
*	> therefore this program gives error
*
*
*****************************************************/

import java.lang.*;

//When we run this application it generates exception
class Exception_Demo3
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

		catch(Exception e)
		{
			System.out.println("Inside First catch block");
			System.out.println(e);	
		}
		
		// Due to this catch block there is an error because 
		// the exception is already cought
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Inside second catch block");
			System.out.println(e);	
		}
	}
}