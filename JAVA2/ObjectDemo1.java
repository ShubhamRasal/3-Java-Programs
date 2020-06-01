/********************************************************
*
*	This program demonstrate the Objeect class
*	1.	you can create reference of any class object to a reference of object class
*	2. object class is directly or indirectly inherited by all the classes
*	3. object class is the super class of all the classes

*	equals() method is covered in string
*	final() is explained in Exception handling
*	clone() is covered in array
*	 toString() also covered in String
*
********************************************************/

class Demo{
	
	Demo()
	{
		System.out.println("Demo Constructor...");
	}
	
	public void fun()
	{
		System.out.println("Fun of Demo Class...");
	}

}
class ObjectDemo1{
	public static void main(String args[])
	{
		Object obj = new Demo();
		Object obj2 = new Demo();

		// hashCode is an integer value that is computed
		//for a piece of information using an algorithm 
		
		System.out.println("hashCode of object obj is : "+obj.hashCode());
		
		Demo d = new Demo();


		// getClass is the method used to get the class towhich the object belongs
		System.out.println("the object d belongs to class : "+d.getClass());
		
		
		}


}