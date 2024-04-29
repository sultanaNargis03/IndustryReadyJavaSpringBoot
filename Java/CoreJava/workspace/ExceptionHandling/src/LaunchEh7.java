
public class LaunchEh7 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("first statement");
		try 
		{
			Thread.sleep(5000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("2nd  statement");
		Thread.sleep(8000);
		System.out.println("last  statement");

	}

}
