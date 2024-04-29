package com.learning;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArraysTesting {

	@Test
	void test() 
	{

		int [] expected= {2,4,6,8};
		int [] result= {6,4,2,8};
		
		Arrays.sort(result);
		
		assertArrayEquals(expected,result);
		//assertEquals(expected,result); // will compare the ref of array
	}

}
