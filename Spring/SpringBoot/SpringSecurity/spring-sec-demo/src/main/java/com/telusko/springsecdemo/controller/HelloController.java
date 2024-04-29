package com.telusko.springsecdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequestWrapper;

@RestController
public class HelloController 
{
	@GetMapping("/hello")
	public String greet(HttpServletRequestWrapper request)
	{
		return "hello world "+request.getSession().getId();
	}
	
	@GetMapping("/about")
	public String about(HttpServletRequestWrapper request)
	{
		return "Telusko "+request.getSession().getId();
	}
}
