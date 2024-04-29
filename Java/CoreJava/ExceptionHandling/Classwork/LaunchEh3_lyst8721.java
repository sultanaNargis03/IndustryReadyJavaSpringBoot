import java.util.Scanner;

public class LaunchEh3 {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to my app!");
		
		Scanner scan=null;
		try
		{
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
			System.out.println("getMessage() : "+ e.getMessage());
			System.out.println("toString() : "+ e.toString());
			
			
			
			System.out.println("please give non zero denominator!");
		}
		
		try
		{
		System.out.println("Kindly enter the size of an array");
		int size=scan.nextInt();
		
		int ar[]=new int[size];
		
		System.out.println("Kindly enter the elem to be inserted");
		int elem=scan.nextInt();
		//44
		System.out.println("kindly enter the position at which array has to be inserted");
		int pos=scan.nextInt();
		//2
		ar[pos]=elem;//ar[2]=44;
		System.out.println("Data inserted successfully!");
		}
		

		
		
		catch(NegativeArraySizeException e)
		{
			System.out.println("please be positive!!");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please be within your limits!");
		}
		
		catch(Exception e)
		{
			System.out.println("Invalid input");
		}
		
		
		
		
		System.out.println("Thank you for using my app!");

	}

}
