package Series;

import java.io.*;


public class Square
{
	int no;
	public Square(int no)	{
	this.no=no;
	}

	public void print_Square()
	{
		for(int i=1;i<=no;i++)
		{
			System.out.println(i+" => "+i*i);
		}
	}
	public static void main(String arg[])
	{
		Square s=new Square(10);
		s.print_Square();
	}
}

