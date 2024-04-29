package com.learningapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learningapp.model.Model;

@WebServlet("/reg")
public class Register extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		String userName=request.getParameter("uname");
		String city=request.getParameter("city");
		String country=request.getParameter("country");
		String password=request.getParameter("password");
		String confirmPassword=request.getParameter("cpassword");
		
		System.out.println(password+" : "+confirmPassword);
		
		if(password.equals(confirmPassword))
		{
			Model model=new  Model();
			model.setUserName(userName);
			model.setCity(city);
			model.setCountry(country);
			model.setPassword(password);
			int row=model.register();

			if(row!=0)
			{
				response.sendRedirect("/Learningportal/login.html");
			}
			else
			{
				response.sendRedirect("/MVCProject/failregister.html");
			}
		}
		else
		{
			System.out.println("Password "+password+" and "+"confirm Password "+confirmPassword+"not matching");
			response.sendRedirect("/MVCProject/reregister.html");
		}
	}

}
