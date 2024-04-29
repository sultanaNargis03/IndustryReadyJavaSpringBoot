package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApp {

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
	}

}
