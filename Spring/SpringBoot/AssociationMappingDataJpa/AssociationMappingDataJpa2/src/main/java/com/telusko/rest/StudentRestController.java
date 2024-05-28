package com.telusko.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.model.Course;
import com.telusko.model.Student;
import com.telusko.service.StudentCourseServiceImpl;

@RestController
public class StudentRestController 
{
	@Autowired
	private StudentCourseServiceImpl service;
	
	@PostMapping("/addStudent")
	public String saveStudent(Student student)
	{
		return service.saveStudent(student);
	}
	@PostMapping("/addCourse")
	public String saveCourse(@RequestBody Course course)
	{
		return service.saveCourse(course);
	}
	
	@GetMapping("/getAll")
	public List<Student> fetchAllrecords()
	{
		return service.fetchAllrecords();
	}
}
