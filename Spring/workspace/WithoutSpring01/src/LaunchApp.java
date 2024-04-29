import java.util.Scanner;

public class LaunchApp {

	public static void main(String[] args) 
	{

		GreetingsGenerator greet=new GreetingsGenerator ();
		System.out.println("Target object before injecting Dependent object=> "+greet);
		System.out.println("************************************************************");
		
		java.util.Date date=new java.util.Date();
		System.out.println("Depending obj=>"+date);
		System.out.println("************************************************************");
		greet.setDate(date);
		System.out.println("Target object after injecting Dependent object=> "+greet);
		System.out.println("************************************************************");

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		
				
		String msg=greet.generateGreeting(name);
		System.out.println(msg);
	
	}

}
