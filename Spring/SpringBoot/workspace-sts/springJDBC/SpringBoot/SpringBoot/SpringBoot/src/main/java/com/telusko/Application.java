package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.beans.CourseSelection;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	
		CourseSelection cs = context.getBean(CourseSelection.class);
		boolean status=cs.chooseCourse(444.5);
		
		if(status)
		{
			System.out.println("Success");
		}
		else
		{
			System.out.println("Failed");
		}
		
	        context.close();
	}

}
