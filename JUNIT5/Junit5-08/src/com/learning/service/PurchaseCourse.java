package com.learning.service;

import com.learning.dao.Course;

public class PurchaseCourse 
{
	private Course course;
	
	public boolean proceedWithPurchase(Course course)
	{
		return course.coursePurchased();
	}
}
