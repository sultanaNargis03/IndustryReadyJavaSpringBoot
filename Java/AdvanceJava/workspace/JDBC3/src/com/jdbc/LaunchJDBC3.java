package com.jdbc;
import java.sql.*;
public class LaunchJDBC3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		// load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is registered");
				
		//Establish the connection
		String url="jdbc:mysql://localhost:3306/teluskodb";
		String userName="root";
		String password="root";
		
		Connection connect=DriverManager.getConnection(url, userName, password);
		System.out.println("connection established");
		
		Statement stmt=connect.createStatement();
		String query="UPDATE studentdetail set age=24 where id=1";
		//String query="DELETE from studentdetail where id=1";
		int rowAffected=stmt.executeUpdate(query);
		System.out.println("Query is fine!");
		if(rowAffected!=0)
			System.out.println("Check db! Data has been updated");
			//System.out.println("Deleted successfully!!");
		else
			System.out.println("fail to send");
			//System.out.println("failed to delete");
				
		connect.close();

	}

}
