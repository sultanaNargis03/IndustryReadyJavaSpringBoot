package com.practice;
import java.io.*;
class Employee implements Serializable
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

	public void disp()
	{
		System.out.println("Id :"+id);
		System.out.println("name :"+name);
		System.out.println("age :"+age);
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
public class LaunchSerDeser {

	public static void main(String[] args) {
		
		Employee emp=new Employee(1,"Nargis",25);
		emp.disp();
		try {
			FileOutputStream fos=new FileOutputStream("D:\\IndustryReadyJava\\Java\\CoreJava\\File\\IO\\java.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(emp);
			oos.close();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
