import java.lang.*;

class Demo extends Thread
{
	// This method is considered as thread code
	public void run()
	{
		System.out.println("Thread started...");
		fun1();
		fun2();
		fun3();
	}
	void fun1()
	{
		System.out.println("In fun1");
	}
	void fun2()
	{
		System.out.println("In fun2");
	}
	void fun3()
	{
		System.out.println("In fun3");
	}

}

class Thread_Singletasking
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