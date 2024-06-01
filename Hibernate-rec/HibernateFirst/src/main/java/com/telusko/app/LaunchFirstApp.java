package com.telusko.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.telusko.model.Student;

public class LaunchFirstApp 
{
	public static void main(String[] args) 
	{
		//Step 01: Inform JVM to activate Hibernate
		Configuration config=new Configuration();
		
		//Step 02:
		config.configure();
		
		//Step 03: Creating SessionFactory object to hold all other required objects for hibernate
		SessionFactory sessionFactory=config.buildSessionFactory();
		
		//Step 04: Get the session object from Session Factory
		Session session=sessionFactory.openSession();
		
		//Step 05 :Only for non select operation transaction must be there
	     Transaction transaction = session.beginTransaction();

	    //Create Persistence Object
	     Student std1=new Student(1,"Tamim",15,"KOL");
	     
	     //Step 06: Perform Persistence operation
	     session.save(std1);
		 
	     //Step 07: Performing transaction operation
	     transaction.commit();
	     
	     //Step 08: Close the session
	     session.close();
		
	}
}
