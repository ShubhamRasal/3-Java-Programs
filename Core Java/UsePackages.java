import SY.SYMARKS;
import TY.TYMARKS;

import java.io.*;

class Student
{
	public String name;
	public int rollno;
	public SYMARKS sy;
	public TYMARKS ty;
	char grade;
	Student(int rno,String snm) throws Exception
		{
			this.rollno=rno;
			this.name=snm;
			sy=new SYMARKS();
			ty=new TYMARKS();
			
			int total=sy.getcomp()+ty.getTheory()+ty.getPract();
			float per=total/5.0f;

			if(per<40)
			{
				grade='F';
				System.out.println("F");
			}else
		       	if(per>=70)
			{
				grade='A';
			}else
			if(per>=60)
			{
				grade='B';
			}else
			if(per>=50)
			{
				grade='c';
			}else if(per>=40)
			{
				grade='D';
			}
		}

	public String toString()
	{
		return("Name:"+name+"    Rollno :"+rollno+"\nSy Marks\n:"+sy+"\nTy marks\n"+ty+"\n\tGrade:  "+grade);
	}

}//studnet





public class UsePackages
{
	public static void main(String arg[]) throws Exception
	{
		System.out.println("Enter no of students");
		BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
		int cnt=Integer.parseInt(br.readLine());
		Student arr[]=new Student[cnt];

		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter rollno");
			int rno=Integer.parseInt(br.readLine());
			System.out.println("Enter name");
			String name=br.readLine();
			
			arr[i]=new Student(rno,name);
			
		}
	
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}//main
}//class
