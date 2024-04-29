package com.telusko.controller;

//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.telusko.service.IGreetingService;

import jakarta.servlet.http.HttpServletResponse;

@Controller
//@RequestMapping("/greeting")
public class GreetingController 
{
	@Autowired
	private IGreetingService service;
	
//	@GetMapping("/getwish")
//	public void showResponse(Map<String, Object> model)
//	{
//		System.out.println("Control in controler");
//		model.put("greet", service.generateGreetings());
//		 return;	
//	}
	
//	@GetMapping("/getwish")
//	public Map<String, Object> showResponse()
//	{
//			String greet=service.generateGreetings();
//			Map<String, Object> map=new HashMap<>();
//			
//			map.put("greet",greet);
//			return map;
//	}
	
	@GetMapping("/getwish")
	public void showResponse(HttpServletResponse response) throws IOException
	{
		System.out.println("Control in controler");
		String greet=service.generateGreetings();
		PrintWriter writer = response.getWriter();
		writer.println("<h1> Hello this is from Controller directly "+ greet+ "</h1>");
		
		 	
	}
	

}
