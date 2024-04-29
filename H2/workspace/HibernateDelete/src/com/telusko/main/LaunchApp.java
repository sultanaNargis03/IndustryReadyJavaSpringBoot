package com.telusko.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.telusko.entity.Student;

public class LaunchApp 
{

	public static void main(String[] args) 
	{
		SessionFactory session=new Configuration().configure().buildSessionFactory();
		Session ses=session.openSession();
		
		Integer sid=2;
		
		//Student st = ses.get(Student.class, sid);
		Student st = ses.load(Student.class, sid);
		if(st!=null)
		{
			System.out.println("if block");
			Transaction transaction = ses.beginTransaction();
			ses.delete(st);
			transaction.commit();
		}
		else
		{
			System.out.println("May be record not available with id: "+sid);
		}
		ses.close();
		session.close();
		
	
	}

}
