package com.telusko.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.telusko.entity.Student;

public class LaunchAppLazy {

	public static void main(String[] args) 
	{
		//Inform jvm to activate hibernate
				Configuration config = new Configuration(); 
				config.configure("/hibernate.config.xml");
				
				//creating SessionFactory to hold all others req. objects for hibernate
				SessionFactory sessionFactory=config.buildSessionFactory();
				
				//Persistence operation
				Session session = sessionFactory.openSession();
				//Only for non select operation transaction must be there
				
				Student st=session.load(Student.class,1);
				System.out.println("Id :"+st.getId());
				//System.in.read();
				System.out.println("Name :"+st.getName());
				System.out.println("Age :"+st.getAge());
				System.out.println("City :"+st.getCity());
				
				Student st1=session.load(Student.class,1);
				System.out.println("Id :"+st1.getId());
				System.out.println("Name :"+st1.getName());
				System.out.println("Age :"+st1.getAge());
				System.out.println("City :"+st1.getCity());
				

				session.close();
				sessionFactory.close();
				
	}

}
