 abstract class shape
{
	final float pi=3.14f;
	abstract float area();
	abstract float volume();
}


class shpere extends shape
{
	float r;
	shpere(float radius)
		{
			this.r=radius;
		}
//	@override
	float area()
	{
		return (4*pi*r*r);//4*pi*radius2
	}
//	@override
	float volume()
	{
		return ((4/3)*pi*(r*r*r));//(4/3)pi*radius cube
	}
}//shpere closed
class cylinder extends shape
{
        float r;
	float h;
        cylinder(float radius,float height)
                {
			this.h=height;
                        this.r=radius;
                }
  //      @override
        float area()
        {
                return ((2*pi*r*h)+(2*pi*r*r));// 2piradius*heigth)+(2*pi*radius square);
 	}
    //    @override
        float volume()
        {
                return (pi*(r*r)*h);//pi*radius_square*heigth
        }
}//cyliner

class cone extends shape
{
        float r;
        float h;
	cone(float radius,float height)
                {
			this.h=height;
                        this.r=radius;
                }
      //  @override
        float area()
        {
                return (pi*r*(r+(float)Math.sqrt((h*h)+(h*r))));
	}
       // @override
        float volume()
        {
                return (pi*(r*r)*(h/3));
        }
}//cone


class UseShape
{
	public static void main(String args[])
	{
		shape s1=new shpere(2.2f);
		System.out.println("Area of shpere"+s1.area());
		 System.out.println("Area of shpere"+s1.volume());

	 	 shape s2=new cylinder(2.2f,3.3f);
                System.out.println("Area of shpere"+s2.area());
                 System.out.println("Area of shpere"+s2.volume());

		shape s3=new cone(4.2f,4.3f);
                System.out.println("Area of shpere"+s3.area());
                 System.out.println("Area of shpere"+s3.volume());
	}
}//main class closed



