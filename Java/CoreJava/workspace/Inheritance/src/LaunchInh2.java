class SuperHuman //extends Object
{
	void show()  //plus Object class all mehtods
	{
		System.out.println("Super human");
	}
}
//Multileler inheritance is allowed
class Human1 extends SuperHuman
{
	private int age;// private member will not participate in inheritance
	
	void disp()// plus superhuman class mehtods plus Object methods
	{
		System.out.println("Human class method");
	}
}

class Employee extends Human1 //extends SuperHuman //multilever is allowed not multiple
{
	void showAge()// plus Human methods plus superhuman methos plus objects
	{
		//age=18;
		//System.out.println(age);
		System.out.println("Show Age");
	}
}

public class LaunchInh2 
{

	public static void main(String[] args) 
	{
		Employee e=new Employee();
		e.showAge();
		e.disp();
		e.show();
		

	}

}
