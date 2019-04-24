import java.io.*;



public class FileDelete
{

	public static void main(String arg[])throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String fname=arg[0];

		File f=new File(fname);

		if(f.isFile())
		{
			System.out.println("IT is FILE:"+f);
			System.out.println("Size of file:"+f.length());
			System.out.println("Path of FIle:"+f.getAbsolutePath());
			System.out.println("Read permisson"+f.canRead());
			System.out.println("Write Permission"+f.canWrite());
		}
		else if(f.isDirectory())
		{
			int count=0;
			String ans="n";
			String farray[]=f.list();
			for(int i=0;i<farray.length;i++)
			{
				if(farray[i].endsWith(".txt"))
						{
							farray[i]=".//"+f+"//"+farray[i];
							File nwf=new File(farray[i]);
							System.out.println("Do you want to delete  "+nwf);
							ans=br.readLine();
							if(ans.equals("y")||ans.equals("Y"))
							{
								if(nwf.delete()){
									System.out.println("deleted successfully");
								}
								else
								{
									System.out.println("unable to delete");
								}
								count++;
							}
			}

		}

		System.out.println("Deleted text files count   "+count);
	}


	}//main



}//clas
