package com.learningapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learningapp.model.Model;

@WebServlet("/login")
public class Login extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		
		String userName=request.getParameter("uname");
		
		String password=request.getParameter("password");
		
		Model model=new  Model();
		model.setUserName(userName);
		model.setPassword(password);
		model.login();
		String dbuser=model.getUserName();
		String dbpassword=model.getPassword();
			
		if(userName.equals(dbuser)&&password.equals(dbpassword))
		{
			System.out.println("dbuser: "+dbuser);
			request.setAttribute("dbuser", dbuser);
			RequestDispatcher rd=request.getRequestDispatcher("loginsuccess.jsp");
			rd.forward(request, response);	
			//request.getRequestDispatcher("/course").forward(request, response);
		}
		else
		{
			response.sendRedirect("/MVCProject/loginfail.jsp");
		}
	}
}
