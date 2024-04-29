package com.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;


import com.telusko.services.Courses;
import com.telusko.services.Mockito;

@SpringBootApplication
public class SpringBootProfilesApplication implements CommandLineRunner
{
	@Value("${myproject.name}")
	private String projectName;
	
	@Autowired
	private Courses course;
	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootProfilesApplication.class, args);
//		ConfigurableApplicationContext context = SpringApplication.run(SpringBootProfilesApplication.class, args);
//		Courses courses = context.getBean(Courses.class);
//		boolean status = courses.registerToCourse(555.7);
//		if(status)
//			System.out.println("Register successfully !!");
//		else
//			System.out.println("Failed to register!!");
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("project name : "+projectName);
		boolean status = course.registerToCourse(555.7);
		if(status)
			System.out.println("Register successfully !!");
		else
			System.out.println("Failed to register!!");
		
	}
	@Bean
	@Profile("mockito")
	public Mockito mockitoObj()
	{
		return new Mockito();
	}

}
