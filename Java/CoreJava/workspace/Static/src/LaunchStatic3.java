class Demo2
{
	int a, b;
	
	static int count;
	
	
	
	{
		
		count++;
	}
	
	Demo2()
	{
		
//		{
//			
//			count++;  
//		}
		System.out.println("Constructor1");
		
	}
	
	Demo2(int a)
	{
		
//		{
//		
//		count++;  
//	}
		this.a=a;
		System.out.println("Constructor2");
		
	}
	
	Demo2(int a, int b)
	{
		
//		{
//		
//		count++;  
//	}
		this.a=a;
		this.b=b;
		System.out.println("Constructor3");
		
	}
}


public class LaunchStatic3 
{

	public static void main(String[] args) 
	{
		
		System.out.println(Demo2.count);//0
		Demo2 d1=new Demo2();
		System.out.println(Demo2.count);//1
		
		Demo2 d2=new Demo2(10);
		System.out.println(Demo2.count);//2
		
		Demo2 d3=new Demo2(10, 20);//3
		System.out.println(Demo2.count);
		
		
		

	}

}
