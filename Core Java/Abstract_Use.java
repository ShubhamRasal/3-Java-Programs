import java.io.*;


abstract class Staff
{
	public String name;
	public String address;
	public int flag;   //to detrmine staff member is fulltime or part tim
	Staff(String ename,String eadd,int e)
	{
		name=ename;
		address=eadd;
		flag=e;
	}
}//Staff

class FullTimeStaff extends Staff
{

	public String dept;
	public float sal;

	FullTimeStaff(String ename,String eadd,String edept,float salary)
	{
		super(ename,eadd,1);
		dept=edept;
		sal=salary;
	}

	public String toString()
	{
		return("Name:"+name+" Add:"+address+" Dept:"+dept+" salary: "+sal);
	}
}//FullTimeStaff

class PartTimeStaff extends Staff
{
	public int hrs;
	public float rate;

	PartTimeStaff(String ename,String eadd,int ehrs,int erate)
	{
		super(ename,eadd,0);
		hrs=ehrs;
		rate=erate;
	}

	 public String toString()
        {
                return("Name:"+name+" Add:"+address+" HRS:"+hrs+" rate: "+rate);
        }

}//PartTimeStaff

public class Abstract_Use
{

	public static void main(String arg[]) throws Exception
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));;

	System.out.println("Enter no of records");
	int cnt=Integer.parseInt(br.readLine());
	Staff arr[]=new Staff[cnt]; // we cant create object of abstract class
				// but here we are created array of ref.
	for(int i=0;i<cnt;i++)
	{
		System.out.println("Enter name");
		String ename=br.readLine();
		System.out.println("Enter address");
		String eadd=br.readLine();


		System.out.println("\n1.Full time ?\n2.Part time");
	       int ch=Integer.parseInt(br.readLine());

		switch(ch)
		{
			case 1:
				System.out.println("Enter dept");
				String edept=br.readLine();
				System.out.println("Enter salary");
				float esal=Float.parseFloat(br.readLine());

				arr[i]=new FullTimeStaff(ename,eadd,edept,esal);
				break;
			case 2:
				System.out.println("Enter no of hrs");
				int ehrs=Integer.parseInt(br.readLine());
				System.out.println("Enter rate");
				int erate=Integer.parseInt(br.readLine());

				arr[i]=new PartTimeStaff(ename,eadd,ehrs,erate);
				break;
			
		}//switch		
          
	}

	System.out.println("Full time ");
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i].flag==1)
		{
			System.out.println(arr[i]);
		}
	}

	 System.out.println("Part time ");
        for(int i=0;i<arr.length;i++)
        {
                if(arr[i].flag==0)
                {
                        System.out.println(arr[i]);
                }
        }



	}//main

}//Slip17_1

