import java.io.*;
import java.net.*;

class Server3
{
	public static void main(String args[]) throws Exception
	{
		System.out.println("Server Application is running...\n\n");

		// Create object of ServerSocket
		
		System.out.println("Server socket is created on port number 2808\n\n");
		ServerSocket ss = new ServerSocket(2001);

		// Server will wait till client accept the connection	
		System.out.println("Server application is waiting for connection from server\n\n");
		Socket s = ss.accept();

		System.out.println("Connection is successfull\n\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String filename = br.readLine();

		File f = new File(filename);

		DataOutputStream out = new DataOutputStream(s.getOutputStream());

		if(f.exists())
		{
			FileReader fr = new FileReader(filename);
			BufferedReader brfile = new BufferedReader(fr);
			String str;
			while((str = brfile.readLine()) != null)
			{
				out.writeBytes(str);				
			}
		}

	}
}