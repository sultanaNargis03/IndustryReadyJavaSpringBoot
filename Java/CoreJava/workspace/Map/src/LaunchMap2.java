import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LaunchMap2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map1=new HashMap<>();
		
		map1.put(1, "Kohli");
		map1.put(2, "Rohit sharma");
		map1.put(3, "Bumrah");
		//System.out.println(map1);
		
		
		Collection values=map1.values();
		
		Iterator itr1=values.iterator();
		
		while(itr1.hasNext())
		{
			//System.out.println(itr1.next());
			String str1=(String)itr1.next();
			System.out.println(str1.toUpperCase());
		}
		
		System.out.println("*************************");
		System.out.println();
		
		Set set=map1.keySet();
		Iterator itr2=set.iterator();
		while(itr2.hasNext())
		{
			//System.out.println(itr1.next());
			//int i=(int)itr2.next();//auto-unboxing
			Integer i=(Integer)itr2.next();
			System.out.println("Key is : "+ i);
		}
		
		System.out.println("***********************");
		System.out.println();
		
		Set entry=map1.entrySet();
		Iterator itr3=entry.iterator();
		
		while(itr3.hasNext())
		{
			//System.out.println(itr3.next());
			
			Map.Entry pair=(Entry)itr3.next();
			System.out.println(pair.getKey() + " :  " + pair.getValue());
			
		}
		
		
		
		
		
		

	}

}
