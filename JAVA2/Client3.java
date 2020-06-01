// Client program
import java.io.*;
import java.net.*;

class Client3
{
	public static void main(String args[]) throws Exception
	{
		Socket s = new Socket("localhost",2001);
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter name of file with full path");
		String filename = input.readLine();

		DataOutputStream out = new DataOutputStream(s.getOutputStream());
		out.writeBytes(filename);

		BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String str;
		while((str = in.readLine())!=null)
			System.out.println(str);		
		
	}
}