class Plane1
{
	
}
class FighterPln extends Plane1
{
	
}
class Human2
{
	public void sleep(int a, int b)
	{
		System.out.println("Human is sleeping");
			
	}
	
//	public int eat()
//	{
//		System.out.println("Human needs to eat");
//		return 10;
//	}
	
	public Plane1 eat()
	{
		System.out.println("Human needs to eat");
		Plane1 p=new Plane1();
		return p;
	}
}

class Employee2 extends Human2
{
	public void sleep()
	{
		System.out.println("Employee needs sleep between working hour!");
		
	}
	
	public void sleep(int a, int b)
	{
		System.out.println("Human is sleeping");
			
	}
	
//	public void eat()
//	{
//		System.out.println("Employee  needs to eat so that we can have a NAP in office hour");
//		return 1;
//	} We cannot change return type of overridden  methods.
	
	public FighterPln eat()
	{
		System.out.println("Employee too needs to eat");
		FighterPln fp=new FighterPln();
		return fp;
	}	
}
public class LaunchInh7 
{
	public static void main(String[] args) 
	{

		Employee2 emp=new Employee2();
		emp.sleep();
		emp.eat();

	}

}
