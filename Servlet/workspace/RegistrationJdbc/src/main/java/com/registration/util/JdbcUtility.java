package com.registration.util;
import java.sql.*;

public class JdbcUtility 
{
	static
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
	public static Connection getDbConnection() throws SQLException
	{
		String url="jdbc:mysql://localhost:3306/teluskodb";
		String user="root";
		String password="root";
		return DriverManager.getConnection(url, user, password);
	}
	public static void closeResource(Connection connect,Statement stmt) throws SQLException
	{
		if(connect!=null)
			connect.close();
		if(stmt!=null)
			stmt.close();
	}
	
}
