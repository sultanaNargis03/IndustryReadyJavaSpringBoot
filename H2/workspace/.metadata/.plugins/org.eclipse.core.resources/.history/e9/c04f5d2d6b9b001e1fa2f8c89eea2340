package com.telusko.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.telusko.entity.Department;
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
				Department dept=session.get(Department.class,1);
				System.out.println(dept);
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
