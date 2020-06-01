// This program is used to demonstrate working of generic class

import java.lang.*;

class Generic_Demo<T> 
{
	private T t;

	public void add(T t) 
	{
		this.t = t;
	}

	public T get() 
	{
		return t;
	}
}

public class Generic_Class
{
	public static void main(String[] args) 
	{
		// Whenever we create object of generic class java compiler creates non
		// generic version oc that class which is called as "erasure".

		// Create object by specifying integer
		Generic_Demo<Integer> integerBox = new Generic_Demo<Integer>();
		
		// Create object by specifying String
		Generic_Demo<String> stringBox = new Generic_Demo<String>();

		integerBox.add(new Integer(10));

		stringBox.add(new String("Hello World"));
		System.out.printf("Integer Value :%d\n\n", integerBox.get());
		System.out.printf("String Value :%s\n", stringBox.get());
	}
}