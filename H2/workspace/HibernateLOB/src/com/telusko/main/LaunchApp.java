package com.telusko.main;



import java.io.FileInputStream;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.telusko.entity.Profile;

public class LaunchApp {

	public static void main(String[] args) throws IOException 
	{
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Profile p=new Profile();
		p.setPid(1);
		p.setName("Nargis");
		FileInputStream fis=new FileInputStream("D:\\IndustryReadyJava\\H2\\java.png");
		byte img[]=new byte[fis.available()];
		fis.read(img);
		p.setImg(img);
		
		String text="This data is replica of text file";
		char ar[]=text.toCharArray();
		p.setCharfile(ar);
		
		session.save(p);
		
		
		transaction.commit();
		session.close();
	}

}
