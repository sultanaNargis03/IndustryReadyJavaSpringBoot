package com.telusko;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.dao.IStudentDao;
import com.telusko.dao.StudentTable;

@SpringBootApplication
public class SpringDataJpa01Application 
{

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context=SpringApplication.run(SpringDataJpa01Application.class, args);
		IStudentDao dao=context.getBean(IStudentDao.class);
		StudentTable st=new StudentTable();
		st.setSid(1);
		st.setSname("Nargis");
		st.setSage(25);
		st.setScity("Kolkata");
		dao.save(st);
		//Optional<StudentTable>stu=dao.findById(1);
		System.out.println(st);
	}

}
