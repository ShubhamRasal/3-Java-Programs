import java.io.*;

class InsufficientFundsException extends Exception
{
	int bal;
	public InsufficientFundsException(int balance)
	{
		bal=balance;
	}
	public String toString(){
	return ("Insufficient_Funds_Exception  ::Minimum Balance should be Rs.500 \nYour Total Balance is "+bal);
	}

}


class SavingAccount
{

private	int acno;//should be long
private	String name;
private	int balance;//should be float
private	BufferedReader br;

	public SavingAccount(int ac,String name,int balance)
	{
//		System.out.println("Inside SavingAccount");
	this.acno=ac;
	this.name=name;
	this.balance=balance;
	this.br=new BufferedReader(new InputStreamReader(System.in));
	}//const



	public void withdraw()
	{
		try{
		System.out.println("Enter Amount to Withdraw");
		int w_amout=Integer.parseInt(br.readLine());

		int temp=balance-w_amout;
		if(temp<500)
		{
			throw new InsufficientFundsException(balance);
		}//if closed
		else
		{
			this.balance=balance-w_amout;

			System.out.println("Transatction Successfull");
		}//else
		}//try closed
		catch(InsufficientFundsException e)
		{
			System.out.println(e);
		}
		catch(Exception eob){}
	}//withdraw

	
	public void deposit() throws Exception
	{

		System.out.println("Enter Amount to Deposit");
		int d_amount=Integer.parseInt(br.readLine());
		balance+=d_amount;

		System.out.println("Transaction Successfull,\n Total Balance "+balance);
	}//deposit


	public void viewbalance()
	{
		System.out.println("Total Balance is  "+balance);
	}//view balance

}//savingAccount


public class UseSavingAccount
{
	public static void main(String args[])
	{
		int ac;
		String name;
		int balance;

		
		try{		
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
			System.out.println("Enter accno");
			ac=Integer.parseInt(br.readLine());

			System.out.println("Enter name");
			name=br.readLine();

			System.out.println("Enter balance");
			balance=Integer.parseInt(br.readLine());

			SavingAccount sobj=new SavingAccount(ac,name,balance);
		
		while(true)
		{
		System.out.println("1.Deposit\n2.Withdraw\n3.View Balance\n4.Exit\nEnter choice");
		int ch=Integer.parseInt(br.readLine());
		switch(ch)
		{
			case 1:
			sobj.deposit();
			break;
			case 2:
			sobj.withdraw();
			break;
			case 3:
			sobj.viewbalance();
			break;
			case 4:
			System.exit(1);
			default:
			System.out.println("Wrong choice");
				
		}//switch
		}//while
		
	}//try
	catch(Exception e){}


	
	}//main 



}//slip5_1


