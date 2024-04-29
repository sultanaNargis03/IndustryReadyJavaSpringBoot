package com.telusko.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.telusko.entity.Implementers;

public class LaunchRet {

	public static void main(String[] args) 
	{
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Implementers.class)
		.buildSessionFactory();
		 Session session = sessionFactory.openSession();
    	 
		 Integer id=1;
		 Implementers imp=session.get(Implementers.class,id);
		 
		 if(imp!=null)
			 System.out.println(imp);
		 session.save(imp);
				
		 session.close();
		 sessionFactory.close();
	}

}
