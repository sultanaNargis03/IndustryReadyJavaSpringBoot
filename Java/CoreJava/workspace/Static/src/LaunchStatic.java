class Parent12
{
	static void disp()
	{
		System.out.println("parent static disp()");
	}
	 void test()
	{
		System.out.println("parent test()");
	}
}

class Child12 extends Parent12
{
	//@Override
	
   static void disp()
	{
		System.out.println("child static");
	}
   void test()
	{
		System.out.println("child test");
	}
  
}
public class LaunchStatic 
{

	public static void main(String[] args) 
	{
		//method hiding
	    Parent12 p=new Child12();
	    p.disp();
	    
		Child12.disp();// behaving like a specialized mehod
        Child12 c=new Child12();
        //c.disp();
        
        //method overriding
        p.test();
        c.test();

	}

}
