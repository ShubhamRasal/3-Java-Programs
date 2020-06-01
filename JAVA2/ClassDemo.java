import java.lang.*;

class Inner
{
	void fun()
	{
		System.out.println("In fun function of Inner class");
	}
}

class ClassDemo
{
	public static void main(String args[])
	{
		Inner obj = new Inner();
		obj.fun();
	}
}