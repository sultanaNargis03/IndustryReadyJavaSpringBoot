package com.registration.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.registration.util.JdbcApp;
import com.registration.util.JdbcUtility;

@WebServlet("/reg")
public class Register extends HttpServlet 
{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String vaccineName=request.getParameter("vname");
		String vaccineCompany=request.getParameter("vcompany");
		String cost=request.getParameter("cost");
		
		System.out.println(vaccineName+" "+vaccineCompany+" "+cost);
		
		Connection connect=null;
		PreparedStatement pstmt=null;
		String query="INSERT INTO vaccinedetails (id,vaccinename,vaccinecompany,price)"
				+ "VALUES(?,?,?,?)";
		
		JdbcApp app=new JdbcApp();
		app.setCost(Integer.parseInt(cost));
		app.setId(24);
		app.setVaccineName(vaccineName);
		app.setVaccineCompany(vaccineCompany);
		
		app.jdbcRegister();
		
		
			int row=app.getRow();
			if(row!=0)
			{
				response.sendRedirect("/RegistrationJdbc/success.jsp");
			}
			else
			{
				response.sendRedirect("/RegistrationJdbc/fail.jsp");
				
			}		
		
	}

}
