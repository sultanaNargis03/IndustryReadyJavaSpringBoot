package thread.synchronization.classlevel;

public class GooglePayThread extends Thread
{
  
	
	@Override
	public void run()
	{
		HSBCBank.deposit(12000);
	}
}
