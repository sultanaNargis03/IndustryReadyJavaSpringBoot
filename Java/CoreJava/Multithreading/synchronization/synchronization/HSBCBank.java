package thread.synchronization;

public class HSBCBank 
{
	
	int accountBal;
	String name="Rohan";
	
	public HSBCBank(int accountBal)
	{
		this.accountBal=accountBal;
	}
	
	synchronized public void withdraw(int withdrawalAmount)
	{
		accountBal=this.accountBal-withdrawalAmount;
	}
	
	synchronized public void deposit(int depositAmount)
	{
		accountBal=this.accountBal+depositAmount;
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
