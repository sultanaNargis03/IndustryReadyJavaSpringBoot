import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;


class Employee1 implements Serializable
{
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private int age;
	
	public Employee1(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age=age;
	}
	public void disp()
	{
		System.out.println("Id : " + id);
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
public class LaunchSerDeser 
{

	public static void main(String[] args) 
	{
//		Employee1 emp=new Employee1(1, "Ramesh", 18);
//		emp.disp();
		
		try
		{
//			FileOutputStream fos=new FileOutputStream("D:\\Telusko\\InputOutput\\java.txt");
//			ObjectOutputStream oos=new ObjectOutputStream(fos);
//			oos.writeObject(emp);
//			
//			oos.close();
			
//			FileInputStream fis=new FileInputStream("D:\\Telusko\\InputOutput\\java.txt");
//			ObjectInputStream ois=new ObjectInputStream(fis);
//			
//			Employee1 e=(Employee1) ois.readObject();
//			e.disp();
			
//			FileOutputStream fos=new FileOutputStream("D:\\Telusko\\InputOutput\\java.txt");
//			BufferedOutputStream bos=new BufferedOutputStream(fos);
//			ObjectOutputStream oos=new ObjectOutputStream(bos);
//			oos.writeObject(emp);
//			
//			oos.close();
//			bos.close();
			
			FileInputStream fis=new FileInputStream("D:\\Telusko\\InputOutput\\java.txt");
			BufferedInputStream bis=new BufferedInputStream(fis);
			ObjectInputStream ois=new ObjectInputStream(bis);
			
			Employee1 e=(Employee1) ois.readObject();
			e.disp();
			
			bis.close();
			ois.close();
			
			
			
		} 
		
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}
		

	}

}
