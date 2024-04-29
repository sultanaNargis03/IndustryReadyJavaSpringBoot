package com.telusko.learning;

import static org.junit.Assert.*;
import org.junit.Test;



public class ReverseStringTest {

	@Test
	public void test() 
	{
		ReverseString rs=new ReverseString();
		String expected="avaJ";
		assertEquals(expected,rs.reverse("Java"));
		assertEquals("ysae si avaJ",rs.reverse("Java is easy"));
		
	}

}
