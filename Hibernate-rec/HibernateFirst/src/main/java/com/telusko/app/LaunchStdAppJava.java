package com.telusko.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.telusko.model.Student;

public class LaunchStdAppJava 
{

	public static void main(String[] args) 
	{
		Configuration config=null;
		SessionFactory sessionFactory=null;
		Session session=null;
		Transaction transaction=null;
		boolean flag=false;
		
		config=new Configuration();
		config.configure();
		sessionFactory=config.buildSessionFactory();
		session=sessionFactory.openSession();
		
		Student student=new Student(2,"Nargis",25,"Delhi");
		
		try
		{
			transaction=session.beginTransaction();
			session.persist(student);
			flag=true;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(flag==true)
			{
				transaction.commit();
			}
			else
			{
				transaction.rollback();
			}
			
			session.close();
		}

	}

}
