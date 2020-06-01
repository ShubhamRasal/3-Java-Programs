// compile this program as
// javac  -cp path Package_Demo1 
// in above command specify the path of our package

import java.lang.*;

import MyPackage2.*;

class Demo_Class implements Package2
{
	void fun()
	{
		System.out.println("Inside the implemented method");
	}
} 

class Package_Demo2
{
	public static void main(String args[])
	{
		Demo_Class d1 = new Demo_Class();
		d1.fun();	
	}
}