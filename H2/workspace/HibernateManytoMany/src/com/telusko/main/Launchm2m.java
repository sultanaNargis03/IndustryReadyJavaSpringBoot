package com.telusko.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.telusko.entity.Department2;
import com.telusko.entity.Teacher2;

import com.telusko.util.HibernateUtility;

public class Launchm2m {

	
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
				
				Teacher2 t1=new Teacher2();
				t1.setName("Hyder Abbas");
				t1.setCity("Bengaluru");
				t1.setSalary(90000.333);
				
				Teacher2 t2=new Teacher2();
				t2.setName("Navin Reddy");
				t2.setCity("Bengaluru");
				t2.setSalary(90000.333);
				
				Teacher2 t3=new Teacher2();
				t3.setName("Saurabh Shukla");
				t3.setCity("Bhopal");
				t3.setSalary(90000.333);
				
				Set<Teacher2> teacher=new HashSet<>();	
				teacher.add(t1);
				teacher.add(t2);
				teacher.add(t3);
				
				Set<Teacher2> teacher2=new HashSet<>();	
				teacher2.add(t1);
				teacher2.add(t2);
				
				Department2 dept1=new Department2();
				dept1.setName("Spring");
				dept1.setTeacher(teacher2);
				
				Department2 dept2=new Department2();
				dept2.setName("Java");
				dept2.setTeacher(teacher);
				
				Department2 dept3=new Department2();
				dept3.setName("DSA");
				dept3.setTeacher(teacher);
				
				session.save(dept1);
				session.save(dept2);
				session.save(dept3);
				
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
