/********************************************************
*
*	This program demonstrate some method of String class.
*	
*	1. replace() : this method takes the old parameter and replace it with the new parameter
*					1st parameter is the old character
*					2nd parameter is the new character to replace
*
*	2. startsWith() : checks whether the Sdtring starts with the specified arguement
*						it return true if the String starts with specified string else return false
*					
*	3. endsWith() : checks whether the string ends with specified arguement
*					it return true if the String sends with specified string else return false
*
*	4. + : is used to concate two strings
*****************************************************/

import java.lang.*;
class StringDemo4{

	public static void main(String args[])
	{
		String s1 = "Educating for better tommorrow";
		String s2 = new String("to upper");
		String s3 = new String("To LOWER");
		String s4 = "Hello";
		// demonstration of replace()
		System.out.println("\n...........Demonstraiton of replace()..........\n");
		
		System.out.println("Original String : "+s4);
		System.out.println("Srring after using replace method : "+s4.replace('l','i'));

	
		// demonstration of startsWith()
		System.out.println("\n...........Demonstraiton of startsWith()..........\n");
		System.out.println("does s2 starts with to : "+s2.startsWith("to"));

		// demonstration of endsWith()
		System.out.println("\n...........Demonstraiton of endsWith()..........\n");
		System.out.println("does s1 sends with row : "+s1.endsWith("row"));

		// demonstration of '+'
		System.out.println("\n...........Demonstraiton of '+'..........\n");
		s2 = s2+s3;
		System.out.println(s2);
	}
}	
