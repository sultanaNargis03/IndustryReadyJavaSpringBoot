package com.telusko.beans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CourseSelection 
{
	@Autowired
	@Qualifier("java")
	private Course course;
	
	@Autowired
	private LocalTime time;
	
	public CourseSelection() 
	{
		System.out.println("CourseSelection objct created");
	}

	public boolean chooseCourse(double amount)
	{
		System.out.println("Time is : "+time);
		return course.selectCourse(amount);
	}
}
