package com.telusko.SpringJDBCAPI;

import java.util.Iterator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.SpringJDBCAPI.dao.Employee;
import com.telusko.SpringJDBCAPI.dao.EmployeeDaoImpl;

@SpringBootApplication
public class SpringJdbcapiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJdbcapiApplication.class, args);
	
		EmployeeDaoImpl emp = context.getBean(EmployeeDaoImpl.class);
//		List<Employee> list = emp.getTheEmployee();
//		Iterator<Employee> itr = list.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
//		List<Employee> list = emp.getTheEmployee();
//		list.forEach(em->System.out.println(em));
		emp.getTheEmployee().forEach(em->System.out.println(em));
		
	
	context.close();
	}

}
