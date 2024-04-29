import java.util.Scanner;

public class LaunchApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("License App started");
		Scanner sc=new Scanner(System.in);//first pause  F8
		System.out.println("Enter the age");
		
		
		int age=sc.nextInt();//2nd breakpoint F8
		
	//	System.out.println(age);
//		Demo d=new Demo();
		disp();
		
		int minAge=18;
		int maxAge=60;
		
		
		if(age>=minAge && age<=maxAge)
		{
			System.out.println("Eligible for License as you're " + age);
		}
		else
		{
			System.out.println("Not eligible for license as you're still " + age);
		}
		
		System.out.println("License App logged out");

	}
	
	public static void disp()
	{

		System.out.println("Disp method of Demo class");
		for(int i=0;i<4;i++)
		{
			System.out.println(i);
		}
		System.out.println("Disp method activity finished");
	}

}
