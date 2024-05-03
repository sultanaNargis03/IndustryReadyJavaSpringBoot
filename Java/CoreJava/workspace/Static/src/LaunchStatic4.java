class Test
{
	static int a, b;
	
	static
	{
		a=100;
		b=200;
	}
	{
		System.out.println("java block");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
	}
	Test()
	{
		System.out.println("constructor");
	}
}
public class LaunchStatic4 {

	public static void main(String[] args) 
	{

		Test obj=new Test();
		Test obj2=new Test();

	}

}
