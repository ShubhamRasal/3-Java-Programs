// This program is used to demonstrate Integer wrapper class and its methods

import java.lang.*;
import java.io.*;
import java.util.*;

class Wrapper_Integer
{
	public static void main(String args[])
	{
		// We can create Integer class object as
		Integer obj1 = new Integer(10001);

		// We can create integer class object by passing string as		
		Integer obj2 = new Integer("10001");

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
		
		//by using equals method we can compaire Integer class and any other class
		if(obj1.equals(str))
		{
			System.out.println("String class and Integer class are same");
		}

		//We can convert integer into binary as
		String strb = Integer.toBinaryString(obj1);
		System.out.println("Binary contents are "+strb);

		//We can convert integer into Hexadecimal as
		String strh = Integer.toHexString(obj1);
		System.out.println("Hexadecimal contents are "+strh);

		//We can convert integer into octal as
		String stro = Integer.toOctalString(obj1);
		System.out.println("Octal contents are "+stro);
		
	}
}



class Integer
{
	public int data;

	Integer(int i)
	{
		this.data = i;
	}

	Boolean CompairTo(Integer no1, Integer no2)
	{
		 // code to that method
	}
}








