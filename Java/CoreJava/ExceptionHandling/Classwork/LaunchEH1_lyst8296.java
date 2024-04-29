import java.util.Scanner;

public class LaunchEH1 
{

	public static void main(String[] args)
	{
		System.out.println("Welcome to my app!");
		try
		{
		Scanner scan=new Scanner(System.in);
		System.out.println("Kindly enter the numerator to divide");
		int num1=scan.nextInt();
		System.out.println("Kindly enter the denominator");
		int num2=scan.nextInt();
		
		
		int res=num1/num2;
		
//		int res=100/0;
		
		System.out.println("The res is : "+ res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Pleease guve non zero denominator");
		}
		
		System.out.println("Thank you for using my app!");

	}

}
