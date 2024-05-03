class Demo
{
	static int a,b;
	
	int x, y;
	
	static
	{
		a=10;
		b=20;
		System.out.println("static initialization block");
	}
	
	//Java Initialization block
	{
		x=100;
		y=200;
		System.out.println("Java non static initialization block");
	}
	
	Demo()
	{
		
//		{
//			x=100;
//			y=200;
//			System.out.println("Java non static initialization block");
//		}
		System.out.println("Constructor!");
	}
	static void disp1()
	{
		
		System.out.println("static disp method");
		System.out.println(a);
		System.out.println(b);
	}	
	void disp2()
	{
		a=10;
		b=20;
		System.out.println("non static disp method");
		System.out.println(x);
		System.out.println(y);
	}	
}
public class Launchstatic2 
{
	public static void main(String[] args) 
	{
		
		Demo d=new Demo();
	     Demo.disp1();
		d.disp2();
		
		

	}

}