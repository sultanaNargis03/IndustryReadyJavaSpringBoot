import java.util.Scanner;

class UnderAgeException extends Exception
{
	public UnderAgeException(String msg)
	{
		super(msg);
	}
}

class OverAgeException extends Exception
{
	public OverAgeException(String msg)
	{
		super(msg);
	}
}
class Applicant
{
	int age;
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Kindly Enter your age");
		age=scan.nextInt();
	}
	
	public void verify() throws UnderAgeException, OverAgeException
	{
		if(age<18)
		{
			throw new UnderAgeException("Please clam down kid! your time will come. Patience!!!!");
		}
		else if(age>70)
		{
			throw  new OverAgeException("Your time is near! Be carefull stay home! ");
		}
		else
		{
			System.out.println("You are eligible to apply license please go ahead with process!");
		}
	}
	
}

class RTO
{
	public void initiate()
	{
		Applicant app=new Applicant();
		
		try
		{
			app.input();
			app.verify();
		}
		catch(UnderAgeException uae)//catch(UnderAgeException |OverAgeException uae)
		{
			System.out.println(uae.getMessage());
			try
			{
			app.input();
			app.verify();
			}
			catch(UnderAgeException ua)
			{
				System.out.println(ua.getMessage());
				System.out.println("You cannot proceed ahead! Contact officers");
			}
			
			catch(OverAgeException oa)
			{
				System.out.println(oa.getMessage());
				System.out.println("You cannot proceed ahead! Contact officers");
			}
		}
		catch(OverAgeException oae)
		{
			System.out.println(oae.getMessage());
			try
			{
			app.input();
			app.verify();
			}
			catch(UnderAgeException ua)
			{
				System.out.println(ua.getMessage());
				System.out.println("You cannot proceed ahead! Contact officers");
			}
			
			catch(OverAgeException oa)
			{
				System.out.println(oa.getMessage());
				System.out.println("You cannot proceed ahead! Contact officers");
			}
		}
	}
}


public class LaunchEh9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RTO rt=new RTO();
		rt.initiate();
		

	}

}
