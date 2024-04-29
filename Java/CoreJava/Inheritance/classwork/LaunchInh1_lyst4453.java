//Parent class//Base class//Superclass
class Human
{
	void sleep()
	{
		System.out.println("Human needs sleep");
	}
}
//child class// sub class  // derived class
class Student extends Human
{
	
}

//class Animal
//{
//	void eat()
//	{
//		System.out.println("ANimal eating");
//	}
//}
//
//class Pen extends Animal
//{
//	
//}


public class LaunchInh1 
{
	public static void main(String[] args) 
	{
		
		Student std=new Student();
		std.sleep();
		
		
//		Pen p=new Pen();
//		p.eat();
	}

}
