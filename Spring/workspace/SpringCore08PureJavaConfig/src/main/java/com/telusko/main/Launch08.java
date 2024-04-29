package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.telusko.beans.GreetMe;
import com.telusko.config.JavaConfiguration;

public class Launch08 {

	public static void main(String[] args) 
	{
		ApplicationContext ac=new AnnotationConfigApplicationContext(JavaConfiguration.class);
		GreetMe greet=ac.getBean(GreetMe.class);
		System.out.println(greet.generateGreeting("Nargis"));
	}

}
