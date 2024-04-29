import java.util.Scanner;

class InvalidUserException extends Exception
{
	public InvalidUserException(String msg)
	{
		super(msg);
	}
}


class Atm
{
	private int acc_num=1111;
	private int password=2222;
	
	int acNo;
	int pw;
	
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Kindly! Enter your accNum");
		acNo=scan.nextInt();
		System.out.println("Kindly! Enter your PIN");
		pw=scan.nextInt();
	}
	
	public void verify() throws InvalidUserException
	{
		if(acc_num==acNo && password==pw)
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Kindly! Enter your amount required ");
			int amount=scan.nextInt();
			System.out.println("Collect your cash : "+ amount);
			
		}
		else
		{
			
			//throw new InvalidUserException();
//			InvalidUserException iue=new InvalidUserException();
//			System.out.println("Wrong credentials! Are you sure youre using your own credentials?");
//			throw iue;
			
			throw new InvalidUserException("Wrong credentials! Are you sure youre using your own credentials?");
			
		}
	}	
}
class Bank
{
	public void initiate()
	{
		System.out.println("Welcome to Telusko Bank");
		Atm atm=new Atm();
		try
		{
		atm.input();
		atm.verify();
		}
		catch(InvalidUserException e)
		{
			System.out.println(e.getMessage());
			try
			{
			atm.input();
			atm.verify();
			}
			catch(InvalidUserException iue)
			{
				System.out.println(iue.getMessage());
				try
				{
				atm.input();
				atm.verify();
				}
				catch(InvalidUserException iu)
				{
					System.out.println(iu.getMessage());
					System.out.println("3 chances I have given still wrong credentials! "
							+ " You're a LEGEND!"
							+ " BLOCKED!!!");
				}
			}
		}
	}
}
public class LaunchEH8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank();
		b.initiate();

	}

}
