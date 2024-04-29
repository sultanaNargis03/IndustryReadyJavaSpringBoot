package com.telusko.jdbc.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.telusko.jdbc.util.JdbcUtility;

public class LaunchJDBCUpdate {

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
				String query="UPDATE studentdetail set age=? where id=?";
				stmt=connect.prepareStatement(query);
			
				if(stmt!=null)
				{
					System.out.println("welcome");
					sc=new Scanner(System.in);
					System.out.println("Please enter your id");
					Integer id=sc.nextInt();
					System.out.println("Please enter your age to be updates");
					Integer age=sc.nextInt();
					stmt.setInt(1, id);
					stmt.setInt(2, id);
					
					int rowAffected=stmt.executeUpdate();
					if(rowAffected!=0)
						System.out.println("update successfull");
					else
						System.out.println("failed to update");
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
			try
			{
				JdbcUtility.closeResource(connect, stmt, rs);
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}

	}

}