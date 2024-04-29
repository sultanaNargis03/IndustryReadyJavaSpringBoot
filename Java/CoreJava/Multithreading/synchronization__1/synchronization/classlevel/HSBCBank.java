package thread.synchronization.classlevel;

public class HSBCBank 
{
	
	static int accountBal =4000;
	String name="Rohan";
	
//	public HSBCBank(int accountBal)
//	{
//		this.accountBal=accountBal;
//	}
	
	synchronized public static void withdraw(int withdrawalAmount)
	{
		accountBal=accountBal-withdrawalAmount;
	}
	
	synchronized static public void deposit(int depositAmount)
	{
		accountBal=accountBal+depositAmount;
	}
	synchronized static public void checkBalance()
	{
		System.out.println("Account Balance is :"+ accountBal);
	}
	
	public void editingProfile(String name)
	{
		this.name=name;
	}
	

}
