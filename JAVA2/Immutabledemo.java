import java.io.*;

/*Immutable class is a class which once 

created, it’s contents can not be changed. 

Immutable objects are the objects whose 

state can not be changed once constructed. 

e.g. String class*/

/*To create an immutable class following 

  steps should be followed:

  1. Create a final class.
    
  2.Set the values of properties using constructor only.
  
  3.Make the properties of the class final and private
    
  4.Do not provide any setters for these properties.
*/

public final class Immutable 
{
      private final int i;
     
      public Immutable(final int i) {
             
		                    this.i=i;
      				    }
      // Accessor method
	public int geti() {
                        return i;
                        }
     //we can't provide mutator method. bcoz we can't assign 
     //value to final variable.
      /*public int seti(final int i) {
                           this.i=i;
                        }*/   
} 

public class Immutabledemo
{
	public static void main(String [] args)
	{
		Immutable obj=new Immutable(5);
		
		// can't access like this.	
		//obj.i=10;
		
		//we can't set the value from mutator method.
		//obj.seti(10);

		int n=obj.geti();
		
		System.out.println("access value by Accessor method:"+n);
	}
}