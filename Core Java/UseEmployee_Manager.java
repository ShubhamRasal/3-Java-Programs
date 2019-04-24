import java.io.*;

class Employee 
{
public int id;
public String name;
public String dept;
public double salary;


	public Employee()
	{
		id=0;
		name="";
		dept="";
		salary=0.0f;
	}
	public Employee(int eid,String ename,String edept,double esal)
	{
		id=eid;
		name=ename;
		dept=edept;
		salary=esal;
	}

	public void Accept() throws Exception
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter id");
		id=Integer.parseInt(br.readLine());

		System.out.println("Enter name");
		name=br.readLine();
		System.out.println("Enter dept");
		dept=br.readLine();

		System.out.println("Enter salary");
		salary=Double.parseDouble(br.readLine());

	}

	public void Display()
	{
		System.out.println("ID "+id+" Name "+name+" Dept  :"+dept+" Salary  :"+salary);  

	}

}//classi



class Manager extends Employee
{

	private double bonus;
	
	public Manager()
	{
		super();
	}

	public void Accept()throws Exception
	{
		super.Accept();
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter bonus");
			bonus=Double.parseDouble(br.readLine());

	}
	public void Display()
	{
		super.Display();
		System.out.println("Bonus:"+bonus);
	}

	public double getTotalSalary()
	{
		return(salary+bonus);
	}
}//manager

public class Slip25_1
{
	public static void main(String arg[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter no of manager");
		int cnt=Integer.parseInt(br.readLine());
	
		Manager arr[]=new Manager[cnt];

		for(int i=0;i<cnt;i++)
		{
			arr[i]=new Manager();
			arr[i].Accept();
			arr[i].Display();
		}

		int ino=0;
		double maxsal=0.0;
		for(int i=0;i<cnt;i++)
		{
			if(maxsal<arr[i].getTotalSalary())
			{
				maxsal=arr[i].getTotalSalary();
				ino=i;
			}
					
		}
		System.out.println("\n\n Maximum salary manager is");
			arr[ino].Display();


	}



}
