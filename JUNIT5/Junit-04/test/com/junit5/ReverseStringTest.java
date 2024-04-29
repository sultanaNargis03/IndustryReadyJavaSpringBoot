package com.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ReverseStringTest 
{
	ReverseString reverse=new ReverseString();
	@Test
	void testReverseString_OneWord() 
	{	
		assertEquals("avaJ",reverse.reverse("Java"));
	}

	@Test
	void testReverseString_MultipleWords() 
	{
		assertEquals("ysae si avaJ",reverse.reverse("Java is easy"));
	}
}
