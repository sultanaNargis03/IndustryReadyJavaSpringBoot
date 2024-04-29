package com.telusko.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.telusko.entity.Account;
import com.telusko.entity.Employee2;
import com.telusko.util.HibernateUtil;

public class LauncOnetoOne {

	public static void main(String[] args) 
	{
		Session session=null;
		Transaction transaction=null;
		boolean flag=false;
		try
		{
			session = HibernateUtil.getSession();
			if(session!=null)
			{
				
				transaction = session.beginTransaction();
				Account ac=new Account();
				ac.setAccNo("T01");
				ac.setName("Nargis");
				ac.setName("Saving");
				
				Employee2 emp=new Employee2();
				emp.setName("Nargis");
				emp.setCity("Kolkata");
				emp.setSalary(50000.302);
				emp.setAccount(ac);
				
				session.save(emp);
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
				System.out.println("Not able to store in db");
			}
			HibernateUtil.closeSession();
			HibernateUtil.closeSessionFactory();
		}
	}

}
