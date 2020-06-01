import java.io.*;
import java.net.*;

class Server2
{
	public static void main(String args[]) throws Exception
	{

		Syetm.out.println("Server is running...\n\n");

		// Create ServerSocket
		ServerSocket ss = new ServerSocket(2101);

		// Create listener socket
		Socket s = ss.accept();

		System.out.println("Connection is succesfully established...");	
		
		PrintStream ps = new PrintStream(s.getOutputStream());
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			String str1,str2;
			while((str1 = br.readLine()) != null)
			{
				System.out.println(str1);
				str2 = br1.readLine();
				ps.println(str2);
			}
			ps.close();
			ss.close();
			s.close();
			br.close();
		}
	}
}