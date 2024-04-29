package com.telusko.beans;

import org.springframework.stereotype.Component;

@Component("springBoot")
public class SpringBoot implements Course {
	public SpringBoot()
	{
		System.out.println("Spring boot bean created");
	}
	@Override
	public boolean selectCourse(double amount) {
		System.out.println("SpringBoot course is selected and the fees paid is : "+ amount);
		return true;
	}

}
