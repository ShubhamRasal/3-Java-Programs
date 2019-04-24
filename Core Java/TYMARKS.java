package TY;
import java.io.*;

public class TYMARKS
{
	private int theory,pract;

	public TYMARKS() throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter theory marks");
		theory=Integer.parseInt(br.readLine());
                System.out.println("Enter pratical marks");
                pract=Integer.parseInt(br.readLine());
	}

	public int getTheory()
	{
		return theory;
	}
	public int getPract()
	{
		return pract;
	}

	public String toString()
	{
		return("Theory marks:"+theory+"   Pratical:"+pract);
	}


}
