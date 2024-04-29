
public class LaunchStr7 
{

	public static void main(String[] args) 
	{
		
		String str="RajaRamMohanRoy";
		
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		System.out.println(str.substring(4));//RamMohanRoy
		System.out.println(str.substring(4,5));//R
		System.out.println(str.substring(4,7));//Ram
		
		System.out.println(str.charAt(5));//a
		System.out.println(str.endsWith("Roy"));//true
		System.out.println(str.endsWith("y"));//true
		System.out.println(str.endsWith("a"));//false
		
		System.out.println(str.startsWith("Ra"));//true
		System.out.println(str.indexOf("a"));//1
		System.out.println(str.lastIndexOf("a"));//10
		System.out.println(str.length());//15
		
		String ar[]=str.split("a");
		
		for(String elem: ar)
		{
			System.out.println(elem);
		}
		
		char carr[]=str.toCharArray();
		for(char elem: carr)
		{
			System.out.println(elem);
		}
		
		
		
		
		
	}

}
