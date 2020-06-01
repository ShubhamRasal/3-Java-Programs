
/********************************************************
*
*	This program demonstrate the concept of Multi Dimensional Array
*	
*	1. what is ragged array?
*			it is possible to create an array with different number of columns in each row
*			such an array is called as ragged array.
*
********************************************************/
import java.util.*;
import java.io.*;
class ArrayDemo3{

	public static void main(String args[])
	{
		// multi dimensional array can be created as :
		int [][] arr = new int[][]{{1,2},{3,4}};
		
			
		for(int i =0;i<arr.length;i++)
		{
			for(int j =0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("\n");
		}
		
		
		// we can also create multi dimensional array using ragged array
		
		int [][] ragged_array = new int[4][];
		
		ragged_array[0]= new int[4];
		ragged_array[1]= new int[2];
		ragged_array[2]= new int[5];
		ragged_array[3]= new int[3];
		
		for(int i =0;i<ragged_array.length;i++)
		{
			for(int j =0;j<ragged_array[i].length;j++)
			{
				ragged_array[i][j]=i*j;
			}
		}
	
		System.out.println("Demonstration of ragged Array...");
		for(int i =0;i<ragged_array.length;i++)
		{
			for(int j =0;j<ragged_array[i].length;j++)
			{
				System.out.print(ragged_array[i][j]+"  ");
			}
			System.out.println("\n");
		}
	}

}