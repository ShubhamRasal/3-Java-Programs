import java.lang.*;

// If method is final method then we can overload that method.
// And we can override that overloaded method which is not final.

class Base
{
	int i;
	int j;
	Base()
	{
		i = 10;
		j = 10;
	}

	final void fun()
	{
		System.out.println("Inside final method");
	}

	// final method which gets overloaded
	void fun(int i)
	{
		System.out.println("Inside overloaded method");
	}
}

class Derived extends Base
{
	//We can not override final method
/*
	void fun()
	{
		System.out.println("Inside final method");
	}
*/
	void fun(int i)
	{
		System.out.println("Inside overrided method");
	}
}

class Final_Method2
{
	public static void main(String args[])
	{
		Base b = new Base();
		b.fun();
		b.fun(10);

		Derived d = new Derived();
		d.fun(10);	
	}
}