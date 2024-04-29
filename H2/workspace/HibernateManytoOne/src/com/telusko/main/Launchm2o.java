package com.telusko.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.telusko.entity.Department;
import com.telusko.entity.Teacher;
import com.telusko.util.HibernateUtility;

public class Launchm2o {

	
	public static void main(String[] args) 
	{
		
		Session session=null;
		Transaction transaction=null;
		boolean flag=false;
		try 
		{
			
			session=HibernateUtility.getSession();
			
			if(session!=null)
			{
				transaction = session.beginTransaction();
				
				Teacher t1=new Teacher();
				
				t1.setName("Hyder Abbas");
				t1.setCity("Bengaluru");
				t1.setSalary(80000.333);
				
				Department dept1=new Department();
				dept1.setName("Spring");
				dept1.setTeacher(t1);
				
				Department dept2=new Department();
				dept2.setName("Java");
				dept2.setTeacher(t1);
				
				session.save(dept1);
				session.save(dept2);
				flag=true;
			}		
		
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
			if(flag)
			{
				transaction.commit();
				System.out.println("Data is saved");
			}
			else
			{
				transaction.rollback();
				System.out.println("Not able to store data in db");
			}
			HibernateUtility.closeSession(session);
			HibernateUtility.closeSessionFactory();
		}
	}

}