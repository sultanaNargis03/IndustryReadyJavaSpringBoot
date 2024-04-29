import java.util.Scanner;

class Farmer
{
	float pamt;
	float td;
	float si;
	
	static float ri;
	
	static
	{
		ri=3.15f;
	}
	
	void input()
	{
		System.out.println("Welcome to Loan App");
		Scanner sc=new Scanner(System.in);
		System.out.println("Farmer! kindly tell us how much amoount nedded?");
		pamt=sc.nextFloat();
		System.out.println("Farmer! kindly tell us how much time nedded to pay back?");
		td=sc.nextFloat();
				
	}
	void  compute()
	{
		si=pamt*td*ri/100.0f;
	}
	void disp()
	{
		System.out.println("The SI is : "+si);
	}
}


public class FarmerLoan 
{

	public static void main(String[] args) 
	{
		
		Farmer f1=new Farmer();
		Farmer f2=new Farmer();
		Farmer f3=new Farmer();
		
		f1.input();
		f1.compute();
		f1.disp();
		
		f2.input();
		f2.compute();
		f2.disp();
		
		f3.input();
		f3.compute();
		f3.disp();
		
	}

}
