package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student
{
	private int id;
	private String name;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
public class LaunchStreamApi {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList();
		
		list.add(20);
		list.add(10);
		list.add(4);
		list.add(44);
		list.add(8);
		list.add(50);
		
		int sum=list.stream().filter(i->i%5==0).map(i->i*2).reduce(0,(c,e)->c+e);
		System.out.println(sum);
		
		Integer res = list.stream().filter(i->i%3==0).findFirst().orElse(0);
		System.out.println(res);
		System.out.println("***********************");
		List<Student> students = Arrays.asList(
		new Student(1,"Nargis"),
		new Student(2,"Tamim"),
		new Student(3,"Dona")
		);
		
		//students.forEach(i->System.out.println(i));
		students.stream().map(Object::toString).map(String::toUpperCase).forEach(i->System.out.println(i));
		students.stream().map(Student::getId).map(i->i*2).forEach(i->System.out.println(i));
		
	}

}
