//////////////////////////////////////////////////////////////

/**	1.	This program demonstrate that the static block is
* 		executed before, public static void main()
*
* 	2.	There can be multiple static blocks before and after 
*		main
*
*	3.	All the Static blocks execute before main	
*/////////////////////////////////////////////////////////////


import java.lang.*;

class Block_Static_Multiple
{
	static
	{
		System.out.println("Inside static1");
	}

	static
	{
		System.out.println("Inside static2");
	}
	public static void main(String args[])
	{
		System.out.println("Inside main");
	}
	static
	{
		System.out.println("aafter main");
	}	
}



/////////////////////////////////////////////////
//	output :
//		Inside static1
//		Inside static2
//		after main
//		Inside main
//
////////////////////////////////////////////////////////