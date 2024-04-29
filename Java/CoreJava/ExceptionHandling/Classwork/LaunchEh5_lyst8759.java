import java.util.Scanner;

class Alpha1
{
	
	public void alpha()throws ArithmeticException
	{
		System.out.println("Welcome to my app!");
		
		Scanner scan=null;
		
		 scan=new Scanner(System.in);
		System.out.println("Kindly enter the numerator to divide");
		int num1=scan.nextInt();
		System.out.println("Kindly enter the denominator");
		int num2=scan.nextInt();
		
		int res=num1/num2;

		System.out.println("The res is : "+ res);
		System.out.println("Thank for using our app");
	}
}
public class LaunchEh5 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
		System.out.println("Main connection established");
		Alpha1 a =new Alpha1();
		a.alpha();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception is caught in main method");
		}
		System.out.println("Main connection terminated");
		

	}

}
