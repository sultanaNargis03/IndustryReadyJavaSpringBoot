package com.practice;

enum Week
{
	MON,TUE,WED,THU,FRI,SAT,SUN;
}
public class Launch1 
{
	enum Direction
	{
		EAST,WEST,NORTH,SOUTH;
	}

	public static void main(String[] args) 
	{
		Week w=Week.MON;
		System.out.println(w);
		int index=Week.SAT.ordinal();
		System.out.println(index);
		Week war[]=Week.values();
		for(Week elem:war)
		{
			System.out.print(elem+" : "+elem.ordinal()+" , ");
		}

	}

}
