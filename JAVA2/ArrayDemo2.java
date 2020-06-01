
/********************************************************
*
*	This program demonstrate the concept of Array
*	1. Array is a fixed length data Structure used to hold more than one value
*	2. arraycopy() : is a static method of java.lang.System class
*					this method is used to copy the contents of one array to another.
*
*	3. clone() : this method is same as we write our own copy constructor is c++
*				this method is used to achieve the concept of deep copy.
*
*	4. sort() : this method is used to sort() the array
				this method uses quick sort algorithm.
				this method is defined in java.util.Arrays class.
********************************************************/
import java.lang.*;
import java.util.*;
class ArrayDemo2
{

	public static void main(String args[])
	{
		int []arr1 = new int[]{1,2,3,4,5,6};
		int []arr2 = new int[arr1.length];
		
		
		// demonstration of array copy
		
		
		
		System.out.println("Demonstration of arraycopy()...");
		System.arraycopy(arr1,0,arr2,0,arr1.length);
		for(int i =0;i<arr1.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
	
	
		// demonstration of clone
		int []arr3 = {11,22,33,44,55,66,77};
		int []clone_arr;
		System.out.println("\narray using clone... ");
		clone_arr = (int [])arr3.clone();
		
		for(int i =0;i<clone_arr.length;i++)
		{
			System.out.print(clone_arr[i]+" ");
		}
		
		// demonstration of sort()
		System.out.prinln("..... Demonstration of sort()...");
		int []arr4 = new int[]{4,32,1,7,6,5,3,4,5};
		Arrays.sort(arr4);
		for(int i =0;i<arr4.length;i++)
		{
			System.out.print(arr4[i]+" ");
		}
	}

    
    
    
    
    
    
    
}
