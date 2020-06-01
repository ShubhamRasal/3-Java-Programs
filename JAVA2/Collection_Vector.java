// This program is used to demonstrate Vector

import java.lang.*;
import java.io.*;
import java.util.*;

class Collection_Vector
{
	public static void main(String args[]) throws Exception
	{
		// Create Vector of integers
		// This similar as template in C++
		// In this case vector if size 10 gets created
		Vector <Integer> ll = new Vector<Integer>();

		// We can create vector as in which size of vector is 50
		Vector <Integer> v1 = new Vector<Integer>(50);
		
		// We can create vector as in which size of vector is 50
		//When vector become full its size gets incremented by 10	
		Vector <Integer> v2 = new Vector<Integer>(50,10);

		// Insert the contents in Vector
		ll.add(10);			
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		System.out.println("\nContents of Vector \n" + ll);
		
		// We can insert data at specified position
		ll.add(3,11);
		System.out.println("\nContents of Vector \n "+ ll);

		// We can remove element from any specified position
		ll.remove(3);
		System.out.println("\nContents of Vector \n" + ll);

		// We can replace the element from specified position
		ll.set(3,21);
		System.out.println("\nContents of Vector \n" + ll);

		System.out.println("\nNumber of elements in Vector are : " + ll.size());

		System.out.println("First occurance of Third is : "+ ll.indexOf(21));

		System.out.println("Last occurance of Third is : "+ ll.lastIndexOf(21));

		// We can use iterator to iterate the Vector
		System.out.println("Iterating the Vector\n");
		Iterator it = ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next() + " ");
		}
		
		// We can remove all elements from Vector
		ll.clear();
	}
}