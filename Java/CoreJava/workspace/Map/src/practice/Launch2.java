package practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Launch2 {

	public static void main(String[] args) 
	{

		HashMap<Integer,String> hm=new HashMap<>();
		
		hm.put(1, "Babar Azam");
		hm.put(2,"Mohammad Rizwan");
		hm.put(3, "Fakhar Zaman");
		hm.put(4,"Naseem Shah");
		hm.put(5, "Mohammad Wasim");
		
		Collection values=hm.values();
		Iterator it=values.iterator();
		
		while(it.hasNext())
		{
			//System.out.println(it.next());
			
			String str=(String)it.next();
			System.out.println(str.toUpperCase());
			
		}
		System.out.println("*********************************");
		
		Set set=hm.keySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Integer i=(Integer)itr.next();
			System.out.println(i);
		}
		
		System.out.println("*********************************");
		
		Set set2=hm.entrySet();
		Iterator itr2=set2.iterator();
		while(itr2.hasNext())
		{
			Entry ent=(Entry)itr2.next();
			//System.out.println(ent);
			System.out.println(ent.getKey()+" : "+ent.getValue());
			
		}
		
	}

}
