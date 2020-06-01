// This program is used to demonstrate URL class

import java.net.*;
import java.io.*;

class URL_Format
{
	public static void main(String args[]) throws Exception
	{
		// Create object of URL class
		URL obj = new URL("http://facebook.com/login.html");	
		
		System.out.println("Protocol used : "+obj.getProtocol());
		System.out.println("Host name : "+obj.getHost()); 
		System.out.println("File name : "+obj.getFile());
		System.out.println("Port number :"+obj.getPort());
		System.out.println("Path : "+obj.getPath());
	}
}