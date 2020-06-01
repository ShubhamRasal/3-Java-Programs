
/********************************************************
*
*	This program demonstrate some methods of StringBuffer class
*	1. toString() : is used to get the contents of one string
					// toString is the method of Object class.
					
	2. capacity() : is used to get the capacity of the object of a StringBufferClass
*
*	3. setLength() : is used to set the length of the String
*
*	4. reverse() : is used to reverse the string.
*********************************************************/

import java.lang.*;
class StringBufferDemo2{

	public static void main(String args[])
	{
		String s1 = new String("hello");
		StringBuffer sb1 = new StringBuffer(s1);
		
		// toString()
		System.out.println("\n......Demonstration of toString........");
		String s2 = sb1.toString();
		System.out.println(s2);
		
		// capacity()
		System.out.println("\n......Demonstration of capacity........\n");
		StringBuffer sb2 = new StringBuffer(200);
		System.out.println("the capacity of sb2 : "+sb2.capacity());
		
		// setlength()
		System.out.println("\n.......Demonstration of length()..........\n");
		StringBuffer sb3 = new StringBuffer("Hello");
		System.out.println("before using length(), length of sb3 is : "+sb3.length());
		sb3.setLength(10);
		System.out.println(" After using length(),length of sb3 is  : "+sb3.length());
	
		// demonstration of reverse() method
		System.out.println("\n.....demonstration of reverse() method........\n");
		StringBuffer sb4 =  new StringBuffer("Reverse");
		System.out.println(sb4.reverse());
		
	}


}