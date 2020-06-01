/********************************************************
*
*	This program demonstrate some methods of Array
*	1. copyOfRange() : this method os used to copy from the given range to the array
*	2. fill() : if we want to fill the array with particular value
				then we have to use this method
				
	both of these methodes are defined in java.util.Arrays class.			
*

********************************************************/

import java.util.*;
class ArrayDemo4{

	public static void main(String args[])
	{
		char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
            'i', 'n', 'a', 't', 'e', 'd'};
            
        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        
        System.out.println(new String(copyTo));

	int []arr1 = {1,2,3,4};
	int []arr2= new int[5];// = {1,2,3,4};
		
	Arrays.fill(arr2,100);
	for(int i =0;i<arr2.length;i++)
	{
		System.out.print(arr2[i]+" ");
	}
	}

}






