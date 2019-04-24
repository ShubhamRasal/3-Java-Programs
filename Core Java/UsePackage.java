import Series.Prime;
import Series.Square;


public class UsePackage
{
public static void main(String arg[])
{

	Prime pobj=new Prime(10);
	Square sobj=new Square(10);
	System.out.println("Prime Numbers");
	pobj.print_prime();
	System.out.println("Sqaure numbers");
	sobj.print_Square();

}//main

}//class
