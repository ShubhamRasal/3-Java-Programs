
/********************************************************
*
*	This program demonstrate some method of String class
*	1. charAt() : gives the character at given index
*	2. length()	: gives the length of the String
	3. equalsIgnoreCase() : checks whether two string are equal ignoring the case
*
********************************************************/

class StringDemo2{

	public static void main(String args[])
	{
		String s1 = "Educating for better tommorrow";
		String s2 = new String("Hello World");
		String s3 = new String("HELLO WORLD");
		// demonstration of charAt()
		// the parameter to this method is the index at which you want to get the character
		
		System.out.println("\n...Demonstraiton of charAt() method....");
		System.out.println(s1.charAt(4));	
		System.out.println("\n");
		// demonstration of length()
		// this method is used to get the length of the String
		
		System.out.println("...Demonstraiton of length() method....");
		System.out.println("lenght of s1 : "+s1.length());
		System.out.println("\n");
		// demonstration of equalsIgnoreCase()
		// This is used to compare string ignoring case
		System.out.println("...Demonstraiton of equalsIgnoreCase() method....");
		if(s2.equalsIgnoreCase(s3))
		{
			System.out.println("Both String are equal ignoring case..");
		}
		else
		{
			System.out.println("Both String are not equal..");
		}
		System.out.println("\n");

	
	}



}