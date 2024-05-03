
class Demo1
{
	int a=10;
	
	void disp()
	{
		//System.out.println(a);
		System.out.println("disp() of parent");
	}
}
class Demo2 extends Demo1
{
	int a=20;
	void disp()
	{
		//a=20;
		System.out.println(a);//20
		System.out.println(super.a);//10
		super.disp();
	}
	
}
public class LaunchInh6 
{
	public static void main(String[] args) 
	{
		Demo2 d=new Demo2();
		d.disp();

	}

}
