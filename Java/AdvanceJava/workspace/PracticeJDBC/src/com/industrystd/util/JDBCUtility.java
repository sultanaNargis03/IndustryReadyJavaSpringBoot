package com.industrystd.util;
import java.sql.*;
public class JDBCUtility 
{
	static
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	public static Connection getDBConnection() throws SQLException
	{
		String url="jdbc:mysql://localhost:3306/teluskodb";
		String userName="root";
		String password="root";
		return DriverManager.getConnection(url,userName,password);
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
