
/********************************************************
*
*	> This program demonstrates Exception using "throws" 
*		keyword 
*	> Use of try and catch block,
* 	> try {}	is used to check whether the part of the program 
*		has any exception
*	> And if there is Exception catch block is used to handle 
*		that Exception
********************************************************/


import java.lang.*;
import java.io.*;
import java.util.*;


//When we run this application it generates exception
class Demo
{
	// This function indicates that it may throw an checked excception
	public char fun() throws IOException
	{
		char c='\u0000';
		int i=0;
		Scanner in = new Scanner(System.in);
		i = in.nextInt();
		if(i!=-1)
		{
			c = (char)i;
		}			
		return c;
	}
}

class Exception_Demo5
{

	public static void main(String args[])
	{

		Demo d = new Demo();
	  // try block checks whether Exception occurs in this 
 	  //	code
			
		try
		{
			d.fun();
		}
		// catch block is used to handle that Exception
		catch(IOException e)
		{
			System.out.println("inside catch : ");
		}
	}
}



