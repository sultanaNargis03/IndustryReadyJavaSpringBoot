package com.telusko.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.telusko.model.Student;

public class Launchupdate 
{

	public static void main(String[] args) 
	{
		
//		Configuration config=null;
//		SessionFactory sessionFactory=null;
//		Session session=null;
//		Transaction transaction=null;
//		boolean flag=false;
//		
//		config=new Configuration();
//		config.configure();
//		
//		//if mapping class not mentioned in cgf.xml file
//		config.addAnnotatedClass(Student.class);
//		
//		sessionFactory=config.buildSessionFactory();
		
		SessionFactory sessionFactory=new Configuration().configure()
				.addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session=null;
		Transaction transaction=null;
		boolean flag=false;
		
		try
		{
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			
			Student student=new Student(3,"Dona",4,"Kolkata");
			
			//session.update(student);
			//session.saveOrUpdate(student); //first it will go with update if no record present then it will save
			
			session.merge(student);  //to update the record in hibernate 6
			
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
			sessionFactory.close();
		}

	}

}
