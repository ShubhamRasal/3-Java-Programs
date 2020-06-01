// This program is used to demonstrate LinkedList

import java.lang.*;
import java.io.*;
import java.util.*;

class Collection_LinkedList
{
	public static void main(String args[]) throws Exception
	{
		// Create LinkedList of integer
		// This similar as template in C++
		LinkedList <String> ll = new LinkedList<String>();

		// Insert the contents in LinkedList
		ll.add("First");			
		ll.add("Second");
		ll.add("Third");
		ll.add("Fourth");
		ll.add("Fifth");
		System.out.println("\nContents of linked list \n" + ll);
		
		// We can insert data at specified position
		ll.add(3,"new");
		System.out.println("\nContents of linked list \n "+ ll);

		// We can insert the data at first position
		ll.addFirst("One");
		System.out.println("\nContents of linked list \n" + ll);

		// We can insert the data at last
		ll.add("Two");
		System.out.println("\nContents of linked list \n" + ll);

		// We can remove first element from linked list
		ll.removeFirst();
		System.out.println("\nContents of linked list \n" + ll);

		// We can remove last element from linked list
		ll.removeLast();
		System.out.println("\nContents of linked list \n" + ll);
	
		// We can remove element from any specified position
		ll.remove(3);
		System.out.println("\nContents of linked list \n" + ll);

		// We can replace the element from specified position
		ll.set(3,"New_Data");
		System.out.println("\nContents of linked list \n" + ll);

		System.out.println("\nNumber of elements in linked list are : " + ll.size());

		System.out.println("First occurance of Third is : "+ ll.indexOf("Third"));

		System.out.println("Last occurance of Third is : "+ ll.lastIndexOf("Third"));

		// We can use iterator to iterate the linked list
		System.out.println("Iterating the linked list\n");
		Iterator it = ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next() + " ");
		}
	}
}