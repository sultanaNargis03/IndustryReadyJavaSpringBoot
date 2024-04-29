package com.practice2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}

public class LaunchSerDser {

	public static void main(String[] args) 
	{
		String path="D:\\IndustryReadyJava\\Java\\CoreJava\\File\\IO\\java.txt";
//		Employee emp=new Employee(1,"Nargis",18);
//		emp.disp();
		try
	//	try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(path))) 
		{
//			FileOutputStream fos=new FileOutputStream(path);
//			BufferedOutputStream bos=new BufferedOutputStream(fos);
//			ObjectOutputStream oos=new ObjectOutputStream(bos);
//			oos.writeObject(emp);
			
//			oos.close();
//			bos.close();
			
			FileInputStream fis=new FileInputStream(path);
			BufferedInputStream bis=new BufferedInputStream(fis);
			ObjectInputStream ois=new ObjectInputStream(bis);
			
			Employee e=(Employee) ois.readObject();
			e.disp();
		} 
		catch (Exception e)
		{
			
			e.printStackTrace();
		}
	}

}
