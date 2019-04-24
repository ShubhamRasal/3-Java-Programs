import java.io.*;




public class FileOrDirectory 
{


	public static void main(String arg[])
	{
		String filename=arg[0];

		File f=new File(filename);

		if(f.isFile())
		{
			System.out.println("File Name:"+f);
			System.out.println("File Path:"+f.getPath());
			System.out.println("File Size :"+f.length()+"Bytes");
			System.out.println("File Read Permission:"+f.canRead());
			System.out.println("File Write Permissiom"+f.canWrite());
			System.out.println("File Parent Drirecotry"+f.getParent());	
		
		}
		else if(f.isDirectory())
		{
			String fname[]=f.list();
			for(int i=0;i<fname.length;i++)
			{
				if(fname[i].endsWith(".txt")){
				System.out.println(fname[i]);
				}
			}
			System.out.println("TotalFiles are :"+fname.length);
			System.out.println("is directory");
		}
	
	
	}//main



}//class
