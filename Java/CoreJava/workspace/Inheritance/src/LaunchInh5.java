
class Animal1
{
	int age;
	
	Animal1()
	{
		age=2;
		System.out.println("Zero Param Animal Cons");
	}
	Animal1(int age)
	{
		this.age=age;
		System.out.println(" Param Animal Cons");
	}	
}
class Lion extends Animal1
{
	
	int noOfLegs;
	
	Lion()
	{
		//super();
//		this(4);
		super(6);
		System.out.println("Zero Param Lion Cons");
	}
	
	Lion(int noOfLegs)
	{ 
		//super();
//		super(4);
		this();
		this.noOfLegs=noOfLegs;
		System.out.println(" Param Lion Cons");
	}
	 void disp()
	 {
		 System.out.println(age);
		 System.out.println(noOfLegs);
	 }
}
public class LaunchInh5 
{

	public static void main(String[] args) 
	{
//		Lion lion=new Lion();
//		lion.disp();
		
		Lion lion2=new Lion(4);
		lion2.disp();
	}

}
