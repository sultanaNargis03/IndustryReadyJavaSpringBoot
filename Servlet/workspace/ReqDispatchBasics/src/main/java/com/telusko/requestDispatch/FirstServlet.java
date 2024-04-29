package com.telusko.requestDispatch;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet
{
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Control in First servlet!");
//		RequestDispatcher reqDispatch=request.getRequestDispatcher("/SecondServlet");
//		reqDispatch.include(request, response);
		
	
		request.getServletContext().getRequestDispatcher("/SecondServlet").forward(request, response);
	
		response.sendRedirect("/ReqDispatchBasics/response1.html");
	}

}
