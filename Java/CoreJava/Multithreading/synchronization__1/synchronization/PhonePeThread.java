package thread.synchronization;

public class PhonePeThread extends Thread 
{
	private HSBCBank bankAccount;
	
	public PhonePeThread(HSBCBank bankAccount)
	{
		this.bankAccount=bankAccount;
	}
	
	@Override
	public void run()
	{
		bankAccount.checkBalance();
	}
}
