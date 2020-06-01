// Client program

import java.io.*;
import java.net.*;

class Client2
{
	public static void main(String args[]) throws Exception
	{
		System.out.println("Client is running...\n\n");

		Socket s = new Socket("localhost",2101);

		DataOutputStream d = new DataOutputStream(s.getOutputStream());

		BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

		String str1,str2;

		while(!(str1 = br2.readLine()).equals("exit"))
		{
			d.writeBytes(str1 + "\n");
			str2 = br1.readLine();
			System.out.println(str2);	
		}
		d.close();
		br1.close();	
		br2.close();
	}
}