class Demo3
{
	
	static void disp2()
	{
		System.out.println("static disp method");
	}
	
	void disp1()
	{
		System.out.println("Non static disp method");
	}
}



public class LaunchDemo3 
{

	public static void main(String[] args) 
	{
		Demo3.disp2();
		
		//Demo3.disp1();
		
		Demo3 d3=new Demo3();
		d3.disp1();
		d3.disp2();

	}

}
