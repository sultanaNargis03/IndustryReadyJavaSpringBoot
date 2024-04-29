package thread.synchronization.classlevel;

public class ATMThread extends Thread
{
	
	
	@Override
	public void run()
	{
		HSBCBank.withdraw(4000);
	}
	
	
}
