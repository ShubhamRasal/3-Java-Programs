import java.io.*;

class CricketPlayer
{
	public String name;
	public int no_of_innings;
	public int no_of_times_notout;
	public int total_runs;
	public float bat_avg;

	CricketPlayer(String cname,int ing,int nout,int runs)
	{

		name=cname;
		no_of_innings=ing;
		no_of_times_notout=nout;
		total_runs=runs;
		bat_avg=0;
	}
	public String toString()
	{
		return("Name:"+name+" No Innings: "+no_of_innings+"  NO of times Notout :  "+no_of_times_notout+ "  Total Runs : "+total_runs+" Bating Avg "+bat_avg);
	}
}//class cricketplayer

class test{

	public static void calcAvg(CricketPlayer arr[])
	{
		for(int i=0;i<arr.length;i++) // zero value condition and exception
		{
			arr[i].bat_avg=arr[i].total_runs/arr[i].no_of_innings;
		}
	}

	public static void sortplayer(CricketPlayer []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if((arr[j].bat_avg)>(arr[j+1].bat_avg))
				{
					CricketPlayer temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}//class cricketplayertest

public class UseCricketPlayer extends test
{

	public static void main(String arg[]) throws Exception
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Enter number of player");
	int no=Integer.parseInt(br.readLine());

	CricketPlayer arr[]=new CricketPlayer[no];
	for(int i=0;i<no;i++)
	{
		System.out.println("Enter Name");
		String name=br.readLine();

		System.out.println("Enter no of innings");
		int innig=Integer.parseInt(br.readLine());
		
		System.out.println("Enter no of time not out");
		int nout=Integer.parseInt(br.readLine());

		System.out.println("Enter total runs");
		int total=Integer.parseInt(br.readLine());

		arr[i]=new CricketPlayer(name,innig,nout,total);
		
	}

	calcAvg(arr);
	sortplayer(arr);
		
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}


	}


}

