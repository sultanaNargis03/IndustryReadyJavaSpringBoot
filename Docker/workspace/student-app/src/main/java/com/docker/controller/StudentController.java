package com.docker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.model.Student;
import com.docker.repository.IStudentRepo;

@RestController
public class StudentController 
{
	@Autowired
	IStudentRepo repo;
	
	@GetMapping("/students")
	public List<Student> getAllStudents()
	{
		return repo.findAll();
	}
	@RequestMapping("/addStudent")
	public void addStudent()
	{
		Student s=new Student();
		s.setName("Raj");
		s.setAge(26);
		
		repo.save(s);
	}
}
