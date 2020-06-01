// This program is used to demonstrate Arrays

import java.lang.*;
import java.io.*;
import java.util.*;

// Arrays class contains multiple methods which are applied on one dimentional array

class Collection_Arrays
{
	public static void main(String args[]) throws Exception
	{
		// Create an array of integers
		int arr[] = {3,7,8,1,4,5,2};

		// Display contents of array
		System.out.println("Contents of array are\n");
		for(int i = 0;i<arr.length;i++)
			System.out.println(arr[i]);

		// Sort the array in asscending order
		Arrays.sort(arr);
		System.out.println("After sorting contents of array are\n");
		for(int i = 0;i<arr.length;i++)
			System.out.println(arr[i]);

 
		// Search element is array by using binary search technique
		int index = Arrays.binarySearch(arr,4);
		System.out.println("Element 4 is found at position");
	}
}









