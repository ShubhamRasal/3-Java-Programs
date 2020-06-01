import java.lang.*;

// Interface contains only abstract methods and 
// final data members

interface DemoInterface1
{
	int i = 10;
	void fun();
}

interface DemoInterface2 
{
	int i = 20;
	void fun();
}

// We can achive the concept of multiple inheritance using interface
class BaseClass1 implements DemoInterface1,DemoInterface2
{

	// Implemented method from interface
	public void fun()
	{
		System.out.println("Inside implemented method fun ");
		System.out.println("Value of i from first interface is "+ DemoInterface1.i);
		System.out.println("Value of i from second interface is "+ DemoInterface2.i);
	}
}

class Interface6
{
	public static void main(String args[])
	{
		BaseClass1 b1 = new BaseClass1();
		b1.fun();
	}
}