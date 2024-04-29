import java.util.Scanner;

abstract class Shape
{
	float area;
	
	abstract void input();
	
	abstract void compute();
	
	void disp()
	{
		System.out.println("The area is : "+ area);
	}
}
class Rectangle1 extends Shape
{
	float length;
	float breadth;
	public void input()
	{
		System.out.println("Rectangle calculation");
		Scanner scan=new Scanner(System.in);
		System.out.println("Kindly enter length of rectangle");
		length=scan.nextFloat();
		
		System.out.println("Kindly enter breadth of rectangle");
		breadth=scan.nextFloat();
	}
	
	public void compute()
	{
		area=length*breadth;
	}
	
}

class Square1 extends Shape
{
	float length;

	
	public void input()
	{
		System.out.println("Square calculation");
		Scanner scan=new Scanner(System.in);
		System.out.println("Kindly enter length of square");
		length=scan.nextFloat();	
	}
	public void compute()
	{
		area=length*length;
	}
	
}

class Circle1 extends Shape
{
	float radius;

	
	public void input()
	{
		System.out.println("Circle calculation");
		Scanner scan=new Scanner(System.in);
		System.out.println("Kindly enter radius of circle");
		radius=scan.nextFloat();	
	}
	
	public void compute()
	{
		area=3.14f *radius * radius;
	}	
}
class Geometry
{
	void permit(Shape shape)
	{
		shape.input();
		shape.compute();
		shape.disp();
	}
}
public class LaunchProj2 
{
	public static void main(String[] args) 
	{
		Rectangle1 rec=new Rectangle1();
		
		Square1 sq=new Square1();
		
		Circle1 c=new Circle1();
		
		Geometry g=new Geometry();
		g.permit(rec);
		g.permit(sq);
		g.permit(c);
	
	}

}
