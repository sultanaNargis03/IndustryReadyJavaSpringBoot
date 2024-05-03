class SomeClass
{
	static 
	{
		System.out.println("Static block in some other class not in main");
	}
	
	static void disp()
	{
		System.out.println("disp");
	}
	
}
public class LaunchDemo 
{
	static
	{
		System.out.println("static block in main method class");
	}

	public static void main(String[] args) 
	{
		SomeClass.disp();

	}

}
