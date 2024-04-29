class CarShare implements Runnable
{

	@Override
	 public void run()
	{
		try {
			
		    System.out.println(Thread.currentThread().getName()+ " Has entered the parking lot");
		
			Thread.sleep(4000);
			synchronized(this)
			{
			System.out.println(Thread.currentThread().getName()+ " Has Got into Car");
			
			Thread.sleep(4000);
			
			
			System.out.println(Thread.currentThread().getName()+ " Started to drive car");
			Thread.sleep(4000);
			
			System.out.println(Thread.currentThread().getName()+ " Came back from the drive and parked the car");
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName()+ " Came out of parking lot");
			}
				
		} 
		
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
}

public class Launch7 
{

	public static void main(String[] args) 
	{
		CarShare cs=new CarShare();
		
		Thread t1=new Thread(cs);
		Thread t2=new Thread(cs);
		Thread t3=new Thread(cs);
		
		t1.setName("CHILD-1");
		t2.setName("CHILD-2");
		t3.setName("CHILD-3");
		
		t1.start();
		t2.start();
		t3.start();
  
	}

}
