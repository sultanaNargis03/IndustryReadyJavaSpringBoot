import java.util.Scanner;

class Rectangle
{
	float length;
	float breadth;
	
	float area;
	
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
	public void disp()
	{
		System.out.println("The area is : "+ area);
	}
}


class Square
{
	float length;
	
	
	float area;
	
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
	public void disp()
	{
		System.out.println("The area is : "+ area);
	}
}

class Circle
{
	float radius;
	
	
	float area;
	
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
	public void disp()
	{
		System.out.println("The area is : "+ area);
	}
}



public class LaunchProjec1 
{

	public static void main(String[] args) 
	{
		Rectangle rec=new Rectangle();
		
		Square sq=new Square();
		
		Circle c=new Circle();
		
		rec.input();
		rec.compute();
		rec.disp();
		
		sq.input();
		sq.compute();
		sq.disp();
		
		c.input();
		c.compute();
		c.disp();

	}

}
