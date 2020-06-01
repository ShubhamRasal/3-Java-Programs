// This program is used to retrive the IP address of website

import java.io.*;
import java.net.*;

class IP_Address
{
	public static void main(String args[]) throws IOException
	{
		// Create offset of BuffredReader to accept the input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter website name");
		
		// Accept name of website
		String s = br.readLine();
		try
		{
			// Create address of InetAddress to fetch the IP address
			// getByName is used to retrive the 
			InetAddress i = InetAddress.getByName(s);
			System.out.println("IP address is :" +i);
		}
		catch(UnknownHostException e)
		{
			System.out.println("Website not found");
		}
	}
}

/*
OUTPUT :
Enter website name
www.yahoo.com
IP address is :www.yahoo.com/106.10.138.240
*/