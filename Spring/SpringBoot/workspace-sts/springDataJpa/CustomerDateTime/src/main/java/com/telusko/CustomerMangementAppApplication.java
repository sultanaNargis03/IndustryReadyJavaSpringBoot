package com.telusko;

import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.bo.CustomerDetails;
import com.telusko.service.ICustomerServiceImpl;


@SpringBootApplication
public class CustomerMangementAppApplication 
{

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context=SpringApplication.run(CustomerMangementAppApplication.class, args);
		ICustomerServiceImpl service = context.getBean(ICustomerServiceImpl.class);
		
//		CustomerDetails customer = new CustomerDetails("Nargis","Kolkata",LocalDateTime.of(1998,8,8,14,12,8),LocalTime.of(21,32),LocalDate.of(2024, 01, 18));
//		CustomerDetails customer2 = new CustomerDetails("Tamim","Kolkata",LocalDateTime.of(2007,3,23,14,12,8),LocalTime.of(21,39),LocalDate.of(2024, 01, 18));

		//System.out.println(service.registerCustomer(customer));
		//System.out.println(service.registerCustomer(customer2));
		service.getAllCustomer().forEach(c->System.out.println(c));
		context.close();
	}

}
