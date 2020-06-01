// This program is used to demonstrate Character wrapper class and its methods

import java.lang.*;
import java.io.*;
import java.util.*;

class Wrapper_Character
{
	public static void main(String args[])
	{
		Character obj1 = new Character('M');
		Character obj2 = new Character('M');

		// We can retrive the character from character object
		char ch = obj1.charValue();

		//We can compaire two characr class objects as
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
		
		// We can convert Character class object into string as
		String str = obj1.toString();		

		// There are diffrent functions which are used to check contents of character class
		if(Character.isLetter(obj1))	//  +
		{
			System.out.println("It is character");
		}

		if(Character.isDigit(obj1))
		{
			System.out.println("It is digit");
		}

		if(Character.isUpperCase(obj1))
		{
			System.out.println("It is upper case character");
		}

		if(Character.isLowerCase(obj1))
		{
			System.out.println("It is lower case character");
		}
	}
}
