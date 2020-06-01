
/********************************************************
*
*	This program demonstrate the concept of finally
*	
*	1. finally is such a block which is always executed
*	2. If a try block has some Exception
* 		and we have multiple catch block
*	 	if those multiple catch blocks are unable to handle 
*		those Execution then we use finally block.
*	3. Even if the Exception is handled in any of the catch 
*		block the finally block gets Executed ,because finally 
*		is always Executed 
********************************************************/

import java.lang.*;

//When we run this application it generates exception
class Exception_Demo8	
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
		// finally block always get executed
		finally
		{
			System.out.println("Inside finally block");	
		}
		System.out.println("After finally block");		
	}
}