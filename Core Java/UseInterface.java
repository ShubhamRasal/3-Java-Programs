import java.io.*;

interface CreditCardInterface
{
	 abstract void viewCreditAmount();
	 abstract void useCard()throws Exception;
	 abstract void payCard()throws Exception;
	 abstract void increaseLimit()throws Exception;
}


class SilverCardCustomer implements CreditCardInterface
{
	public String name,cno;
	public double crdAmt,crdLmt;
	public BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	SilverCardCustomer()
	{
		crdAmt=0;
		crdLmt=50000.0;
	}
	SilverCardCustomer(String nm,String cn)
	{
		this();
		name=nm;
		cno=cn;
	}
//	@override  NOTE::All override methods***should*** be"*"*"*"public"*"*""*"*";

	public	void viewCreditAmount() // public nasel tr error to frustrate karto
	{
		System.out.println("Total Credit:"+crdAmt);
	}

	public void useCard() throws Exception
	{
		System.out.println("Enter amount (increse crdamt): ");
		double amt=Double.parseDouble(br.readLine());
		
		crdAmt=crdAmt+amt;
		if(crdAmt>crdLmt)
		{
			System.out.println("Exceeds Card Limit");
			crdAmt=crdAmt-amt;
		}
		System.out.println("Total credit "+crdAmt);
	}

	public void payCard()throws Exception
	{
		System.out.println("Enter Amount to pay(reduce crdamt)");
		double amt=Double.parseDouble(br.readLine());

		if(crdAmt-amt>=0)
		{
			crdAmt=crdAmt-amt;
		
		System.out.println("Transaction paied successfully");
		}
		else
		{
			System.out.println("Amout exceeds than loan");
		}
	}
	public void increaseLimit()throws Exception
	{
	}

}//silver


class GoldCardCustomer extends SilverCardCustomer
{
	static int cnt=3;
	GoldCardCustomer()
	{
		this.crdLmt=100000;
	}
	GoldCardCustomer(String nm,String cno)
	{
		super(nm,cno);
		this.crdLmt=100000;	
	}
	public void increaseLimit()throws Exception
	{
		if(cnt!=0){
		System.out.println("How much you want to increase cardLimit");
		Double amt=Double.parseDouble(br.readLine());

		if(amt>5000)
		{
			System.out.println("Amount exceeds limit increase amount");
		}else
		{
			crdLmt=crdLmt+amt;
			cnt--;
			System.out.println("Limit increases Successfully total limit: "+crdLmt);
		//viewCreditAmount();
		}
	}else
	{
		System.out.println("Exceeds chances");
	}
	}//function
}//class

public class UseInterface
{

	public static void main(String arg[])throws Exception{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		SilverCardCustomer sobj=null;
		//GoldCardCustomer gobj=null;
	System.out.println("Enter 1.Silver card customer\n2.Gold card Cutomer");
	int ch=Integer.parseInt(br.readLine());

			System.out.println("Enter name");
			String name=br.readLine();
			
			String cno;
			while (true)
			{
			System.out.println("Enter card  no");
			 cno=br.readLine();
				if(cno.length()==16)
				{
				break;
				}
				else
				System.out.println("wrong card number");
			}
	if(ch==2){	
	 sobj=new GoldCardCustomer(name,cno);
	}
	else if(ch==1){
		sobj=new SilverCardCustomer(name,cno);
	}else
	{System.exit(1);
	}	
	
	while(true){
	System.out.println("1.use card (loan)\n2.pay card (pay loan)\n3.view credit amout\n.4.increse limit");
	int choice=Integer.parseInt(br.readLine());
	switch(choice)
	{	
	case 1:
	sobj.useCard();
	break;
	case 2:
	sobj.payCard();
	break;
	case 3:
	sobj.viewCreditAmount();
	break;
	case 4:
	if(ch==2)
	{
		sobj.increaseLimit();
	}
	else
	{
		System.out.println("Only avilable for gold card");
	}
	default:
	System.exit(1);
	
	}//switch
	
	}//while
	
	
	}//main

}//class
