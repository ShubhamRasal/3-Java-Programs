
/********************************************************
*
*	This program demonstrate the concept of Array
*	1. Array is a fixed length data Structure used to hold more than one value
*	2.
*
*
********************************************************/

class ArrayDemo{

	public static void main(String args[])
	{
			// memory for 20 bytes is created dynamically for reference arr.
		int arr[] = new int[5];
		
			// you can also do this to declare an array
			int []array;
			array = new int[5];
		
		// initializing elements of array.
		
		int []arr1= {10,20,30,40};	// this is called as explicit array initialization.
		
		int []arr2 = new int[]{1,2,3,4,5,6,7};	// allowed

		// creating array		
		int []arr3 = new int[5];
		// initializing
			arr3[0]=10;
			arr3[1]=20;
			arr3[2]=30;
			arr3[3]=40;
			arr3[4]=50;

			// accessing an array
		System.out.println("Elements of array arr3 are : ");
		for(int i =0;i<arr3.length;i++)
		{
			System.out.print(arr3[i]+"  ");
		}
		System.out.println("\n");

		//You can also place the brackets after the array's name:
		// this form is discouraged
		
		float anArrayOfFloats[];
		
		//However, convention discourages this form; the brackets identify the array type and should appear with the type designation.
		

		// we can also get the length of array by using length..
		System.out.println(arr.length);
		System.out.println(arr1.length);


		System.out.println("Elements of array arr1 are : ");
		for(int i =0;i<arr1.length;i++)	// if we do not have the size of array we can get it with the helpo of length.
		{
			System.out.print(arr1[i]+"  ");
		}
		System.out.println("\n");
		System.out.println("Elements of array arr2 are : ");
		for(int i =0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+"  ");
		}
		System.out.println("\n");
			}

}