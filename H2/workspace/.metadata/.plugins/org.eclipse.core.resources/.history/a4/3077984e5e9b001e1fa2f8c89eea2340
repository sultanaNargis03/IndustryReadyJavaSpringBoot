package com.telusko.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.telusko.entity.Employees;
import com.telusko.entity.Job;
import com.telusko.util.HibernateUtility;

public class LaunchRetrieve {

	public static void main(String[] args) 
	{
		Session session=null;
		
		try 
		{
			
			session=HibernateUtility.getSession();
			
			if(session!=null)
			{
				Job job=session.get(Job.class,1);
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
			HibernateUtility.closeSession(session);
			HibernateUtility.closeSessionFactory();
		}

	}

}
