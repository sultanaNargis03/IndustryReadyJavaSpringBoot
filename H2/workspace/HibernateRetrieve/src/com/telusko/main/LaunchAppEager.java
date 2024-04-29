package com.telusko.main;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.telusko.entity.Student;

public class LaunchAppEager {

	public static void main(String[] args) throws IOException 
	{
		//Inform jvm to activate hibernate
		Configuration config = new Configuration(); 
		config.configure("/hibernate.config.xml");
		
		//creating SessionFactory to hold all others req. objects for hibernate
		SessionFactory sessionFactory=config.buildSessionFactory();
		
		//Persistence operation
		Session session = sessionFactory.openSession();
		//Only for non select operation transaction must be there
		
		Student st=session.get(Student.class,4);
		System.out.println("Id :"+st.getId());
		System.out.println("Name :"+st.getName());
		System.out.println("Age :"+st.getAge());
		System.out.println("City :"+st.getCity());
//		System.in.read();
//		Student st1=session.get(Student.class,1);
//		System.out.println(st1);
		session.close();
		sessionFactory.close();
	}

}
