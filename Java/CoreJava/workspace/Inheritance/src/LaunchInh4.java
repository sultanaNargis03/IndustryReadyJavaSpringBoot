class Boss
{
	int age=14;
	
	void fly()
	{
		
		System.out.println("Boss is flying");
	}
}

class AeroPlane1 extends Boss
{
	int age=16;
	void takeOff()
	{
		
		System.out.println("Plane is taking off");
	}
	void fly()
	{
		
		System.out.println("Plane is flying");
	}
}

class CargoPlane1 extends AeroPlane1
{
	//int age=16;
	int age;
	void fly()
	{
		age=18;
		System.out.println(age);
		System.out.println(super.age);//18
		System.out.println("After overriding lets see");
		super.fly();
		
		
	}
	
	void landing()
	{
		System.out.println("CargoPlane is landing");
	}
}

//class FighterPlane1 extends AeroPlane1
//{
//	
//}

public class LaunchInh4 {

	public static void main(String[] args) 
	{
		//CargoPlane1 cp=new CargoPlane1(); 
		AeroPlane1 cp=new CargoPlane1(); //upcasting
		 
		cp.takeOff();// inherited method
		cp.fly();// overridden method
		
		((CargoPlane1) cp).landing();// down casting

	}

}
