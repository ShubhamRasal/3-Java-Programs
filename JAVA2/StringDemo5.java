
/********************************************************
*
*	This program demonstrate some method of String class.
	1. valueOf() : thee is no need of object to call this method
					because this is a static method of class String
					this function returns the given parameter as a string
					
	2. substring() : this method is used to get a sub part of the String.				
					// the first parameter to this method is Starting range of the String.
					// the second parameter to this method is ending range of the String.

	3. trim() :	the best use of this method is if you want to remove extra white space form the string
				// ie leading and trailing white spaces of the String.
	
	
*******************************************************/




import java.lang.*;
class StringDemo5{

	public static void main(String args[])
	{
		String s1 = "Educating for better tommorrow";
		String s2 = new String("to upper");
		String s3 = new String("To LOWER");
		String s4 = "Hello";
		// demonstration of valueOf()
		System.out.println("\n...........Demonstraiton of valueOf()..........\n");
		String s5 = s4.valueOf('l');
		System.out.println(s5);

		// demonstration of substring()
		System.out.println("\n...........Demonstraiton of substring()..........\n");
		
		System.out.println(s1.substring(1,5));


		// demonstration of trim()
		System.out.println("\n...........Demonstraiton of trim()..........\n");
		String s6 = "        hello       ";
		System.out.println("The original String is : "+s6);
		System.out.println("The String after using trim() is :"+s6.trim());

	}
}	