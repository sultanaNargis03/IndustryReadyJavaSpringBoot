package thread.synchronization;

public class HSBCBank //extends Object
{
	
	int accountBal;
	String name="Rohan";
	
	public HSBCBank(int accountBal)
	{
		this.accountBal=accountBal;
	}
	
	synchronized public void withdraw(int withdrawalAmount)
	{
//		try {
//			Thread.sleep(30000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		if(accountBal<withdrawalAmount)
//		{
//			try {
//				wait();
//				//Thread.sleep(45000);//will not release lock it will go to sleep stat for specified time
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		accountBal=this.accountBal-withdrawalAmount;
	}
	
	synchronized public void deposit(int depositAmount)
	{
		accountBal=this.accountBal+depositAmount;
		//notifyAll();
	}
	synchronized public void checkBalance()
	{
		System.out.println("Account Balance is :"+ accountBal);
	}
	
	public void editingProfile(String name)
	{
		this.name=name;
	}
	

}
