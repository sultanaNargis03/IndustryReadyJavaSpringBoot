package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;

class TestTrial {

	@Test
	void test() 
	{
		assertEquals(6,6);
	}

	@Test
	void testComputeSquareArea() 
	{
		Shapes shape=new Shapes();
		assertEquals(576,shape.computeSquareArea(24));
	}
	@Test
	void testComputeCircleArea() 
	{
		Shapes shape=new Shapes();
		assertEquals(78.5,shape.computeCircleArea(5),"Area of circle calculation is Wrong");
	}

	@Test
	void testComputeCircleArea_Supplier() 
	{
		Shapes shape=new Shapes();
		assertEquals(79.5,shape.computeCircleArea(5),()->"Area of circle calculation is Wrong");
	}


}
