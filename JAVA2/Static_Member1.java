import java.lang.*;

class Demo
{
	static int i;
	int j;
	Demo()
	{
		i = 10;
		j = 10;
	}
}

class Derived extends Demo
{
	void fun()
	{
		System.out.println("static member is " + i);
	}
}

class Static_Member1
{
	public static void main(String args[])
	{
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Derived obj = new Derived();
		System.out.println("static member is " + Demo.i);
		obj.fun();		
	}
}