package com.telusko.jdbc.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.telusko.jdbc.util.JdbcUtility;

public class LaunchJDBCInsert {

	public static void main(String[] args) throws SQLException 
	{

		Connection connect=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		Scanner sc=null;
		
		try
		{
			connect=JdbcUtility.getDBConnection();
			if(connect!=null)
			{
				String query="INSERT into studentdetail(id,name,age,gender)"
						+ "VALUES(?,?,?,?)";
				stmt=connect.prepareStatement(query);
			
			if(stmt!=null)
			{
				System.out.println("welcome");
				sc=new Scanner(System.in);
				System.out.println("Please enter your id");
				Integer id=sc.nextInt();
				System.out.println("Please enter your name");
				String name=sc.next();
				System.out.println("Please enter your age");
				Integer age=sc.nextInt();
				System.out.println("Please enter your gender");
				String gender=sc.next();
				
				stmt.setInt(1, id);
				stmt.setString(2, name);
				stmt.setInt(3, age);
				stmt.setString(4, gender);
				
				
				int rowAffected=stmt.executeUpdate();
				if(rowAffected!=0)
					System.out.println("Registration successfull");
				else
					System.out.println("Registration failed");
			}
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			JdbcUtility.closeResource(connect, stmt, rs);
		}

	}

}