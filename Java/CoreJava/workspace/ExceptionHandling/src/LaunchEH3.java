import java.util.Scanner;

public class LaunchEH3 {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to my app!");
		Scanner sc=new Scanner(System.in);
		
		try
		{
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
		try 
		{
			System.out.println("Enter the size of an array");
			int size=sc.nextInt()	;
			int ar[]=new int[size];
			System.out.println("enter the element to be inserted");
			int elem=sc.nextInt();
			System.out.println("enter the position at which array has to be inserted");
			int pos=sc.nextInt()	;
			ar[pos]=elem;	
			System.out.println(" data inserted successfully");
		}
		
		catch(NegativeArraySizeException e)
		{
			System.out.println("Please be positive!!");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please be within your limit!!");
		}
		catch(Exception e)
		{
			System.out.println("Invalid input!!");
		}
		
		System.out.println("Thank you for using my application");
	}

}
