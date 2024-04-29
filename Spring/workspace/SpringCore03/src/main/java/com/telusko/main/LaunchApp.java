package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telusko.bean.Employee;

public class LaunchApp {

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Employee e1=context.getBean("emp1",Employee.class);
		//System.out.println(e1.empActivity());
		System.out.println(e1);
		System.out.println("*************************************");

		Employee e2=context.getBean("emp2",Employee.class);
		//System.out.println(e2.empActivity());
		System.out.println(e2);
		System.out.println("*************************************");

		Employee e3=context.getBean("emp3",Employee.class);
		//System.out.println(e3.empActivity());
		System.out.println(e3);
		System.out.println("*************************************");
		
		Employee e4=context.getBean("emp4",Employee.class);
		//System.out.println(e4.empActivity());
		System.out.println(e4);
		System.out.println("*************************************");
	}

}
