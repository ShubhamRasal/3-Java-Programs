// This program is used to demonstrate Hashtable

import java.lang.*;
import java.io.*;
import java.util.*;

class Collection_Hashtable
{
	public static void main(String args[]) throws Exception
	{
		// This similar as template in C++
		// Where String is key and integer is value
		Hashtable <String,Integer> ht = new Hashtable<String,Integer>();

		// Insert the contents in Hashtable
		ht.put("Marvellous",10);			
		ht.put("Quick heal",20);
		ht.put("Persistant",30);
		ht.put("Avaya",40);
		ht.put("Infosys",50);

		// We can use enumerator to enumerate the Hashtable
		System.out.println("Enumeratinging the Hashtable\n");
		Enumeration it = ht.keys();
		while(it.hasMoreElements())
		{
			System.out.println(it.nextElement() + " ");
		}
		
		
		// We can retrive the contents from hash table 
		System.out.println("Value of Marvellous is " + ht.get("Marvellous"));

		// We can remove element by specifying key
		ht.remove("Infosys");

		// We can retrive size of Hash table
		System.out.println("Size of hash table is "+ht.size());

		// We can remove all elements from Hashtable
		ht.clear();
	}
}