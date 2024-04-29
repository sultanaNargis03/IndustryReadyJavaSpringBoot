class Demo
{
	public void alpha()
	{
		System.out.println("ALpha");
		
		alpha();
	}
}


public class LaunchEH4 
{

	public static void main(String[] args) 
	{
		System.out.println("Main method");
		Demo d=new Demo();
		d.alpha();

	}

}
