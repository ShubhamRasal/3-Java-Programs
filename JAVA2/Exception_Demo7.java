
/********************************************************
*
*	> This program demonstrates that we can create our own 
*		Exception class
*	> for that we just need to extend our class with
*		throwable class
*
********************************************************/

import java.lang.*;

//We can create our own user defined exception class as

class Demo extends Throwable
{
	
	Demo(){}

	Demo(String str)
	{
		super(str);
	}
}

class Exception_Demo7
{

	public static void main(String args[])
	{
		try
		{
			int i = 10;
			if(i == 10)
			{
				throw new Demo();
			}
		
		}
		catch(Demo e)
		{
			System.out.println("Inside catch ");
		}
	}
}