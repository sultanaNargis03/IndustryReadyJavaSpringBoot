package com.jdbc;
import java.sql.*;
public class LaunchJDBC2 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		//load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is registered");
				
		//Establish the connection
		String url="jdbc:mysql://localhost:3306/teluskodb";
		String userName="root";
		String password="root";
				
		Connection connect=DriverManager.getConnection(url, userName, password);
		System.out.println("connection established");
				
		Statement stmt=connect.createStatement();
				
		//System.out.println("statement object is ready");
				
		String query="insert into studentdetail(id,name,age,gender)"
						+ "VALUES(1,'Nargis Sultana',25,'Female')";
		int rowAffected=stmt.executeUpdate(query);
		System.out.println("Query is fine!");
		if(rowAffected!=0)
			System.out.println("Check db! Data has been added");
		else
			System.out.println("fail to send");
				
		connect.close();
			
	}

}
