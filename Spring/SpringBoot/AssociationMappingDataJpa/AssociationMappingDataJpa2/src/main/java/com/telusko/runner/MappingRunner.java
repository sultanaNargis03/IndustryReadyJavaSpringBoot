package com.telusko.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.telusko.model.Course;
import com.telusko.model.Student;
import com.telusko.service.StudentCourseServiceImpl;

@Component
public class MappingRunner implements CommandLineRunner {

	@Autowired
	private StudentCourseServiceImpl service;
	
	@Override
	public void run(String... args) throws Exception {
		
		Student st1=new Student("Nagis",25);
		Student st2=new Student("Tamim",15);
		
		Set<Student> Students = Set.of(st1,st2);
		
		Course course1=new Course("java",44,4999.0);
		
		Course course2=new Course("SpringBoot",45,6999.0);
		
		Set<Course> courses = Set.of(course1,course2);
		st1.setCourses(courses);
		
		service.saveStudent(st1);
		
	
	}

}
