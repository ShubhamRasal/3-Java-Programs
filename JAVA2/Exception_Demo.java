/***********************************************
**
**	1.	This program demonstrates the concept
**		of Exception
**	Pre-requisite :
**	2. you should know what Exception is???
**	3. Whst is checked and unchecked Exception?.
**
*************************************************/

import java.lang.*;

//When we run this application it generates exception
class Exception_Demo
{

	public static void main(String args[])
	{
			// there are 4 elements in array.
		int arr[] = {10,20,30,40};	
		
	// we are trying to print the Sixth element of array...
	// therefore Exception is implicitly handled here by JVM.

		System.out.println("Inside main"+arr[6]);
	}
}


