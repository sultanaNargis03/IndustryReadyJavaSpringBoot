package thread.synchronization.classlevel;

public class PhonePeThread extends Thread 
{
	
	
	@Override
	public void run()
	{
		HSBCBank.checkBalance();
	}
}
