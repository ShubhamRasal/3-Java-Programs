import java.io.*;



class Student
{
	public String name;
	public int rno;
	public float per;
	public static int cnt=0;
	Student()
	{
	}

	public Student(int rn,String nam,float perc)
	{
		name=nam;
		rno=rn;
		per=perc;
		cnt++;

		displaycnt();
	}
	public static void displaycnt()
	{
		System.out.println("total objects:"+cnt);
	}

	public String toString()
	{
		return ("Name :"+name+"  Roll No :   "+rno+" Percenteage :"+per);
	}

}



public class UseStudent
{

	public static void sortStudent(Student arr[])
	{

		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if((arr[j].per)>arr[j+1].per)
				{
					Student temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
	}

	public static void main(String arg[])throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no of students");
		int cnt=Integer.parseInt(br.readLine());

		Student arr[]=new Student[cnt];

		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter name");
			String name=br.readLine();

			System.out.println("Enter roll no");
			int rno=Integer.parseInt(br.readLine());

			System.out.println("Enter percentage");
			float per=Float.parseFloat(br.readLine());

			arr[i]=new Student(rno,name,per);
	
		}
		sortStudent(arr);


	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	}//main
}//class
