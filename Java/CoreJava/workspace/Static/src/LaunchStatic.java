class Parent12
{
	static void disp()
	{
		System.out.println("static disp()");
	}
}

class Child12 extends Parent12
{
	//@Override
	
   static void disp()
	{
		System.out.println("child static");
	}
}
public class LaunchStatic 
{

	public static void main(String[] args) 
	{
		Child12.disp();
        Child12 c=new Child12();
        c.disp();
	}

}