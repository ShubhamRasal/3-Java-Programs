import java.lang.*;

// This program is used to demonstrate the currently running thread and its name
class CurrentThread
{
	public static void main(String args[])
	{
		// Create object of thread class
		Thread t = Thread.currentThread();
		System.out.println("Current thread is " +t);
		// Print the name of thread
		System.out.println("Name of thread is "+ t.getName());
	}

}