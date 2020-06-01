// This program is used to demonstate concept of generic interface

import java.lang.*;

interface Calculator<T>
{
	T add(T no1, T no2);
}

class Demo<T> implements Calculator<T>
{
	public T add(T no1, T no2)
	{
		return no1;
	}
}

class Generic_Interface
{
	public static void main(String args[])
	{
		Demo<Integer> obj = new Demo<Integer>();
		Integer o = obj.add(10,20);
		System.out.println(o);	
	}
}