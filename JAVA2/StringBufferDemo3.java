
/********************************************************
*
*	This program demonstrate that String class as well as StringBuffer Class sre a final classes
*	 and cannot be inherited
*	
*
*

********************************************************/

class String1 extends String
{
	String1()
	{
		System.out.println("Can be extended....");
	}


}
class StringBuffer1 extends StringBuffer
{

	StringBuffer1()
	{
		System.out.println("Can be extended....");
	}

}

class StringBufferDemo3{
	
	public static void main(String args[])
	{
		String1 s1 = new String1();
		StringBuffer1 sb1 = new StringBuffer1();
	}



}
