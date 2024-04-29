package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;

class ShapesTest 
{

	Shapes shape=new Shapes();
	@Test
	void testComputeCircleArea() 
	{
		
		assertNotEquals(78.5,shape.computeCircleArea(5),"Area of circle calculation is Wrong");
	}

	@Test
	void testComputeCircleArea_Supplier() 
	{
		
		assertNotEquals(79.5,shape.computeCircleArea(5),()->"Area of circle calculation is Wrong");
	}


}
