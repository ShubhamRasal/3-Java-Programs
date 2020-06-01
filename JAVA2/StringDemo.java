
/********************************************************
*
*	This program demonstrate that string class is immutable
* 		the String class gives you no method to change a character in existing String.
*
*
********************************************************/
class StringDemo{
	public static void main(String args[])
	{
		String s1 = "hello java";
		
		s1 = s1.substring(0,5)+"world";		
		System.out.println(s1);
	}


}