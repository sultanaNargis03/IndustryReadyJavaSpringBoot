//import java.util.*;
public class LaunchDateTime1 
{

	public static void main(String[] args) 
	{
		//Date date1=new Date();
		
		java.util.Date date=new java.util.Date();
		
		System.out.println(date);
		
		int sec=date.getSeconds();
		
		long timeinMs=date.getTime();
		System.out.println("**************************************");
		
		java.sql.Date date2=new java.sql.Date(timeinMs);
		System.out.println(date2);
		
		
		
		

	}

}
