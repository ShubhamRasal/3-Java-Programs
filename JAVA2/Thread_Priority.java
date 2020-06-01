import java.lang.*;

class Demo extends Thread
{
	// This method is considered as thread code
	public void run()
	{
		System.out.println("Thread name " + Thread.currentThread().getName());
		System.out.println("Thread priority " + Thread.currentThread().getPriority());
	}
}

class Thread_Priority
{
	public static void main(String args[])
	{
		// Creating object of demo class which extends thread class
		Demo d1 = new Demo();		

		// Create Thread class object and attach to above object		
		Thread t1  = new Thread(d1,"First");
		Thread t2 = new Thread(d1,"Second");

		t1.setPriority(3);
		t2.setPriority(Thread.NORM_PRIORITY);

		t1.start();
		t2.start();
	}
}