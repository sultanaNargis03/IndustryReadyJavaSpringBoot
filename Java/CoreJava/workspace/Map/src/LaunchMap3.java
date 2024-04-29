import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class IdentityCard
{
	private Integer age;
	private String name;
	private String city;
	
	public IdentityCard(Integer age, String name, String city) {
		super();
		this.age = age;
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "IdentityCard [age=" + age + ", name=" + name + ", city=" + city + "]";
	}	
}

public class LaunchMap3 
{
	public static void main(String[] args) 
	{
		IdentityCard icard1=new IdentityCard(14, "Rohan", "Bengaluru");
		IdentityCard icard2=new IdentityCard(15, "Vishal", "Pune");
		IdentityCard icard3=new IdentityCard(16, "Dheeraj", "Bhopal");
		
		HashMap<Integer,IdentityCard> map=new HashMap<>();
		
		map.put(11, icard1);
		map.put(12, icard2);
		map.put(13, icard2);
		
		System.out.println("Welcome to Information center");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Kindly, Enter the Identity Card number to get Info");
		Integer id=scan.nextInt();
		
		
		
		Set entry=map.entrySet();
		Iterator itr3=entry.iterator();
		boolean flag=false;
		while(itr3.hasNext())
		{
		
			Map.Entry pair=(Entry)itr3.next();
			Integer key=(Integer)pair.getKey();
			
			if(key==id)
			{
				System.out.println("The details are : "+ pair.getValue());
				flag=true;
			}
			
		}
		if(flag==false)
		{
			System.out.println("Invalid Id card number");
		}
		

	}

}
