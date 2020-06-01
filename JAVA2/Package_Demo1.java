// compile this program as
// javac  -cp path Package_Demo1 
// in above command specify the path of our package

import java.lang.*;

import MyPackage1.Package1;

class Package_Demo1
{
	public static void main(String args[])
	{
		Package1 d1 = new Package1();
		d1.fun();	
	}
}