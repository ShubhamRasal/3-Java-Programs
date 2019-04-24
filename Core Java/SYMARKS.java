package SY;
import java.io.*;

public class SYMARKS
{
	public int comptotal,mathstotal,eletotal;

	public	SYMARKS()throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter computer total");
		comptotal=Integer.parseInt(br.readLine());
		System.out.println("Entr maths total");
		mathstotal=Integer.parseInt(br.readLine());
		System.out.println("Enter Ele marks");
		eletotal=Integer.parseInt(br.readLine());
	}

	public int getcomp()
	{
		return comptotal;
	}
	public int getmath()
	{
		return mathstotal;
	}
	public int getele()
	{
		return eletotal;
	}

	public String toString()
	{
		return ("Compute Total"+comptotal+" Maths Total "+mathstotal+"  Elec Total: "+eletotal);
	}
}
