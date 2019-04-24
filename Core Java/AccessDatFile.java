import java.io.*;


class ItemInfo
{

	private int id,qty;
	private String name;
	private float price;

	ItemInfo(){}

	ItemInfo(int id,String name,float price,int qty)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.qty=qty;
	}



	//not copy constructor but same as copy cont
	
	void Itemcopy(ItemInfo e)
	{
	this.id=e.id;
	this.name=e.name;
	this.price=e.price;
	this.qty=e.qty;
	}



	void store(RandomAccessFile f)throws Exception
	{
		f.writeInt(id);
		f.writeUTF(name);
		f.writeFloat(price);
		f.writeInt(qty);
	}

	void access(RandomAccessFile f)throws Exception
	{
		this.id=f.readInt();
		this.name=f.readUTF();
		this.price=f.readFloat();
		this.qty=f.readInt();
	}

	public String getName() //required coz characteristcs are private
	{
		return this.name;
	}
	public float getPrice(){
		return this.price;
	}

	public String toString()
	{
		return ("Name: "+name+" ID: "+id+"  price: "+price+" qty: "+qty);
	}

}//iteminfo



public class AccessDatFile
{

	public static void main(String arg[]) throws Exception
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	ItemInfo info=new ItemInfo();// required to call default because in switch case
       //	when we have to use there is giving error not initliased
	RandomAccessFile file=new RandomAccessFile("item.dat","rw");

	System.out.println("How any records you want enter?");
	int cnt=Integer.parseInt(br.readLine());

	for(int i=0;i<cnt;i++)
	{
		System.out.println("Enter Record Information");
		System.out.println("Enter id");
		int id=Integer.parseInt(br.readLine());
		System.out.println("Enter name");
		String iname=br.readLine();
		System.out.println("Enter price");
		float price=Float.parseFloat(br.readLine());
		System.out.println("Enter qty:");
		int qty=Integer.parseInt(br.readLine());
		
		//create new object for every record
		info=new ItemInfo(id,iname,price,qty);

		//store record in file which is RAF-> file ^
		info.store(file);// write records into given file handler
		
	}//for

	while(true){
	System.out.println("Operations");
	System.out.println("1.Search by name\n2.Find costliest(most expensive)\n3.Display all items and total cost\n4.exit");
		int 	ch=Integer.parseInt(br.readLine());

		switch(ch){
		case 1:
			file.seek(0);// for searching we have to start from staring
			System.out.println("Enter name");
			String it_name=br.readLine();
			boolean flag=false;
			for(int i=0;i<cnt;i++)//*cnt*// remeber this for loooop
			{
				info.access(file);
				if(info.getName().equals(it_name))
				{
					flag=true;
					System.out.println(info);//only possible beacuse we have written toString mathod
				}
			}
			if(flag!=true)//flag==false
			{
				System.out.println("NOT FOUND");
			}
			break;
		case 2:
			file.seek(0);// never forget to start file searching
						// from start
			ItemInfo costliestobj=new ItemInfo();
			float mxprice=-99.9f;// leat as possible
			for(int i=0;i<cnt;i++)// remeber
			{
				info.access(file);
				if(info.getPrice()>mxprice)
				{
					mxprice=info.getPrice();//maxlogic
					costliestobj.Itemcopy(info);
						//here we need method like
						// copy constrctor to copy
						// one boj into antother
				}
			}
			System.out.println(costliestobj);
			break;
		case 3:
			file.seek(0);
			float total=0.0f;
			for (int i=0;i<cnt;i++)
			{
				info.access(file);
				total=total+info.getPrice();
				System.out.println(info); // if we have not write toString we 
				//have to write very big sop
			}
			System.out.println("Total Cost:"+total);
			// in total cost we havent consider  quantity
			// if we want to conside quantity
			// write getqty() in iteminfo publicily and access
			// total=total+getPrice()*getqty();
			break;

		case 4:
			System.exit(1);
			break;

		}//switch

	}//while
	}//main


}//class
