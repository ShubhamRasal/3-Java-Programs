// This program is used to demonstrate ArrayList

import java.lang.*;
import java.io.*;
import java.util.*;

class Collection_ArrayList
{
	public static void main(String args[]) throws Exception
	{
		// Create ArrayList of strings
		// This similar as template in C++
		ArrayList <String> ll = new ArrayList<String>();

		// Insert the contents in ArrayList
		ll.add("First");			
		ll.add("Second");
		ll.add("Third");
		ll.add("Fourth");
		ll.add("Fifth");
		System.out.println("\nContents of Array list \n" + ll);
		
		// We can insert data at specified position
		ll.add(3,"new");
		System.out.println("\nContents of Array list \n "+ ll);

		// We can insert the data at last
		ll.add("Two");
		System.out.println("\nContents of Array list \n" + ll);

		// We can remove element from any specified position
		ll.remove(3);
		System.out.println("\nContents of Array list \n" + ll);

		// We can replace the element from specified position
		ll.set(3,"New_Data");
		System.out.println("\nContents of Array list \n" + ll);

		System.out.println("\nNumber of elements in Array list are : " + ll.size());

		System.out.println("First occurance of Third is : "+ ll.indexOf("Third"));

		System.out.println("Last occurance of Third is : "+ ll.lastIndexOf("Third"));

		// We can use iterator to iterate the Array list
		System.out.println("Iterating the Array list\n");
		Iterator it = ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next() + " ");
		}
		
		// We can remove all elements from arraylist
		ll.clear();
	}
}