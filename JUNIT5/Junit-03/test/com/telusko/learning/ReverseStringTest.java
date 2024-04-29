package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.teusko.learning.ReverseString;

class ReverseStringTest {

	@Test
	void test() 
	{
		ReverseString reverse=new ReverseString();
		assertEquals("avaJ",reverse.reverse("Java"));
	}

}
