package com.telusko.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.telusko.entity.Employees;
import com.telusko.entity.Job;
import com.telusko.util.HibernateUtility;

public class LaunchAppOnetoMany 
{

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
				
				Employees emp=new Employees();
				
				emp.setName("Nargis");
				emp.setAge(25);
				emp.setCity("Bengaluru");
				emp.setSalary(80000.333);
				
				Employees emp2=new Employees();
				
				emp2.setName("Tamim");
				emp2.setAge(15);
				emp2.setCity("Bengaluru");
				emp2.setSalary(800000.333);
				String tech[]= new String[]{"Java","Spring"};
				
				Set<Employees>employees=new HashSet<>();
				employees.add(emp);
				employees.add(emp2);
				
				Job job=new Job();
			
				job.setTitle("Software Developer");
				job.setRole("Java Developer");
				job.setTech(tech);
				job.setEmployees(employees);
				session.save(job);
				flag=true;
				System.out.println(job);
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