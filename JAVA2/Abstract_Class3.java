import java.lang.*;

// abstract class contains 0 or more abstract methods
abstract class Base
{
	int i;
	 	
	Base()
	{
		i = 10;
		System.out.println("In abstract class constructor");
	}

	void fun()
	{
		System.out.println("In Base fun");
	}
}

class Demo extends Base
{
	void gun()
	{
		System.out.println("In gun of Demo");
		System.out.println("Value of i"+i);
	}

	void fun()
	{
		System.out.println("In Demo fun");
	}
	
}

class Abstract_Class3
{
	public static void main(String args[])
	{	
		Demo dobj = new Demo();
		dobj.fun();
		dobj.gun();

		// We can not create object of abstract class
		// but we can create its reference
		Base bobj = new Demo();
		bobj.fun();
	}
}