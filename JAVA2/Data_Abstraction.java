import java.lang.*;

// When the data is written as private then it is hidden from outside
// world it is called as data abstraction

class Demo
{
	// Characteristics
	private int i = 10;

	// Behaviour
	void Function()
	{
		System.out.println("Inside function which contains private data as " +i);
	}	
}

class Derived extends Demo
{
	void gun()
	{
	// It is not allowed to access the private members of base class
	//	System.out.println("Private member from base class "+ i);
	}
}

class Data_Abstraction
{
	public static void main(String args[])
	{
		Demo obj = new Demo();
		obj.Function();

		// We cant access the private members from main	
		// System.out.println("Value of i is" + obj.i);
	}
}