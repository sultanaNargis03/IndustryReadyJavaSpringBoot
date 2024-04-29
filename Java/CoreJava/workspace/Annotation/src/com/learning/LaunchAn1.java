package com.learning;

@FunctionalInterface
interface Add
{
	void add();
	//void add(int num1);
}

class AeroPlane
{
	void planeFliesAtHighHeight()
	{
		System.out.println("Plane is flying high");
		
	}


}

class FighterPlane extends AeroPlane
{
	//I m overrdiding method to see diff behaviour at runtime
	
	@Override
	void planeFliesAtHighHeight()
	{
		System.out.println("FighterPlane flies high");
	}
}


public class LaunchAn1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//Add ad=()->System.out.println("Add method definition");
		
		AeroPlane fp=new FighterPlane();
		
		fp.planeFliesAtHighHeight();
			

	}

}
