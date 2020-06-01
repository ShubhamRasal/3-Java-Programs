
/********************************************************
*
*	1.This program demonstrates the concept of final class
*
*	2. Final class is such a class which we cannot  
*	inherit(extend)	
*	i.e we cannot change the behaviour of final class
*	
********************************************************/


import java.lang.*;

final class Base
{
	int i;
	int j;
	Base()
	{
		i = 10;
		j = 10;
	}
}

// If class is final then we can not extend that class
/*
class Derived extends Base
{

}
*/
class Final_Class
{
	public static void main(String args[])
	{
		System.out.println("main class");
	}
}