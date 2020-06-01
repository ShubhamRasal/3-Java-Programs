
/********************************************************
*
*		This program demonstrate the concept of string
*	1. A sequence of zero or more characters is known as string.
*	2. String is the object of "java.lang.String" class.
*	3. This program also demonstrates equals(),
*		compareTo(),
*		== operator
********************************************************/

import java.lang.*;

class StringDemo1
{

	public static void main(String args[])
	{
		String s1 = new String("Educating for Better Tommorrow...");
		String s2 = "Hello world";
		String s3 = s2;
			//The reference created by using new is not Shared
		String s4 =new String("hello world");
		String s5 = new String("hello world");	// new operator always creates new reference in memory
		
	
	
		
		System.out.println("String s1 :"+s1);
		System.out.println("String s2 :"+s2);
		System.out.println("String s3 :"+s3);
		System.out.println("String s4 :"+s4);
		
		
		
		// "==" is used to check the reference of the String
		// it doesn't check the actual contents of the String 
		System.out.println("\n..................Demonstration of == operator..........");			
			if(s2==s5)
			{
				System.out.println("both Strings are equal...");
			}
			else
			{
					System.out.println("both Strings are not equal...");
			}

		System.out.println("..........................................................");	
		// To compare  two Strings we use equals() method
		System.out.println("\n................. Demonstration of equals().............");
		boolean b1 = s3.equals(s2);	// this method checks whether two strings are equal
									// it checks the contents of string character by character
		System.out.println("The demo of equals method by using constant String   :"+b1);
		System.out.println(" s2.equals(s4) return value is : "+s2.equals(s4));	
		System.out.println(s4.equals(s5));
		// to check the conntents of String we have to use
		System.out.println("S4 equals s5 : "+s4.equals(s5));
	
		System.out.println("......................................................");
		// compareTo() mehtod is used if you want to compare String based on unicode values
		// it returns 0 if string matches
		// else it returns the difference between the two
		System.out.println("\n....................Demonstration of compareTo()..............");
		System.out.println("s3.compareTo() : "+s3.compareTo(s2));	// since s2 = s3 ="hello world"; it returns 0;
		System.out.println("s3.compareTo() :"+s1.compareTo(s2));	// e-h =-3 ;
		
		System.out.println("..........................................................");
											
	
	}
	
}