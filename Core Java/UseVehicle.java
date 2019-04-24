import java.io.*;


class Vehicle 
{

	public String company;
	public double price;
	public int light,heavy;

	public Vehicle()
	{
	}

	public Vehicle(String name,double pr)
	{
		company=name;
		price=pr;
	}

	public String toString()
	{
		return("Name :"+company+"   Price :"+price);
	}


	
}//class



class LightMotorVeh extends Vehicle
{
	public float milage;

	public LightMotorVeh(String name,double pri,float mil)
	{
		super(name,pri);
		this.milage=mil;
		light=1;
	}

	public String toString()
	{
		return("Name :"+company+"   Price :"+price+"  Milage  :"+milage);
	}



}//light

class HeavyMotorVeh extends Vehicle
{
	public int cap_in_tons;

	public HeavyMotorVeh(String name,double price,int cap)
	{
		super(name,price);
		cap_in_tons=cap;
		heavy=1;
	}
	public String toString()
	{
		return("Name :"+company+"   Price :"+price+" Capacity in tons:  "+cap_in_tons);
	}

}



public class Slip24_1
{

	public static void main(String arg[]) throws Exception
	{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter total no of vehicle?");
		int cnt=Integer.parseInt(br.readLine());

		Vehicle arr[]=new Vehicle[cnt];

		for(int i=0;i<cnt;)
		{
			System.out.println("Enter company name");
			String name=br.readLine();

			System.out.println("Enter price");
			double price=Double.parseDouble(br.readLine());

			System.out.println("Enter type of vehicle/n1.Light weight vehicle/n2.heavy vehicle");
			int ch=Integer.parseInt(br.readLine());


			switch(ch)
			{
				case 1:
					System.out.println("Enter milage");
					float mil=Float.parseFloat(br.readLine());

					arr[i]=new LightMotorVeh(name,price,mil);
					i++;
					break;
				case 2:
					System.out.println("Enter capacity in tons");
					int cap=Integer.parseInt(br.readLine());
					arr[i]=new HeavyMotorVeh(name,price,cap);
					i++;
					break;
				default:
					System.out.println("Wrong chocie please enter all details again");
					break;
			}

		}//


		System.out.println("Vehicles Information");
		System.out.println("Light motor vehicle");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].light==1)
			{
				System.out.println(arr[i]);
			}
        	}


		System.out.println("Heavy motor vehicle");
                for(int i=0;i<arr.length;i++)
                {
                        if(arr[i].heavy==1)
                        {
				System.out.println(arr[i]);
                        }
                }

	}




}

