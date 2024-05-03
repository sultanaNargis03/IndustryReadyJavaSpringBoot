
public class Launchstatic1 
{
	static int a;
	
	static
	{
		a=10;
		System.out.println(a);
		System.out.println("static block");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Main method");

	}

}
