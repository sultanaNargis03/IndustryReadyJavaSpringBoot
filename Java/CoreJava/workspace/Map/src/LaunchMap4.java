import java.util.WeakHashMap;

class Learner1
{
	int age;
	String name;
	public Learner1(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Learner [age=" + age + ", name=" + name + "]";
	}
	
	@Override
	public void finalize()
	{
		System.out.println("Obj clearning by Garbage Collector");
	}
}
public class LaunchMap4 
{

	public static void main(String[] args) 
	{
		Learner1 learn=new Learner1(15, "Rohan");
		
		/* HashMap map1=new HashMap(); */
		WeakHashMap map1=new WeakHashMap();
		
		map1.put(learn, " Telusko");
		System.out.println(map1);
		
		learn=null;
		
		System.gc();
		
		System.out.println(map1);

	}

}
