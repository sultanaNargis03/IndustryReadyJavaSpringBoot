package com.telusko.jdbc;

import java.sql.*;
public class LaunchJDBC1 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		//load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is registered");
		
		//Establish the connection
		
		String url="jdbc:mysql://localhost:3306/teluskodb";
		String userName="root";
		String password="mypassword";
		
		Connection connect=DriverManager.getConnection(url, userName, password);
		System.out.println("Connection established!");
		
		Statement stmt=connect.createStatement();
		System.out.println("Statment object is ready");
		
		String query="select * from studentdetail";
		ResultSet rs=stmt.executeQuery(query);
		System.out.println("We have got result set");
		System.out.println("ID\tNAME\tAGE\tGENDER");
		while(rs.next())
		{
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t"+
		rs.getInt(3) + "\t" + rs.getString(4));
		}
		
		rs.close();
		stmt.close();
		connect.close();
		
	}

}
