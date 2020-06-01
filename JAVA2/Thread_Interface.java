import java.lang.*;

class Demo implements Runnable
{
	// This method is considered as thread code
	public void run()
	{
		System.out.println("Thread started...");
	}
}

class Thread_Interface
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