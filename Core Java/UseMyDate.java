import java.io.*;

class InvalidDateException extends Exception
{
	String str1;
	InvalidDateException(String str2){
		str1=str2;
	}

	public String toString(){
		return ("InvalidDateException :: "+str1);
	}
}//userdefinedexcp

class MyDate
{
	int dd;
	int mm;
	int yyyy;

	public MyDate(){
	}



	public boolean accept(){
	try{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Enter Date");
	 dd=Integer.parseInt(br.readLine());
	
	System.out.println("Enter Month");
	 mm=Integer.parseInt(br.readLine());

	System.out.println("Enter year");
	yyyy=Integer.parseInt(br.readLine());

	
		if((dd<=0)||(dd>31))
		{
			throw new InvalidDateException("Invalid Date");
		}
		if((mm<=0)||(mm>12))
		{
			throw new InvalidDateException("Invalid Month");
		}
		if(yyyy<0)
		{
			throw new InvalidDateException("Invalid Year");
		}
		if((dd==29)&&(mm==2)&&((yyyy%4)!=0))
		{
			throw new InvalidDateException("Not Leap Year");
		}
		if((dd==31)&&((mm%2)==0))
		{
			throw new InvalidDateException("Wrong date in Wrong Month");
		}
	}//try
		catch(InvalidDateException eobj)
		{
			System.out.println(eobj);
		return false;
		}
		catch(Exception e){}
		
	return true;
	}//accept



	public void Display()
	{
	System.out.println("Your Date ::"+dd+"/"+mm+"/"+yyyy);
	}//Display	

}//class closed

public class UseMyDate
	{
public static void main(String arg[])
{
 MyDate obj=new MyDate();

 if(obj.accept())
 {
	 obj.Display();
 }



}//main
}//class
