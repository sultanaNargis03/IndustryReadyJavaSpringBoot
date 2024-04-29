class Student
{
	String name;
	int age;
	double avgGrades;
	
	public void disp()
	{
		System.out.println("The name is "+ name);
		System.out.println("The age is "+ age);
		System.out.println("The avgGrades is "+ avgGrades);
	}
	
	@Override
	public String toString()
	{
		return "Name : "+ name + " Age : "+ age + " Avg Grades "+ avgGrades;
	}
}
class Employee
{
	}
public class LaunchArObj 
{
	public static void main(String[] args) 
	{
//		Student s=new Student();
//		System.out.println(s);
		Student []stdArr=new Student[4];
		//stdArr[0]=new Employee();
		stdArr[0]=new Student();
		stdArr[1]=new Student();
		stdArr[2]=new Student();
		stdArr[3]=new Student();
		
		stdArr[0].age=14;
		stdArr[1].age=15;
		stdArr[2].age=16;
		stdArr[3].age=18;
		
		stdArr[0].name="Rohan";
		stdArr[1].name="Rohit";
		stdArr[2].name="Rahul";
		stdArr[3].name="Ramesh";
		
		for(Student obj:stdArr)
		{
			System.out.println(obj );
		}

	}

}
