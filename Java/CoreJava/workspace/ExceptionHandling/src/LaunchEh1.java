import java.security.DomainCombiner;
import java.util.Scanner;

public class LaunchEh1 
{
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println("Welcome to my app!");
			Scanner sc=new Scanner(System.in);
			System.out.println("Kindly enter the numerator to divivde");
			int num1=sc.nextInt();
			System.out.println("Kindly enter the denominator");
			int num2=sc.nextInt();
			int res=num1/num2;
			//int res=100/0;
			System.out.println("the res is: "+res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Please enter nonzero denominator!!");
		}
		System.out.println("Thank you for using my application");
		 
	}
}
