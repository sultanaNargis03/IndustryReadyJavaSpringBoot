import java.util.Scanner;

public class LaunchApp1 
{

	public static void main(String[] args) 
	{
		System.out.println("License App started");
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		
		int age=sc.nextInt();
		
		Demo d=new Demo();
		d.disp();
		
		int minAge=18;
		int maxAge=60;
		
		if(age>=minAge&&age<=maxAge)
		{
			System.out.println("Eligible for License as you're "+age);
			
		}
		else
		{
			System.out.println("Not eligible for License as you're still "+age);
		}
		System.out.println("License App Logged out");
	}

}
