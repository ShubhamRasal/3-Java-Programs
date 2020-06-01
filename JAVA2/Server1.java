// Code of server

/*
	Steps to create Server Application:
	1. Create object of ServerSocket class.
	2. Call method accept to wait till connection gets established.
	3. Attach OutStrem to server socket.
	4. Create object of PrintStream to send the data.
	5. Call println function to print the data.
*/

import java.io.*;
import java.net.*;

class Server1
{
	public static void main(String args[]) throws Exception
	{
		System.out.println("Server Application is running...\n\n");

		// Create object of ServerSocket
		
		System.out.println("Server socket is created on port number 2808\n\n");
		ServerSocket ss = new ServerSocket(2808);

		// Server will wait till client accept the connection	
		System.out.println("Server application is waiting for connection from server\n\n");
		Socket s = ss.accept();

		System.out.println("Connection is successfull\n\n");
		
		// Attach outputstream to server socket
		OutputStream obj = s.getOutputStream();

		// Attach print stream to send data
		PrintStream ps = new PrintStream(obj);

		// Create string
		String str = "Marvellous Infosystems Educating for better tomorrow";
		
		// Send the string
		ps.println(str);

		System.out.println("Closing all connections\n\n");
		// Close all connections
		ps.close();
		s.close();
		ss.close();
	}
}