class Employee
{
	private int id;
	private String name;
	private int age;
	
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age=age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}

public class LaunchIo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1=new Employee(1, "Rohan", 19);
		System.out.println(emp1);
		Employee emp2=new Employee(2, "Rohit", 18);
		System.out.println(emp2);
		
		//jvm shut down

	}

}
