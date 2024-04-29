package com.telusko.main;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telusko.beans.Amazon;

import org.springframework.context.ApplicationContext;
public class LaunchApp1 {

	public static void main(String[] args)
	{
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Amazon amz=context.getBean("amazon", Amazon.class);
		boolean status=amz.initiateDelivery(544.4);
		if(status)
			System.out.println("Order delivered successfully");
		else
			System.out.println("Failed to deliver");
	}

}
