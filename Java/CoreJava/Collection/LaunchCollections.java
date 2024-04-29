import java.util.ArrayList;
import java.util.List;
class Human
{
	public void sleep()
	{
		System.out.println("Human needs to sleep");
	}
}
class Employee //extends Human
{
	
}
public class LaunchCollections 
{

	public static void main(String[] args) 
	{
		
		
		List<Integer> list=new ArrayList<>();
		list.add(10);
		//list.add("Java"); compile time error
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(10);
		
		List<Object> list2=new ArrayList<>();
		list2.add(10);
		
		ArrayList al=new ArrayList();
//		List<Object> list3=new ArrayList<String>();CE not allowed
//		list3.add(10);
		
//		List<Human> list3=new ArrayList<Employee>();
		List<Human> list4=new ArrayList<>();
//		Human h=new Human();
//		Employee e=new Employee();
		list4.add(new Human());
		
//		list4.add(new Employee());
		
		
		
	
		
		
		
	
	}

}
