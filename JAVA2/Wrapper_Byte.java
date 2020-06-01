// This program is used to demonstrate Byte wrapper class and its methods

import java.lang.*;
import java.io.*;
import java.util.*;

class Wrapper_Byte
{
	public static void main(String args[])
	{
		// We can create byte class object as
	//	Byte obj1 = new Byte(n);

		// We can create byte class object by passing string as		
		Byte obj2 = new Byte("101");
		Byte obj1 = new Byte("101");

		//We can compaire two Byte class objects as
		int out = obj1.compareTo(obj2);
		if(out == 0)
		{
			System.out.println("Both objcts are equal");
		}
		else if(out < 0)
		{
			System.out.println("obj1 < obj2");
		}
		else if(out > 0)
		{
			System.out.println("obj1 > obj2");
		}
		
		// We can convert Byte class object into string as
		String str = obj1.toString();		
	}
}