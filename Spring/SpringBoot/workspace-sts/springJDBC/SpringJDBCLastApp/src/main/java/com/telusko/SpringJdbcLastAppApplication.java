package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.telusko.dao.StudentDaoImpl;

@SpringBootApplication
public class SpringJdbcLastAppApplication 
{

	public static void main(String[] args) 
	{
	 ApplicationContext	context=SpringApplication.run(SpringJdbcLastAppApplication.class, args);
	 StudentDaoImpl dao=context.getBean(StudentDaoImpl.class);
	 System.out.println(dao.getStudentById(1));
	 System.out.println(dao.getStudentById(1,"Kolkata"));
	 dao.getAllStudents().forEach(i->System.out.println(i));
	
	}

}
