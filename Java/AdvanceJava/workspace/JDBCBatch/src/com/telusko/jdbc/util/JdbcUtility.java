package com.telusko.jdbc.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtility 
{
	static
	{
		
			try 
			{
				//load and register the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
			} 
			catch (ClassNotFoundException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Driver is registered");
		
	}
	public static Connection getDBConnection() throws SQLException
	{
		//Establish the connection
		String url="jdbc:mysql://localhost:3306/teluskodb";
		String userName="root";
		String password="root";
						
				
			return DriverManager.getConnection(url, userName, password);
				
				
	}
	public static void closeResource(Connection connect,Statement stmt,ResultSet rs) throws SQLException
	{
		if(connect!=null)
			connect.close();
		if(stmt!=null)
			stmt.close();
		if(rs!=null)
			rs.close();
		
	}
}
