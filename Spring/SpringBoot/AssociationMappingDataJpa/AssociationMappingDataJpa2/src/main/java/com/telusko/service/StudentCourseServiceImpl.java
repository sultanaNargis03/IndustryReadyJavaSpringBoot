package com.telusko.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.telusko.model.Course;
import com.telusko.model.Student;
import com.telusko.repository.ICourseRepository;
import com.telusko.repository.IStudentRepository;

@Service
public class StudentCourseServiceImpl implements IStudentCourseService {

	
	@Autowired
	ICourseRepository crepo;
	
	@Autowired
	IStudentRepository srepo;
	
	@Override
	public String saveStudent(Student student) {
		Integer id = srepo.save(student).getId();
		return "Student record with id "+id+" is saved";
	}

	@Override
	public String saveCourse(Course course) {
		
		Integer id = crepo.save(course).getCid();
		return "Course record with id "+id+" is saved";
	}

	@Override
	public List<Student> fetchAllrecords() {
		
		return srepo.findAll();
	}

}
