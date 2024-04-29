package com.telusko.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.model.Customer;
import com.telusko.service.KafkaService;

@RestController
public class CustomerRestController 
{
	@Autowired
	private KafkaService service;
	
	@PostMapping("/addCx")
	public String addCxtoKafka(@RequestBody Customer cx)
	{
		System.out.println(cx);
		String status= service.addMsg(cx);
		System.out.println(status);
		return status;
		
	}
	
	@PostMapping("/addManyCx")
	public String addManyCxtoKafka(@RequestBody List<Customer> cxs)
	{
		return service.add(cxs);
		
	}
}
