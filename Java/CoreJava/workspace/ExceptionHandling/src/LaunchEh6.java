import java.util.Scanner;

class Alpha2
{
	
	public void alpha()throws ArithmeticException
	{
		try
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
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception caught is alpha itself");
			
			throw e;
		}
		finally 
		{
		System.out.println("Thank for using our app");
		}
	}
}
public class LaunchEh6 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
		System.out.println("Main connection established");
		Alpha2 a =new Alpha2();
		a.alpha();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception caught in main");
		}
		
		System.out.println("Main connection terminated");
		

	}

}
