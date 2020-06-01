import java.lang.*;

class Demo extends Thread
{
	String str;
	Demo(String str)
	{
		this.str = str;	
	}

	// This method is considered as thread code
	public void run()
	{
		for(int i = 0;i<=10;i++)
		{
			System.out.println(str+ " ->" +i);
			//try
			//{
				Thread.sleep(1500);
			//}
			/*catch(InterruptedException e)
			{
				e.printStackTrace();
			}*/
		}
	}
}

class Thread_Multitasking
{
	public static void main(String args[])
	{
		// Creating object of demo class which extends thread class
		Demo d1 = new Demo("First Thread");		
		Demo d2 = new Demo("Second Thread");

		// Create Thread class object and attach to above object		
		Thread t1  = new Thread(d1);
		Thread t2 = new Thread(d2);

		System.out.println("Inside main");

		// Start the execution of thread
		t1.start();
		t2.start();
	}
}