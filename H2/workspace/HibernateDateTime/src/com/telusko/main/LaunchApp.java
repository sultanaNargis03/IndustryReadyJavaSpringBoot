package com.telusko.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.telusko.entity.Implementers;

public class LaunchApp {

	public static void main(String[] args)
	{
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Implementers.class)
		.buildSessionFactory();
	
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Implementers imp=new Implementers();
		imp.setId(1);
		imp.setName("Nargis");
		imp.setDate(new Date());
		imp.setTime(new Date());
		imp.setDateAndTime(new Date());
		session.save(imp);
		
		transaction.commit();
		
		session.close();
		sessionFactory.close();
		
		
	}

}