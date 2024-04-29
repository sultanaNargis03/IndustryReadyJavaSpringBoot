
public class LaunchStr12 
{

	public static void main(String[] args) 
	{
		//telusko ==> oksulet
		
		String s1="telusko";
		String s2="";
		for(int i=s1.length()-1; i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println("The revered string is "+ s2);

	}

}
