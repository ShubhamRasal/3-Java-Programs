/****************************************************
* This program demonstrate the use of static block
*	If we want to execute our code before main in java
*	we can do it with the help of static block
*
***************************************************/




import java.lang.*;

class Block_Static
{
	// this block executes first

	static
	{
		System.out.println("Inside static");
	}

		// this block executes after static block
	public static void main(String args[])
	{
		System.out.println("Inside main");
	}

}



/******************************************************
* OutPut :
*
*	Inside Static 
*	Inside Main
**************************************************************/