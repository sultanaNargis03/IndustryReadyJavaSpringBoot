import java.util.Scanner;

class Farmer
{
	float pamnt;
	float td;
	float si;
	
	
	static float ri;
	
	static
	{
		ri=3.15f;
		
	}
	
	void input()
	{
		System.out.println("Welcome to Loan app!");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Farmer! kindly tell us how much amount needed?");
		pamnt=scan.nextFloat();
		System.out.println("Farmer! kindly tell us how much time needed to pay back?");
		td=scan.nextFloat();
	
	}
	void compute()
	{
		si=pamnt*td*ri/100.0f;
	}
	void disp()
	{
		System.out.println("The SI is : "+ si);
	}
	
}
public class LaunchFarmerLoan 
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
