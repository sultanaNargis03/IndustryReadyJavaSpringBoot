import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

class Learner
{
	int age;
	@Override
	public String toString() {
		return "Learner [age=" + age + ", name=" + name + "]";
	}

	String name;
	
	Learner(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
}

public class LaunchMap1 
{
	public static void main(String[] args) 
	{
		HashMap hm1=new HashMap();
		
		hm1.put(1, "ViratKohli");//key value pair ==> Entry
		
		//hm1.put(1, "Shreyass iyer");key has to be unique
		hm1.put(3, "Shami");
		hm1.put(4, "Shami");
		
		System.out.println(hm1);
		
		Learner learn=new Learner(15, "Rohan");
		
		hm1.put(learn, "Hyder");
		
		
		hm1.put("Key", learn);
		hm1.put(null, learn);//null as key is allowed in HashMap
		hm1.put("learn", "Learner");
		System.out.println(hm1);
		System.out.println("*************************************");
		System.out.println();
		LinkedHashMap lhm1=new LinkedHashMap();
		
		lhm1.put(1, "ViratKohli");//key value pair ==> Entry
		
		lhm1.put(2, "Shreyass iyer");
		lhm1.put(3, null);
		lhm1.put(null, "Shami");//null as key is allowed in LinkedHashMap
		System.out.println(lhm1);
		
		System.out.println("*************************************");
		System.out.println();
			
		TreeMap tm=new TreeMap();
		
		tm.put(4, "Shami");
		tm.put(1, "Kohli");
		
		tm.put(2, "Iyer");
		tm.put(3, null);//null has value allowed but not key
		//tm.put(null, "Shami");//null as key is not allowed in TreeMap
		
		System.out.println(tm);
		
		System.out.println("*************************************");
		System.out.println();
		
		Hashtable ht=new Hashtable();
		
		//ht.put(1, null);////null as value is not allowed in Hashtable
		ht.put(2, "R sharma");
		//ht.put(3, "Kohli");
		ht.put(1, "bumrah");
		ht.put(3, "Kohli");
		//ht.put(null, "Bumrah");//null as key is not allowed in Hashtable
		System.out.println(ht);
		
		

	}

}
