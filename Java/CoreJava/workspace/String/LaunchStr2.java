
public class LaunchStr2 {

	public static void main(String[] args) 
	{
		String str1="Telusko";
		
		String str2="telusko";
		
		String str3=new String("Alien");
		
		String str4=new String("alien");
		
		String str5=new String("Telusko");
		
		System.out.println(str1==str2);//false
		System.out.println(str2==str3);//false
		System.out.println(str3==str4);//false
		
		System.out.println(str1==str3);//false
		System.out.println("*******************************");
		
		System.out.println(str1==str5);//false
		System.out.println(str1.equals(str5));//true
		
		
		System.out.println("*******************************");
		
		System.out.println(str1.equals(str2));//false
		System.out.println(str2.equals(str3));//false
		System.out.println(str3.equals(str4));//false
		
		System.out.println("*******************************");
		
		System.out.println(str1.equalsIgnoreCase(str2));//true
		System.out.println(str3.equalsIgnoreCase(str4));//true
		
		System.out.println(str1.equalsIgnoreCase(str5));//true
		
		
		
		
		
		
		
		
		

	}

}
