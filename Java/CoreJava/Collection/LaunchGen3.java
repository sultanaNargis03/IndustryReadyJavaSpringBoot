import java.util.ArrayList;
import java.util.List;
class Human2
{
	public void sleep()
	{
		System.out.println("Human needs to sleep");
	}
}
class Employee2 extends Human2
{
	public void sleep()
	{
		System.out.println("Employee needs to sleep during office hour");
	}
}
class Student4
{
	
}

public class LaunchGen3 
{
	public static void main(String[] args) 
	{
		Object obj=new Object();
		
		String strObj="Java";
		 
		obj=strObj;
		
		Human2 human=new Human2();
		
		Employee2 emp=new Employee2();
		
		Student4 student=new Student4();
		
		human=emp;
		
//		ArrayList<Human2> humanList1=new ArrayList<>();
//		
//		ArrayList<Employee2> employeeList1=new ArrayList<>();
		
//		humanList1=employeeList1;//error
//		employeeList1=humanList1; //error
		
//		ArrayList<?> humanList1=new ArrayList<>();//?==> Wildcard ==> unkown  type ==> Type of data doesnt matter
//		
//		ArrayList<Employee2> employeeList1=new ArrayList<>();
//		humanList1=employeeList1;
		
		ArrayList<? extends Human2> humanList1=new ArrayList<>();//upper bound
		//it can be child type or same parent type ===anything which is child of Human2 is allowed
		ArrayList<Employee2> employeeList1=new ArrayList<>();
		
		ArrayList<Student4> studentList1=new ArrayList<>();
		ArrayList<Human2> humanList2=new ArrayList<>();
		
		ArrayList<Object> humanList3=new ArrayList<>();
		
		humanList1=employeeList1;
		//humanList1=studentList1; ce error
		humanList1=humanList2;
		
		//humanList1=humanList3; ce error
		
		ArrayList<? super Human2> humanLists1=new ArrayList<>();//lower bound
		
		ArrayList<Employee2> employeeLists1=new ArrayList<>();
		//humanLists1=employeeLists1;
		
		ArrayList<Human2> humanLists2=new ArrayList<>();
		humanLists1=humanLists2;
		
		ArrayList<Object> humanLists3=new ArrayList<>();
		humanLists1=humanLists3;
		System.out.println("***************************************");
		ArrayList<Human2> humanLists4=new ArrayList<>();
		
		humanLists4.add(new Human2());
		humanLists4.add(new Human2());
		ArrayList<Employee2> employeeLists4=new ArrayList<>();
		employeeLists4.add(new Employee2());
			invockSleep(humanLists4);
			System.out.println("**********************************");
			invockSleep(employeeLists4);
			
			
	}
	public static void invockSleep(List<? extends Human2> list)
	{
		for(Human2 human:list)
		{
			human.sleep();
		}
	}

}
