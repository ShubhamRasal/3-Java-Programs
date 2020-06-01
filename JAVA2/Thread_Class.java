import java.lang.*;

class Demo extends Thread
{
	// This method is considered as thread code
	public void run()
	{
		for(int i = 0; i<=10;i++)
		{
			System.out.println("Value of i " + i);
		}
	}
}

class Thread_Class
{
	public static void main(String args[])
	{
		// Creating object of demo class which extends thread class
		Demo d = new Demo();
		
		// Create Thread class object and attach to above object		
		Thread t  = new Thread(d);

		System.out.println("Inside main");

		// Start the execution of thread
		t.start();
	}
}