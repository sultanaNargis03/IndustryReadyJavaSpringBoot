class Alpha
{
	static int i;
	public void alpha()
	{
		
		System.out.println("Alpha"+ ++i);
		alpha();
	}
}
public class LaunchEH4 {

	public static void main(String[] args) 
	{
		Alpha obj=new Alpha();
		obj.alpha();
				
		
				

	}

}
