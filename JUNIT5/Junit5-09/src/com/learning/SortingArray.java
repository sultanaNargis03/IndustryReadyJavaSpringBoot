package com.learning;

import java.util.Arrays;

public class SortingArray 
{
	public int[] sortingArray(int[] array)
	{
		for(int i=0;i<100000;i++)
		{
			Arrays.sort(array);
		}
		return array;
	}
}
