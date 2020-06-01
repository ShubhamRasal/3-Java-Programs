
/********************************************************
*
*	1.This program demonstrates the concept of static member
*	
*	2. memory for static variable is not allocated in the layout
*		 of a classThe memory for static variable in a class 
*		is shared by all the object of the same class.
*
*	3. Static member is such a member which we can call without 
*		creating object of a class.
*
*	4. if we change the value of static variable in one object 
*		class it changes for the object for the other class as 
*		well
*
********************************************************/


import java.lang.*;

class Demo
{
	static int i;	// this variable will be shared by all the
				// objects of the class
	int j;
	Demo()
	{
		i = 10;
		j = 10;
	}
}

class Static_Member
{
	public static void main(String args[])
	{
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		System.out.println("Value of i in d1 : "+d1.i);
		System.out.println("Value of i in d2 : "+d2.i);
		System.out.printf("\n");
		d1.i++;

		System.out.println("Value of i in d1 : "+d1.i);
		System.out.println("Value of i in d2 : "+d2.i);

		System.out.printf("\n");
		System.out.println("Value of j in d1 : "+d1.j);
		System.out.println("Value of j in d2 : "+d2.j);

		d1.j++;
		
		System.out.printf("\n");
		System.out.println("Value of j in d1 : "+d1.j);
		System.out.println("Value of j in d2 : "+d2.j);	
	}
}
