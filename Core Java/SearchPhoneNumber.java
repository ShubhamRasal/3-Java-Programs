import java.io.*;



public class SearchPhoneNumber
{


	public static void main(String arg[])throws Exception
	{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("1.Search\n2.Add\n3.exit");
			int ch=Integer.parseInt(br.readLine());

			switch(ch){


				case 1:
					System.out.println("Enter name to search");
					String sname=br.readLine();
					
					BufferedReader fromfile=new BufferedReader(new FileReader("phone.txt"));

					String data;
					boolean flag=false;
					while((data=fromfile.readLine())!=null)						{
					
						if(data.contains(sname))
						{
							flag=true;
							System.out.println(data);							break;
						}
					}			

					if(flag==false)
					{
						System.out.println("Record not found");
					}


					break;

				case 2:
					System.out.println("Enter Name");
					String name=br.readLine();

				
					System.out.println("Enter phone number");
				//	int ph=Integer.parseInt(br.readLine());
					long ph =Long.parseLong(br.readLine());
					
					BufferedWriter tofile=new BufferedWriter(new FileWriter("phone.txt",true));
					tofile.write(name+" "+ph+"\n");
					tofile.close();
				
				
				
					break;

				case 3:
					System.exit(1);
	

			}
		}
	}//main

}//class
