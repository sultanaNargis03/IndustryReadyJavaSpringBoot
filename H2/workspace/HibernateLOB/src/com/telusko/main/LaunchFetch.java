package com.telusko.main;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.telusko.entity.Profile;

public class LaunchFetch 
{

	public static void main(String[] args) throws IOException 
	{
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		Profile p=session.get(Profile.class,1);
		System.out.println("Profile id is :"+p.getPid());
		System.out.println("Profile id is :"+p.getName());
		
		byte img[]=p.getImg();
		FileOutputStream fos=new FileOutputStream("java.png");
		fos.write(img);
		
		char text[]=p.getCharfile();
		fos.flush();
		
		FileWriter fw=new FileWriter("java.txt");
		fw.write(text);
		fw.flush();
		
	}

}
