package com.telusko.service;

import java.util.List;

import com.telusko.model.Course;
import com.telusko.model.Student;

public interface IStudentCourseService 
{
	public String saveStudent(Student student);
	public String saveCourse(Course course);
	
	public List<Student> fetchAllrecords();
}
