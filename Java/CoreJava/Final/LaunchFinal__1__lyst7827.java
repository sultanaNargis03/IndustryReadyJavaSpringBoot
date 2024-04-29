//final keyword

//final class Alpha
//{
//	public void disp()
//	{
//		System.out.println("Alpha ");
//	}
//}
//
//class Beta extends Alpha
//{
//	
//}

 class Alpha
{
	public final float pi=3.14f;
	final public void disp()
	{
		//pi=2.4f; final variable cannot be changed.
		System.out.println("Alpha ");
	}
}
final class Beta extends Alpha
{
//	public void disp()
//	{
//		System.out.println("Alpha ");
//	}
}
public class LaunchFinal 
{

	public static void main(String[] args) 
	{
		Beta a=new Beta();
		a.disp();

	}

}
