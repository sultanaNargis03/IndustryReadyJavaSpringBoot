package com.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestException {

	@Test
	void testSortingArray_Exception() 
	{
//		try
//		{
//			SortingArray array=new SortingArray();
//		//	int unsorted[]= {2,1,4};
//			int unsorted[]= null;
//			int sortedArray[]=array.sortingArray(unsorted);
//			
//			for(int elem:sortedArray)
//			{
//				System.out.print(elem+" ");
//			}
//			System.out.println("Statement below exception");
//			fail();
//		}
//		catch(NullPointerException e)
//		{
//			System.out.println("Exception generated!!");
//		}
		
		SortingArray array=new SortingArray();
		int unsorted[]= null;
		assertThrows(NullPointerException.class,()->array.sortingArray(unsorted));
		
	}

}
