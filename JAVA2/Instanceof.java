////////////////////////////////////////////////////////
//
//	 instanceof operator is used to check whether object
//	 belongs to class or not.
//
//	 It returns boolean value
//	
//	ie. it returns true if the object and instance matches
//		else it return false.
//
///////////////////////////////////////////////////////
import java.lang.*;

class Demo1
{
	int i ;
}

class Instanceof
{
	public static void main(String args[])
	{
		Demo1 obj1 = new Demo1();
	
		boolean b1;
		b1 = obj1 instanceof Demo1;
		if(b1==true)
		{
			System.out.println("obj1 is object of Demo1");
		}
	}
}



/**************************************************************
*
*	OUTPUT :
*	obj1 is object of Demo1
*
**************************************************************/
