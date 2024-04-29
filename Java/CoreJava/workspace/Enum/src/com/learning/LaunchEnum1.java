package com.learning;

enum Week
{
	MON, TUE, WED, THU, FRI, SAT, SUN;
	//Mon, Tue, wed, thu, frI;

}
public class LaunchEnum1 
{
	enum Direction
	{
		NORTH, EAST, SOUTH, WEST;
	}
	
	public static void main(String[] args) 
	{
		
		Week w=Week.MON;
		
		System.out.println(w);
	    
		int index=Week.SAT.ordinal(); //to get index of enum
		System.out.println(index);
		
		Week war[]=Week.values();	//to get the constant of enum
		
		for(Week elem:war)
		{
			System.out.print(elem.ordinal() + " : " + elem + " , ");
		}
	}

}
