// Client program

/*
	Steps to create client program
	1. Create object of Socket class by passing IP address and port number of server.
	2. Create object of InputStream class to accept input from server.
	3. Create object of BuffredReader to accept the input.
	4. Call function readLine to accept the data from server.			  
*/

import java.io.*;
import java.net.*;

class Client1
{
	public static void main(String args[]) throws Exception
	{
		System.out.println("Client Application is running....\n\n");

		// Create Client socket
		Socket s = new Socket("localhost",2808);
		System.out.println("Socket is created to communicate port 2808 onlocalhost\n\n");		

		// create object of inputstream
		InputStream obj = s.getInputStream();

		// Create BuffredReader to read the input	
		BufferedReader br = new BufferedReader(new InputStreamReader(obj));
		String str;
		
		System.out.println("Getting the input from server\n\n");

		str = br.readLine();
			System.out.println("Message from server \n\n"+str);	

		br.close();
		s.close();
	}
}