package com.telusko;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.telusko.dao.CourseInfo;
import com.telusko.dao.SpringJdbc;

@Component
public class StudentCommandLineRunner implements CommandLineRunner 
{
    @Autowired
	private SpringJdbc springJdbc;
	
	@Override
	public void run(String... args) throws Exception 
	{
		//springJdbc.insert();
		springJdbc.insert(new CourseInfo(1, "Java"));
		springJdbc.insert(new CourseInfo(2, "Spring"));
		springJdbc.insert(new CourseInfo(3, "Hibernate"));
		
		springJdbc.deleteById(1);
		System.out.println(springJdbc.findById(2));
		System.out.println(springJdbc.findById(3));
	}

}